import { Component, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { SubjectService } from '../../services/subject';
import { Subject } from '../../interfaces/subject';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-subject',
  standalone : true,
  imports:[ReactiveFormsModule],
  templateUrl: './add-subject.html',
  styleUrls: ['./add-subject.css']
})
export class AddPatientComponent {

  @Output() patientCreated = new EventEmitter<Subject>();

  subjectForm: FormGroup;

  constructor(private fb: FormBuilder, private subjectService: SubjectService) {
    this.subjectForm = this.fb.group({
      subjectCode: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
      sex: ['', Validators.required]
    });
  }

  onSubmit(): void {
    if (this.subjectForm.valid) {
      const newPatient: Subject = this.subjectForm.value;
      this.subjectService.create(newPatient).subscribe({
        next: (patient) => this.patientCreated.emit(patient),
        error: (err) => console.error(err)
      });
    }
  }
}

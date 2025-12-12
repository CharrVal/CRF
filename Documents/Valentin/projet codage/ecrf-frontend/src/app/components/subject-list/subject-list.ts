import { Component, OnInit } from '@angular/core';
import { CommonModule, DatePipe } from '@angular/common';
import { RouterModule } from '@angular/router';
import { SubjectService } from '../../services/subject';
import { Subject } from '../../interfaces/subject';
import { AddPatientComponent } from '../add-subject/add-subject';

@Component({
  selector: 'app-subject-list',
  imports : [RouterModule, CommonModule, DatePipe, AddPatientComponent],
  templateUrl: './subject-list.html',
  styleUrls: ['./subject-list.css']
})
export class SubjectListComponent implements OnInit {

  subjects: Subject[] = [];
  showCreateForm: boolean = false;

constructor(private subjectService: SubjectService) { }

  ngOnInit(): void {
    this.loadSubjects();
  }

  loadSubjects(): void {
    this.subjectService.getAll().subscribe((data: Subject[]) => this.subjects = data);
  }

  toggleCreateForm(): void {
    this.showCreateForm = !this.showCreateForm;
  }

  onPatientCreated(newPatient: Subject): void {
    this.subjects.push(newPatient);
    this.showCreateForm = false;
  }
}

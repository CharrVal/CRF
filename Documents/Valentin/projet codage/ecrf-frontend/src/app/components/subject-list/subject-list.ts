import { Component, OnInit } from '@angular/core';
import { CommonModule, DatePipe } from '@angular/common';
import { RouterModule } from '@angular/router';
import { SubjectService } from '../../services/subject';
import { Subject } from '../../interfaces/subject';

@Component({
  selector: 'app-subject-list',
  imports : [RouterModule, CommonModule, DatePipe],
  templateUrl: './subject-list.html',
  styleUrls: ['./subject-list.css']
})
export class SubjectListComponent implements OnInit {
addPatient() {
throw new Error('Method not implemented.');
}
updatePatient() {
throw new Error('Method not implemented.');
}

subjects: Subject[] = [];

constructor(private subjectService: SubjectService) { }

  ngOnInit(): void {
    this.loadSubjects();
  }

  loadSubjects(): void {
    this.subjectService.getAll().subscribe((data: Subject[]) => this.subjects = data);
  }
}

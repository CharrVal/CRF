import { Study } from './study';

export interface Subject {
  idSubject: number;
  subjectCode: string;
  dateOfBirth: string;
  sex: string;
  studies?: Study[];
}

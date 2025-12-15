import { Subject } from './subject';

export interface Study {
  id: number;
  studyName: string;
  description?: string;

  startDate?: Date;
  endDate?: Date;

  subjects?: Subject[];
}
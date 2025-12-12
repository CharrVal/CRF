import { Routes } from '@angular/router';

import { Accueil } from './components/accueil/accueil';
import { Connexion } from './components/connexion/connexion';
import { SubjectListComponent } from './components/subject-list/subject-list';

export const routes: Routes = [
  { path: "accueil", component: Accueil },
  { path: "connexion", component: Connexion },
  { path: "subjects", component: SubjectListComponent },
  { path: "**", redirectTo: "/accueil" }
];

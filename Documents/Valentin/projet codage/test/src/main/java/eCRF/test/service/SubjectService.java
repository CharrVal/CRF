package eCRF.test.service;

import eCRF.test.entity.Subject;
import java.util.List;

public interface SubjectService {

    Subject createSubject(Subject subject);
    List<Subject> getAllSubjects();
    Subject updateSubject(Integer id, Subject subject);
    void deleteSubject(Integer id);
    Subject getById(Integer id);
}

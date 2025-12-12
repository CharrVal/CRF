package eCRF.test.service;

import eCRF.test.entity.Subject;
import eCRF.test.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository repository;

    public SubjectServiceImpl(SubjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Subject createSubject(Subject subject) {
        return repository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }

    @Override
    public Subject updateSubject(Integer id, Subject subjectToUpdate) {
        Subject existingSubject = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        existingSubject.setSubjectCode(subjectToUpdate.getSubjectCode());
        existingSubject.setDateOfBirth(subjectToUpdate.getDateOfBirth());
        existingSubject.setSex(subjectToUpdate.getSex());

        return repository.save(existingSubject);
    }

    @Override
    public void deleteSubject(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Subject getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found"));
    }
}

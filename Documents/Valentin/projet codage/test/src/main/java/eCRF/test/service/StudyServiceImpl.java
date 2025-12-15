package eCRF.test.service;

import eCRF.test.entity.Study;
import eCRF.test.repository.StudyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyServiceImpl implements StudyService {

    private final StudyRepository repository;

    public StudyServiceImpl(StudyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Study> getAllStudies() {
        return repository.findAll();
    }

    @Override
    public Study getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Study not found"));
    }

    @Override
    public Study createStudy(Study study) {
        return repository.save(study);
    }

    @Override
    public Study updateStudy(Integer id, Study studyToUpdate) {
        Study studyExisting = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Study not found"));

        studyExisting.setStudyName(studyToUpdate.getStudyName());
        studyExisting.setDescription(studyToUpdate.getDescription());
        studyExisting.setStartDate(studyToUpdate.getStartDate());
        studyExisting.setEndDate(studyToUpdate.getEndDate());
        studyExisting.setSubjects(studyToUpdate.getSubjects());

        return repository.save(studyExisting);
    }

    @Override
    public void deleteStudy(Integer id) {
        repository.deleteById(id);
    }
}


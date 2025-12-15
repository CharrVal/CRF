package eCRF.test.service;

import eCRF.test.entity.Study;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface StudyService {
    List<Study> getAllStudies();
    Study getById(Integer id);
    Study createStudy(Study study);
    Study updateStudy(Integer id, Study studyToUpdate);
    void deleteStudy(Integer id);
}

package eCRF.test.repository;

import eCRF.test.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Integer> {
    Study findByIdStudy(Integer id);
}

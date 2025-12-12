package eCRF.test.repository;

import eCRF.test.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository <Subject, Integer>{
    Subject findByIdSubject(Integer idSubject);
}

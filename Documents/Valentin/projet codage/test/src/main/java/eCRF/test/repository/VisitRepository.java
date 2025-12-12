package eCRF.test.repository;

import eCRF.test.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
    Visit findByIdVisit(Integer id);
}

package eCRF.test.service;
import eCRF.test.entity.Visit;
import java.util.List;

public interface VisitService {
    Visit createVisit(Visit visit);
    List<Visit> findAllVisits();
    Visit findByIdVisit(Integer id);
    Visit updateVisit(Integer id, Visit visit);
    void deleteVisitById(Integer id);
}

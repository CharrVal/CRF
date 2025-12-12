package eCRF.test.service;

import eCRF.test.entity.Visit;
import eCRF.test.repository.VisitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitService{

    private VisitRepository repository;

    @Override
    public Visit createVisit(Visit visit) {
        return repository.save(visit);
    }

    @Override
    public List<Visit> findAllVisits() {
        return repository.findAll();
    }

    @Override
    public Visit findByIdVisit(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("visit not found"));
    }

    @Override
    public Visit updateVisit(Integer id, Visit visitToUpdate) {
        Visit visitExisting = repository.findByIdVisit(id);

        visitExisting.setVisitDate(visitToUpdate.getVisitDate());
        visitExisting.setVisitType(visitToUpdate.getVisitType());
        return repository.save(visitExisting);
    }

    @Override
    public void deleteVisitById(Integer id) {
        repository.deleteById(id);
    }
}

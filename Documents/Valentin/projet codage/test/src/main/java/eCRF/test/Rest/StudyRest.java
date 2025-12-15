package eCRF.test.Rest;

import eCRF.test.entity.Study;
import eCRF.test.entity.Subject;
import eCRF.test.service.StudyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/studies")
public class StudyRest {
    private final StudyService service;

    public StudyRest(StudyService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Study>> getAll() {
        return ResponseEntity.ok(service.getAllStudies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Study> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<Study> create(@RequestBody Study study) {
        Study created = service.createStudy(study);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Study> update(
            @PathVariable Integer id,
            @RequestBody Study study
    ) {
        Study updated = service.updateStudy(id, study);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteStudy(id);
        return ResponseEntity.noContent().build();
    }

}

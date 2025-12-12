package eCRF.test.Rest;

import eCRF.test.entity.Subject;
import eCRF.test.service.SubjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectRest {

    private final SubjectService service;

    public SubjectRest(SubjectService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Subject>> getAll() {
        return ResponseEntity.ok(service.getAllSubjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<Subject> create(@RequestBody Subject subject) {
        Subject created = service.createSubject(subject);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subject> update(
            @PathVariable Integer id,
            @RequestBody Subject subject
    ) {
        Subject updated = service.updateSubject(id, subject);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteSubject(id);
        return ResponseEntity.noContent().build();
    }
}

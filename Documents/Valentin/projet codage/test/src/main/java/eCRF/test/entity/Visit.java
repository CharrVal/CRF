package eCRF.test.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idVisit;

    @Column(name = "visit_date", nullable = false)
    private LocalDate visitDate;

    @Column(name = "visit_type", length = 50)
    private String visitType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    public Visit(LocalDate visitDate, String visitType, Subject subject) {
        this.visitDate = visitDate;
        this.visitType = visitType;
        this.subject = subject;
    }
}


package eCRF.test.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSubject;
    private String subjectCode;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private String sex;

    @ManyToMany(mappedBy = "subjects")
    private List<Study> studies;

    public Subject(String subjectCode, Date dateOfBirth, String sex, List<Study> studies) {
        this.subjectCode = subjectCode;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.studies = studies;
    }

}
package eCRF.test.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @Column(name = "birth_date")
    private Date dateOfBirth;
    private String sex;


    public Subject(String subjectCode, Date dateOfBirth, String sex) {
        this.subjectCode = subjectCode;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

}
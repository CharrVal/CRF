package eCRF.test.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vital_signs")
public class VitalSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idVitalSign;

    private Integer weight;
    private Integer height;
    private Integer systolicPressure;
    private Integer diastolicPressure;
    private Integer heartRate;
    private Integer temperature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visit_id", nullable = false)
    private Visit visit;

    public VitalSign(Integer weight, Integer height, Integer systolicPressure, Integer diastolicPressure, Integer heartRate, Integer temperature, Visit visit) {
        this.weight = weight;
        this.height = height;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.visit = visit;
    }
}

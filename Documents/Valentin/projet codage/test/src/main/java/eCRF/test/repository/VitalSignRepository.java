package eCRF.test.repository;

import eCRF.test.entity.VitalSign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitalSignRepository extends JpaRepository<VitalSign, Integer> {
    VitalSign findByIdVitalSign(Integer id);
}

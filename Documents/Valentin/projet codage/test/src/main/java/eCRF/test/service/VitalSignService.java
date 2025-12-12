package eCRF.test.service;

import eCRF.test.entity.VitalSign;

import java.util.List;

public interface VitalSignService {
    void deleteById(Integer id);
    VitalSign findById(Integer id);
    VitalSign createVitalSign(VitalSign vitalSign);
    VitalSign updateVitalSign(Integer id, VitalSign vitalSign);
    List<VitalSign> findAllVitalSigns();
}

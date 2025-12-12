package eCRF.test.service;

import eCRF.test.entity.VitalSign;
import eCRF.test.repository.VitalSignRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignServiceImpl implements VitalSignService {

    private VitalSignRepository repository;

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public VitalSign findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("VitalSign not found"));
    }

    @Override
    public VitalSign createVitalSign(VitalSign vitalSign) {
        return repository.save(vitalSign);
    }

    @Override
    public VitalSign updateVitalSign(Integer id, VitalSign vitalSignToUpdate) {
        VitalSign vitalSignExisting = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vital Sign not found"));

        vitalSignExisting.setHeight(vitalSignToUpdate.getHeight());
        vitalSignExisting.setWeight(vitalSignToUpdate.getWeight());
        vitalSignExisting.setSystolicPressure(vitalSignToUpdate.getSystolicPressure());
        vitalSignExisting.setDiastolicPressure(vitalSignToUpdate.getDiastolicPressure());
        vitalSignExisting.setTemperature(vitalSignToUpdate.getTemperature());
        vitalSignExisting.setHeartRate(vitalSignToUpdate.getHeartRate());

        return repository.save(vitalSignExisting);
    }

    @Override
    public List<VitalSign> findAllVitalSigns() {
        return repository.findAll();
    }
}

package com.steve.patient_records;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Optional<Patient> getPatientById(Long id) {
        return repository.findById(id);
    }

    public List<Patient> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    public Patient addPatient(Patient patient) {
        return repository.save(patient);
    }

    public void deletePatient(Long id) {
        repository.deleteById(id);
    }

    public Optional<Patient> updatePatient(Long id, Patient updated) {
        return repository.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setAge(updated.getAge());
            existing.setDiagnosis(updated.getDiagnosis());
            return repository.save(existing);
        });
    }
}
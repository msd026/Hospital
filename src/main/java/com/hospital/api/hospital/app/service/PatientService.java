package com.hospital.api.hospital.app.service;


import com.hospital.api.hospital.app.entity.Patient;
import com.hospital.api.hospital.app.entity.dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
    public Patient postPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}

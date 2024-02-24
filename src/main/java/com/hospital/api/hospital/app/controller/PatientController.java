package com.hospital.api.hospital.app.controller;


import com.hospital.api.hospital.app.entity.Patient;
import com.hospital.api.hospital.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/v1")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/patient")
    private Patient PostPatient(@RequestBody Patient patient){

        return patientService.postPatient(patient);
    }

}

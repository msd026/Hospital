package com.hospital.api.hospital.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Data
public class PatientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientRecordId;
    private Date visitDate;
    private Time arrivalTime;
    private Time departureTime;

    @OneToMany(mappedBy = "patientRecord", cascade = CascadeType.ALL)
    private List<Diagnostic> diagnosticList;

    @OneToMany(mappedBy = "patientRecord", cascade = CascadeType.ALL)
    private List<Prescription> prescriptionList;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}


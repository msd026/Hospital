package com.hospital.api.hospital.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Diagnostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long diagnosticId;
    private String diagnosticName;
    private String diagnosticSeverity;

    @ElementCollection
    private List<String> commonDiagnosticPrescriptions;

    @ManyToOne
    @JoinColumn(name = "patient_record_id")
    private PatientRecord patientRecord;
}

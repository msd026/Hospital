package com.hospital.api.hospital.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prescriptionId;

    @NonNull
    private String prescriptionName;
    private String prescriptionType;

    @NonNull
    private String dosage;

    @ManyToOne
    @JoinColumn(name="patient_record_id", nullable = false)
    private PatientRecord patientRecord;
}

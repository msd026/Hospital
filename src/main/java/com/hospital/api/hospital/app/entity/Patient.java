package com.hospital.api.hospital.app.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<PatientRecord> patientRecords;
}


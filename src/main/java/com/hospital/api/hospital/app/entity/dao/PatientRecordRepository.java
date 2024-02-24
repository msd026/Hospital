package com.hospital.api.hospital.app.entity.dao;

import com.hospital.api.hospital.app.entity.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
}

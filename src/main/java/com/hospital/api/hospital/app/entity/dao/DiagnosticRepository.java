package com.hospital.api.hospital.app.entity.dao;

import com.hospital.api.hospital.app.entity.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticRepository extends JpaRepository<Diagnostic, Long> {

}

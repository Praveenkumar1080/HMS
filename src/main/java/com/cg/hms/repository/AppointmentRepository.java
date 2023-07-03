package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}

package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Prescribes;

@Repository
public interface PrescribesRepository extends JpaRepository<Prescribes, Integer>{

}

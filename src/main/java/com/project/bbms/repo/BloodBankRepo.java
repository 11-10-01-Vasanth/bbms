package com.project.bbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bbms.model.BloodBank;

@Repository
public interface BloodBankRepo extends JpaRepository<BloodBank, Long> {

}

package com.project.bbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bbms.model.BloodDonation;

@Repository
public interface BloodDonationRepo extends JpaRepository<BloodDonation, Long> {

}

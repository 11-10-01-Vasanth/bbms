package com.project.bbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bbms.model.BloodRequest;

@Repository
public interface BloodRequestRepo extends JpaRepository<BloodRequest, Long> {

}

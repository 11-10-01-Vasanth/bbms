package com.project.bbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bbms.model.BloodRequest;
import com.project.bbms.service.BloodRequestService;

@RestController
@RequestMapping("/bloodrequest")
public class BloodRequestController {

	@Autowired
	private BloodRequestService bloodRequestService;

	@PostMapping("/create")
	public ResponseEntity<BloodRequest> createBloodRequest(@RequestBody BloodRequest bloodRequest) {
		BloodRequest br = bloodRequestService.createBloodRequest(bloodRequest);
		System.out.println(br.getBloodBank().getBloodGroup()); // issue with this
		return ResponseEntity.status(HttpStatus.CREATED).body(br);
	}
}

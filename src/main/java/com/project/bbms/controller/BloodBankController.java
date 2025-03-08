package com.project.bbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bbms.model.BloodBank;
import com.project.bbms.service.BloodBankService;

@RestController
@RequestMapping("/bloodbank")
public class BloodBankController {
	@Autowired
	private BloodBankService bloodbankService;

	@PostMapping("/create")
	public ResponseEntity<BloodBank> createBloodBank(@RequestBody BloodBank bloodBank) {
		BloodBank br = bloodbankService.createBloodBank(bloodBank);
		return ResponseEntity.status(HttpStatus.CREATED).body(br);
	}
}

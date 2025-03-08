package com.project.bbms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bbms.model.BloodBank;
import com.project.bbms.repo.BloodBankRepo;
import com.project.bbms.service.BloodBankService;

@Service
public class BloodBankServiceImpl implements BloodBankService {
	
	@Autowired
	private BloodBankRepo bloodBankRepo;

	@Override
	public BloodBank createBloodBank(BloodBank bb) {
		return bloodBankRepo.save(bb);
	}

}

package com.project.bbms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bbms.model.BloodRequest;
import com.project.bbms.model.RequestStatus;
import com.project.bbms.repo.BloodRequestRepo;
import com.project.bbms.service.BloodRequestService;

@Service
public class BloodRequestServiceImpl implements BloodRequestService {

	@Autowired
	private BloodRequestRepo bloodRequestRepo;

	@Override
	public BloodRequest createBloodRequest(BloodRequest br) {
		br.setStatus(RequestStatus.PENDING);
//		System.out.println(br.getRequester().getId());
//		System.out.println(br.getBloodBank().getId());
		System.out.println(br.getCity());
		return bloodRequestRepo.save(br);
	}

}

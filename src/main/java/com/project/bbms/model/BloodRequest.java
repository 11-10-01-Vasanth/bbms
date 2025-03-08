package com.project.bbms.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "blood_requests")
public class BloodRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "requester_id", nullable = false)
	private User requester;

	@Enumerated(EnumType.STRING)
	private BloodGroup requiredBloodGroup;

	private int requestedUnits;

	private String city;
	private String hospitalName;
	private String hospitalAddress;

	private LocalDate requiredDate;
	private String contactNumber;
	private String emailId;

	@Enumerated(EnumType.STRING)
	private RequestStatus status = RequestStatus.PENDING;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "blood_bank_id")
	private BloodBank bloodBank;

	public BloodRequest() {
		super();
	}

//	public BloodRequest(Long id, User requester, BloodGroup requiredBloodGroup, int requestedUnits, String city,
//			String hospitalName, String hospitalAddress, LocalDate requiredDate, String contactNumber, String emailId,
//			BloodBank bloodBank) {
//		super();
//		this.id = id;
//		this.requester = requester;
//		this.requiredBloodGroup = requiredBloodGroup;
//		this.requestedUnits = requestedUnits;
//		this.city = city;
//		this.hospitalName = hospitalName;
//		this.hospitalAddress = hospitalAddress;
//		this.requiredDate = requiredDate;
//		this.contactNumber = contactNumber;
//		this.emailId = emailId;
//		this.status = RequestStatus.PENDING;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getRequester() {
		return requester;
	}

	public void setRequester(User requester) {
		this.requester = requester;
	}

	public BloodGroup getRequiredBloodGroup() {
		return requiredBloodGroup;
	}

	public void setRequiredBloodGroup(BloodGroup requiredBloodGroup) {
		this.requiredBloodGroup = requiredBloodGroup;
	}

	public int getRequestedUnits() {
		return requestedUnits;
	}

	public void setRequestedUnits(int requestedUnits) {
		this.requestedUnits = requestedUnits;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public LocalDate getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(LocalDate requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public BloodBank getBloodBank() {
		return bloodBank;
	}

	public void setBloodBank(BloodBank bloodBank) {
		this.bloodBank = bloodBank;
	}

	@Override
	public String toString() {
		return "BloodRequest [id=" + id + ", requester=" + requester + ", requiredBloodGroup=" + requiredBloodGroup
				+ ", requestedUnits=" + requestedUnits + ", city=" + city + ", hospitalName=" + hospitalName
				+ ", hospitalAddress=" + hospitalAddress + ", requiredDate=" + requiredDate + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", status=" + status + ", bloodBank=" + bloodBank + "]";
	}

}

package com.project.bbms.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "blood_donations")
public class BloodDonation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "donor_id", nullable = false)
    private User donor; // The user donating blood

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    private int donatedUnits;  // How many units donated

    private LocalDate donationDate;
    private LocalTime donationTime;

    private double bloodGlucoseLevel;
    private String notes;

    @Enumerated(EnumType.STRING)
    private DonationStatus status; // PENDING, APPROVED, REJECTED

    @ManyToOne
    @JoinColumn(name = "blood_bank_id")
    private BloodBank bloodBank;  // Link to Blood Inventory if approved

	public BloodDonation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getDonor() {
		return donor;
	}

	public void setDonor(User donor) {
		this.donor = donor;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getDonatedUnits() {
		return donatedUnits;
	}

	public void setDonatedUnits(int donatedUnits) {
		this.donatedUnits = donatedUnits;
	}

	public LocalDate getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(LocalDate donationDate) {
		this.donationDate = donationDate;
	}

	public LocalTime getDonationTime() {
		return donationTime;
	}

	public void setDonationTime(LocalTime donationTime) {
		this.donationTime = donationTime;
	}

	public double getBloodGlucoseLevel() {
		return bloodGlucoseLevel;
	}

	public void setBloodGlucoseLevel(double bloodGlucoseLevel) {
		this.bloodGlucoseLevel = bloodGlucoseLevel;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public DonationStatus getStatus() {
		return status;
	}

	public void setStatus(DonationStatus status) {
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
		return "BloodDonation [id=" + id + ", donor=" + donor + ", bloodGroup=" + bloodGroup + ", donatedUnits="
				+ donatedUnits + ", donationDate=" + donationDate + ", donationTime=" + donationTime
				+ ", bloodGlucoseLevel=" + bloodGlucoseLevel + ", notes=" + notes + ", bloodBank=" + bloodBank + "]";
	}
    
    
}


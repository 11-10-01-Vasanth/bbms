package com.project.bbms.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "blood_bank")
public class BloodBank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;

	private int unitsAvailable;

	private LocalDate lastUpdated;

	public BloodBank() {
		this.lastUpdated = LocalDate.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getUnitsAvailable() {
		return unitsAvailable;
	}

	public void setUnitsAvailable(int unitsAvailable) {
		if (unitsAvailable < 0) {
			throw new IllegalArgumentException("No units");
		}
		this.unitsAvailable = unitsAvailable;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void updateUnits(int units) {
		this.unitsAvailable += units;
		this.lastUpdated = LocalDate.now();
	}

	@Override
	public String toString() {
		return "BloodBank [id=" + id + ", bloodGroup=" + bloodGroup + ", unitsAvailable=" + unitsAvailable
				+ ", lastUpdated=" + lastUpdated + "]";
	}
}

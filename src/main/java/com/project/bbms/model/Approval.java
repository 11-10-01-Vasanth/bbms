package com.project.bbms.model;

import java.time.LocalDateTime;

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
@Table(name = "approvals")
public class Approval {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "request_id")
	private BloodRequest request; // Blood request being approved

	public Approval() {
		super();
	}

	@ManyToOne
	@JoinColumn(name = "donation_id")
	private BloodDonation donation; // Blood donation being approved

	@ManyToOne
	@JoinColumn(name = "approved_by", nullable = false)
	private User approvedBy; // Admin who approved/rejected

	@Enumerated(EnumType.STRING)
	private ApprovalStatus status; // APPROVED, REJECTED

	private String reason; // If rejected, reason

	private LocalDateTime approvedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BloodRequest getRequest() {
		return request;
	}

	public void setRequest(BloodRequest request) {
		this.request = request;
	}

	public BloodDonation getDonation() {
		return donation;
	}

	public void setDonation(BloodDonation donation) {
		this.donation = donation;
	}

	public User getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(User approvedBy) {
		this.approvedBy = approvedBy;
	}

	public ApprovalStatus getStatus() {
		return status;
	}

	public void setStatus(ApprovalStatus status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getApprovedAt() {
		return approvedAt;
	}

	public void setApprovedAt(LocalDateTime approvedAt) {
		this.approvedAt = approvedAt;
	}

	@Override
	public String toString() {
		return "Approval [id=" + id + ", request=" + request + ", donation=" + donation + ", approvedBy=" + approvedBy
				+ ", status=" + status + ", reason=" + reason + ", approvedAt=" + approvedAt + "]";
	}

}

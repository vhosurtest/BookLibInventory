package com.aryans.library.model;

import java.sql.Timestamp;

public class LicenseModel {
	Long licenseId;
	Long adminUserId;
	int maximumQty;
	Timestamp licenseStartDate;
	Timestamp licenseEndDate;
	int occupiedQty;
	String status;
	
	public Long getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(Long licenseId) {
		this.licenseId = licenseId;
	}
	public Long getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
	}
	public int getMaximumQty() {
		return maximumQty;
	}
	public void setMaximumQty(int maximumQty) {
		this.maximumQty = maximumQty;
	}
	public Timestamp getLicenseStartDate() {
		return licenseStartDate;
	}
	public void setLicenseStartDate(Timestamp licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}
	public Timestamp getLicenseEndDate() {
		return licenseEndDate;
	}
	public void setLicenseEndDate(Timestamp licensendDate) {
		this.licenseEndDate = licensendDate;
	}
	public int getOccupiedQty() {
		return occupiedQty;
	}
	public void setOccupiedQty(int occupiedQty) {
		this.occupiedQty = occupiedQty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Column names
	public static final String LICENSE_ID = "LICENSE_ID";
	public static final String USER_ID = "USER_ID";
	public static final String LICENSE_START_DATE = "LICENSE_START_DATE";
	public static final String LICENSE_END_DATE = "LICENSE_END_DATE";
	
	
}

package com.passport.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Application {
	private String applicationId;
	private String applicantName;
	private String applicantSurname;
	private String applicantGender;
	private Date applicantDateOfBirth;
	private String applicantPlaceOfBirth;
	private String applicantEmail;
	private Long applicantAadharNumber;
	private String applicantFatherName;
	private Long applicantMobileNumber;
	private Appointment appointment;
	private Payment payment;
	public Application()
	{
		
	}
	public Application(String applicationId, String applicantName, String applicantSurname, String applicantGender,
			Date applicantDateOfBirth, String applicantPlaceOfBirth, String applicantEmail, Long applicantAadharNumber,
			String applicantFatherName, Long applicantMobileNumber, Appointment appointment, Payment payment) {
		super();
		this.applicationId = applicationId;
		this.applicantName = applicantName;
		this.applicantSurname = applicantSurname;
		this.applicantGender = applicantGender;
		this.applicantDateOfBirth = applicantDateOfBirth;
		this.applicantPlaceOfBirth = applicantPlaceOfBirth;
		this.applicantEmail = applicantEmail;
		this.applicantAadharNumber = applicantAadharNumber;
		this.applicantFatherName = applicantFatherName;
		this.applicantMobileNumber = applicantMobileNumber;
		this.appointment = appointment;
		this.payment = payment;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantSurname() {
		return applicantSurname;
	}
	public void setApplicantSurname(String applicantSurname) {
		this.applicantSurname = applicantSurname;
	}
	public String getApplicantGender() {
		return applicantGender;
	}
	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}
	public Date getApplicantDateOfBirth() {
		return applicantDateOfBirth;
	}
	public void setApplicantDateOfBirth(Date applicantDateOfBirth) {
		this.applicantDateOfBirth = applicantDateOfBirth;
	}
	public String getApplicantPlaceOfBirth() {
		return applicantPlaceOfBirth;
	}
	public void setApplicantPlaceOfBirth(String applicantPlaceOfBirth) {
		this.applicantPlaceOfBirth = applicantPlaceOfBirth;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public Long getApplicantAadharNumber() {
		return applicantAadharNumber;
	}
	public void setApplicantAadharNumber(Long applicantAadharNumber) {
		this.applicantAadharNumber = applicantAadharNumber;
	}
	public String getApplicantFatherName() {
		return applicantFatherName;
	}
	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}
	public Long getApplicantMobileNumber() {
		return applicantMobileNumber;
	}
	public void setApplicantMobileNumber(Long applicantMobileNumber) {
		this.applicantMobileNumber = applicantMobileNumber;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}

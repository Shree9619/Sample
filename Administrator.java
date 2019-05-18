package com.passport.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Administrator {
	private List<Payment> allPaymentList;
	private List<Appointment> allAppointmentList;
	public Administrator()
	{
		
	}
	public Administrator(List<Payment> allPaymentList, List<Appointment> allAppointmentList) {
		super();
		this.allPaymentList = allPaymentList;
		this.allAppointmentList = allAppointmentList;
	}
	public List<Payment> getAllPaymentList() {
		return allPaymentList;
	}
	public void setAllPaymentList(List<Payment> allPaymentList) {
		this.allPaymentList = allPaymentList;
	}
	public List<Appointment> getAllAppointmentList() {
		return allAppointmentList;
	}
	public void setAllAppointmentList(List<Appointment> allAppointmentList) {
		this.allAppointmentList = allAppointmentList;
	}
	
	
 }

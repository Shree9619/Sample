package com.passport.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Appointment {
	
	private Date appointmentDateTime;
	private Application application;
	
	public Appointment()
	{
		
	}

	public Appointment(Date appointmentDateTime, Application application) {
		super();
		this.appointmentDateTime = appointmentDateTime;
		this.application = application;
	}

	public Date getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(Date appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
	
}

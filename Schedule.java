package com.passport.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Schedule {
	
	private Map<Date, List<Appointment>> scheduleMap;
	
	public Schedule()
	{
		
	}

	public Schedule(Map<Date, List<Appointment>> scheduleMap) {
		super();
		this.scheduleMap = scheduleMap;
	}

	public Map<Date, List<Appointment>> getScheduleMap() {
		return scheduleMap;
	}

	public void setScheduleMap(Map<Date, List<Appointment>> scheduleMap) {
		this.scheduleMap = scheduleMap;
	}
	

}

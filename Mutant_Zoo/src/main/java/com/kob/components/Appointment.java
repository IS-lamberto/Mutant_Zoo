package com.kob.components;

import java.time.LocalTime;

public class Appointment {
	
	// Declare Static variables
	
	private int appointmentId;
	private LocalTime time;
	private boolean attendance;

	// Declare Instance Variables 
	
	private Customer customer;
	private Experience experience;

	public Appointment() {}

	public Appointment(int appointmentId, LocalTime time, boolean attendance, Customer customer, Experience experience) {
		this.appointmentId = appointmentId;
		this.time = time;
		this.attendance = attendance;
		this.customer = customer;
		this.experience = experience;
	}

	
	// Declare getter and setter methods

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public boolean getAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

}

package com.kob.components;

import java.time.LocalDateTime;

public class Appointment {
	
	// Declare Static variables
	
	private int appointmentId;
	private LocalDateTime dateTime;
	private boolean attendance;

	// Declare Instance Variables 
	
	private Customer customer;
	private Experience experience;

	public Appointment() {}

	public Appointment(int appointmentId, LocalDateTime dateTime, boolean attendance, Customer customer, Experience experience) {
		this.appointmentId = appointmentId;
		this.dateTime = dateTime;
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

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
package com.kob.components;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Entity
@Table(name="t_appointment")
public class Appointment {
	
	// Declare Static variables
	@Id
	private int appointmentId;
	private LocalDateTime dateTime;
	private boolean attendance;

	// Declare Instance Variables 
	
	private int customerId;
	private int animalId;
	private int experienceId;

	// Used to format the date and time output
//	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public Appointment() {}

	public Appointment(int appointmentId, LocalDateTime dateTime, boolean attendance, int customerId, int animalId, int experienceId) {
		this.appointmentId = appointmentId;
		this.dateTime = dateTime;
		this.attendance = attendance;
		this.customerId = customerId;
		this.animalId = animalId;
		this.experienceId = experienceId;
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

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public boolean getAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public int getCustomer() {
		return customerId;
	}

	public void setCustomer(int customerId) {
		this.customerId = customerId;
	}

	public int getAnimal() {
		return animalId;
	}

	public void setAnimal(int animalId) {
		this.animalId = animalId;
	}

	public int getExperience() {
		return experienceId;
	}

	public void setExperience(int experienceId) {
		this.experienceId = experienceId;
	}

	@Override
	public String toString() {
		return "Appointment{" +
				"appointmentId=" + appointmentId +
				//", dateTime=" + timeFormatter.format(dateTime) +
				", attendance=" + attendance +
				", customer=" + customerId +
				", animal=" + animalId +
				", experience=" + experienceId +
				'}';
	}
}

package com.kob.components;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private List<Appointment> appointments = new ArrayList<>();

    public Zoo(){setup();}

    private void setup() {

        // Create and add first appointment
        LocalDateTime time1 = LocalDateTime.of(2021, 10, 8, 10, 30);
        Customer customer1 = new Customer(1,"Owen Lambert", 23, "07925881888", "owen.lambert@informed.com");
        Animal animal1 = new Animal(1,"Billy","Elephly","https://jackflacco.files.wordpress.com/2013/03/elephant-butterfly-by-saulinis.jpg");
        Experience experience1 = new Experience(1, LocalTime.of(2,0),500,true,"Playtime with the Elephlies");

        Appointment appointment1 = new Appointment(1,time1,true,customer1,animal1,experience1);
        this.appointments.add(appointment1);

        // Create and add second appointment
        LocalDateTime time2 = LocalDateTime.of(2022, 6, 10, 12, 0);
        Customer customer2 = new Customer(2,"Bradley Gee", 22, "07925881123", "bradley.gee@informed.com");
        Animal animal2 = new Animal(2,"Sammy","Sea-Rex","https://i.imgur.com/U7xmy4z.jpeg");
        Experience experience2 = new Experience(2, LocalTime.of(1,0),300,false,"Swim with Sea-Rexes");

        Appointment appointment2 = new Appointment(2,time2,false,customer2,animal2,experience2);
        this.appointments.add(appointment2);
    }

    public List<Appointment> getAppointments() { return this.appointments; }

    public Appointment getAppointmentById(int id) {
        Appointment output = null;
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == id) {
                output = appointment;
            } else {
                output = null;
            }
        }
        return output;
    }

    public void addAppointment(Appointment appointment) {
        System.out.println("Zoo.addAppointment(" + appointment.getAppointmentId() + ")");
        if (!this.appointments.contains(appointment)) {
            this.appointments.add(appointment);
        }
    }

    public void updateAppointment(Appointment updatedAppointment) {
        System.out.println("Zoo.updateAppointment(" + updatedAppointment + ")");
        Appointment originalAppointment = this.getAppointmentById(updatedAppointment.getAppointmentId());
        if (originalAppointment == null)
            throw new ZooException("Appointment with ID: " + updatedAppointment.getAppointmentId() + " not found");
        originalAppointment.setCustomer(updatedAppointment.getCustomer());
        originalAppointment.setAnimal(updatedAppointment.getAnimal());
        originalAppointment.setAttendance(updatedAppointment.getAttendance());
        originalAppointment.setExperience(updatedAppointment.getExperience());
        originalAppointment.setDateTime(updatedAppointment.getDateTime());
    }

    public void deleteAppointment(int id) {
        System.out.println("Zoo.deleteAppointment(" + id + ")");
        Appointment appointment = this.getAppointmentById(id);
        if (appointment != null)
            this.appointments.remove(appointment);
        else
            throw new ZooException("Appointment with id: " + id + " not found");
    }
}

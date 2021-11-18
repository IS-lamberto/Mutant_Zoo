package com.kob.components;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ZooAppOld {
    public static void main(String[] args) {

        ZooOld zoo = new ZooOld();

        System.out.println("=========================");
        System.out.println("Get all appointments");
        zoo.getAppointments().stream().forEach(b -> System.out.println(b));

        // Create and add third appointment
        LocalDateTime time3 = LocalDateTime.of(2022, 1, 5, 11, 0);
        Customer customer3 = new Customer(3,"Keith Domnick", 24, "0781412345", "keith.domnick@informed.com");
        Animal animal3 = new Animal(3,"Bobby","Boa Hen-stricter","https://www.thesun.co.uk/wp-content/uploads/2020/02/NINTCHDBPICT000563675336.jpg");
        Experience experience3 = new Experience(3, LocalTime.of(1,30),250,false,"Petting the Boa Hen-stricter");

        Appointment appointment3 = new Appointment(3,time3,false,customer3,animal3,experience3);
        System.out.println("=========================");
        System.out.println("Add new appointment and get it by the ID");
        zoo.addAppointment(appointment3);

        // Get new appointment
        System.out.println(zoo.getAppointmentById(3));

        // Update new appointment
        LocalDateTime updatedTime3 = LocalDateTime.of(2022, 3, 10, 11, 0);
        Customer updatedCustomer3 = new Customer(3,"Keith Domnick", 24, "0781412345", "keith.domnick@informed.com");
        Animal updatedAnimal3 = new Animal(3,"Bobby","Boa Hen-stricter","https://www.thesun.co.uk/wp-content/uploads/2020/02/NINTCHDBPICT000563675336.jpg");
        Experience updatedExperience3 = new Experience(3, LocalTime.of(1,30),250,true,"Petting the Boa Hen-stricter");

        System.out.println("=========================");
        System.out.println("Update the new appointment with a new time and extra");
        Appointment updatedAppointment = new Appointment(3,updatedTime3, false, updatedCustomer3, updatedAnimal3, updatedExperience3);
        zoo.updateAppointment(updatedAppointment);

        // Delete new appointment
        System.out.println("=========================");
        System.out.println("Delete the newly updated appointment");
        zoo.deleteAppointment(3);

        // Get all appointments again
        System.out.println("=========================");
        System.out.println("Get all appointments one more time");
        zoo.getAppointments().stream().forEach(b -> System.out.println(b));
    }
}

package com.kob.components;

import com.kob.components.DAO.AnimalDAO;
import com.kob.components.DAO.AppointmentDAO;
import com.kob.components.DAO.CustomerDAO;
import com.kob.components.DAO.ExperienceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Zoo {

    @Autowired
    private AnimalDAO animalRepo;
    private CustomerDAO customerRepo;
    private ExperienceDAO experienceRepo;
    private AppointmentDAO appointmentRepo;

    public List<Animal> getAnimals() {
        System.out.println("Zoo.getAllAnimals");
        Iterable<Animal> iterable = animalRepo.getAllAnimals();
        List<Animal> animals = new ArrayList<Animal>();
        for (Animal animal : iterable) {
            animals.add(animal);
        }
        return animals;
    }

    public void saveAnimal(Animal animal) {
        System.out.println("Zoo.saveAnimal(" + animal + ")");
        animalRepo.saveAnimal(animal);
    }

    public void deleteAnimal(Animal animal) {
        System.out.println("Zoo.deleteAnimal");
        animalRepo.deleteAnimal(animal);
    }

    public Animal getAnimalById(int id) {
        return animalRepo.getAnimalById(id);
    }

    public List<Customer> getCustomer() {
        System.out.println("Zoo.getAllCustomer");
        Iterable<Customer> iterable = customerRepo.getAllCustomers();
        List<Customer> customers = new ArrayList<Customer>();
        for (Customer customer : iterable) {
            customers.add(customer);
        }
        return customers;
    }

    public void saveCustomer(Customer customer) {
        System.out.println("Zoo.saveCustomer(" + customer + ")");
        customerRepo.saveCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        System.out.println("Zoo.deleteCustomer");
        customerRepo.deleteCustomer(customer);
    }

    public Customer getCustomerById(int id) {
        return customerRepo.getCustomerById(id);
    }

    public List<Experience> getExperience() {
        System.out.println("Zoo.getAllExperience");
        Iterable<Experience> iterable = experienceRepo.getAllExperiences();
        List<Experience> experiences = new ArrayList<Experience>();
        for (Experience experience : iterable) {
            experiences.add(experience);
        }
        return experiences;
    }

    public void saveExperience(Experience experience) {
        System.out.println("Zoo.saveExperience(" + experience + ")");
        experienceRepo.saveExperience(experience);
    }

    public void deleteExperience(Experience experience) {
        System.out.println("Zoo.deleteExperience");
        experienceRepo.deleteExperience(experience);
    }

    public Experience getExperienceById(int id) {
        return experienceRepo.getExperienceById(id);
    }

    public List<Appointment> getAppointment() {
        System.out.println("Zoo.getAllAppointment");
        Iterable<Appointment> iterable = appointmentRepo.getAllAppointments();
        List<Appointment> appointments = new ArrayList<Appointment>();
        for (Appointment appointment : iterable) {
            appointments.add(appointment);
        }
        return appointments;
    }

    public void saveAppointment(Appointment appointment) {
        System.out.println("Zoo.saveAppointment(" + appointment + ")");
        appointmentRepo.saveAppointment(appointment);
    }

    public void deleteAppointment(Appointment appointment) {
        System.out.println("Zoo.deleteAppointment");
        appointmentRepo.deleteAppointment(appointment);
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepo.getAppointmentById(id);
    }
}
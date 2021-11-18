package com.kob.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class ZooApp {
    public static void main(String [] args)  {
//        System.out.println("Starting Zoo setup");
        ConfigurableApplicationContext context = SpringApplication.run(ZooApp.class, args);
//        System.out.println("Setup finished");
//
        Zoo zoo = context.getBean(Zoo.class);
        
        
//        Animal animal1 = new Animal(1,"Billy","Elephly","https://jackflacco.files.wordpress.com/2013/03/elephant-butterfly-by-saulinis.jpg");
//        zoo.saveAnimal(animal1);
//
//        Animal animal2 = new Animal(2,"Sammy","Sea-Rex","https://i.imgur.com/U7xmy4z.jpeg");
//        zoo.saveAnimal(animal2);
//
//        System.out.println(zoo.getAnimals());
//
//        Animal animal3 = new Animal(3,"Bobby","Boa Hen-stricter","https://www.thesun.co.uk/wp-content/uploads/2020/02/NINTCHDBPICT000563675336.jpg");
//        zoo.saveAnimal(animal3);
//
//        Animal a3 = zoo.getAnimalById(3);
//        System.out.println(a3);
//
//        zoo.deleteAnimal(a3);
//        System.out.println("==============");
//        System.out.println(zoo.getAnimals());

        // Create and add first appointment
        LocalDateTime time1 = LocalDateTime.of(2021, 10, 8, 10, 30);
        // Customer customer1 = new Customer(1,"Owen Lambert", 23, "07925881888", "owen.lambert@informed.com");
        // zoo.saveCustomer(customer1);
        Animal animal1 = new Animal("Billy","Elephly","https://jackflacco.files.wordpress.com/2013/03/elephant-butterfly-by-saulinis.jpg");
        zoo.saveAnimal(animal1);
        // Experience experience1 = new Experience(1, LocalTime.of(2,0),500,true,"Playtime with the Elephlies");
        // zoo.saveExperience(experience1);

        // Appointment appointment1 = new Appointment(1,time1,true,customer1.getCustomerId(),animal1.getAnimalId(),experience1.getExperienceId());
        // zoo.saveAppointment(appointment1);
    }
}


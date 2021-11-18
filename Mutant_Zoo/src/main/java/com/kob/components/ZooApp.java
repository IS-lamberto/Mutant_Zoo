package com.kob.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZooApp {
    public static void main(String [] args)  {
        System.out.println("Starting Zoo setup");
        ConfigurableApplicationContext context = SpringApplication.run(ZooApp.class, args);
        System.out.println("Setup finished");

        Zoo zoo = context.getBean(Zoo.class);

        Animal animal1 = new Animal(1,"Billy","Elephly","https://jackflacco.files.wordpress.com/2013/03/elephant-butterfly-by-saulinis.jpg");
        zoo.saveAnimal(animal1);

        Animal animal2 = new Animal(2,"Sammy","Sea-Rex","https://i.imgur.com/U7xmy4z.jpeg");
        zoo.saveAnimal(animal2);

        System.out.println(zoo.getAnimals());

        Animal animal3 = new Animal(3,"Bobby","Boa Hen-stricter","https://www.thesun.co.uk/wp-content/uploads/2020/02/NINTCHDBPICT000563675336.jpg");
        zoo.saveAnimal(animal3);

        Animal a3 = zoo.getAnimalById(3);
        System.out.println(a3);

        zoo.deleteAnimal(a3);
        System.out.println("==============");
        System.out.println(zoo.getAnimals());
    }
}


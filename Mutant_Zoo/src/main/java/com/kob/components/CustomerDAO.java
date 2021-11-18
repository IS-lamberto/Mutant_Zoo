package com.kob.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalDAO {

    @Autowired
    private ZooRepository repo;

    public Animal getAnimalById(int id) {
        System.out.printf("AnimalDAO.getAnimalById(%s)\n", id);
        return repo.findById(id).orElseGet(null);
    }

    public Iterable<Animal> getAllAnimals() {
        System.out.println("AnimalDAO.getAllAnimals()");
        return repo.findAll();
    }

    public void saveAnimal(Animal animal) {
        System.out.printf("AnimalDAO.saveAnimal(%s)\n", animal);
        repo.save(animal);
    }

    public void deleteAnimal(Animal animal) {
        System.out.printf("BookDAO.deleteAnimal(%s)\n", animal);
        repo.delete(animal);
    }
}

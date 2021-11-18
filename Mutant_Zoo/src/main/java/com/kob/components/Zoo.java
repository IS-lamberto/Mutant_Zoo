package com.kob.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Zoo {

    @Autowired
    private AnimalDAO repo;

    public List<Animal> getAnimals() {
        System.out.println("Zoo.getAllAnimals");
        Iterable<Animal> iterable = repo.getAllAnimals();
        List<Animal> animals = new ArrayList<Animal>();
        for (Animal animal : iterable) {
            animals.add(animal);
        }
        return animals;
    }

    public void saveAnimal(Animal animal) {
        System.out.println("Zoo.saveAnimal(" + animal + ")");
        repo.saveAnimal(animal);
    }

    public void deleteAnimal(Animal animal) {
        System.out.println("Zoo.deleteAnimal");
        repo.deleteAnimal(animal);
    }

    public Animal getAnimalById(int id) {
        return repo.getAnimalById(id);
    }
}
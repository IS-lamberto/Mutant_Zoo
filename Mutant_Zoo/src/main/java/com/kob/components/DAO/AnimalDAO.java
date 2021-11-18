package com.kob.components.DAO;

import com.kob.components.Animal;
import com.kob.components.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalDAO {

    @Autowired
    private AnimalRepository repo;

   

    public Iterable<Animal> getAllAnimals() {
        System.out.println("AnimalDAO.getAllAnimals()");
        return repo.findAll();
    }

    public void saveAnimal(Animal animal) {
        System.out.printf("AnimalDAO.saveAnimal(%s)\n", animal);
        repo.save(animal);
    }

    public void deleteAnimal(Animal animal) {
        System.out.printf("AnimalDAO.deleteAnimal(%s)\n", animal);
        repo.delete(animal);
    }
}

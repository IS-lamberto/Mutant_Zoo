package com.kob.components.DAO;

import com.kob.components.Experience;
import com.kob.components.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExperienceDAO {

    @Autowired
    private ExperienceRepository repo3;

    public Experience getExperienceById(int id) {
        System.out.printf("ExperienceDAO.getExperienceById(%s)\n", id);
        return repo3.findById(id).orElseGet(null);
    }

    public Iterable<Experience> getAllExperiences() {
        System.out.println("ExperienceDAO.getAllExperiences()");
        return repo3.findAll();
    }

    public void saveExperience(Experience experience) {
        System.out.printf("ExperienceDAO.saveExperience(%s)\n", experience);
        repo3.save(experience);
    }

    public void deleteExperience(Experience experience) {
        System.out.printf("ExperienceDAO.deleteExperience(%s)\n", experience);
        repo3.delete(experience);
    }
}

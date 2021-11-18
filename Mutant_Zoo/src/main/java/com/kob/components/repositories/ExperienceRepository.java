package com.kob.components.repositories;

import com.kob.components.Experience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends CrudRepository<Experience, Integer> {}
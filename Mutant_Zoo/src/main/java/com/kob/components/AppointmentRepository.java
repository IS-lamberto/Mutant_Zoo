package com.kob.components;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooRepository extends CrudRepository<Animal, Integer> {}
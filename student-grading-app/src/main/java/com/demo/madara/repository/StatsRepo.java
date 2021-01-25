package com.demo.madara.repository;

import com.demo.madara.model.Result;
import com.demo.madara.model.Stats;
import org.springframework.data.repository.Repository;

import java.util.Set;


public interface StatsRepo extends Repository<Stats, Integer> {
    Set<Stats> findByCourseName(String courseName);
}

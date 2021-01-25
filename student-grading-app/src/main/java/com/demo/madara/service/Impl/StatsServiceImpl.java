package com.demo.madara.service.Impl;

import com.demo.madara.model.Result;
import com.demo.madara.model.Stats;
import com.demo.madara.repository.StatsRepo;
import com.demo.madara.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StatsServiceImpl implements StatsService {

    @Autowired
    StatsRepo statsRepo;
    @Override
    public Set<Stats> findStats(String courseName) {
        return statsRepo.findByCourseName(courseName);
    }
}

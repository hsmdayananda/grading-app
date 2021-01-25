package com.demo.madara.service;

import com.demo.madara.model.Stats;

import java.util.Set;

public interface StatsService {
    Set<Stats> findStats(String courseName);
}

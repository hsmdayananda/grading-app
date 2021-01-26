package com.demo.madara.service;

import com.demo.madara.model.Result;

import java.util.List;
import java.util.Set;

public interface ResultService {

    Set<Result> findResults(String userName);
    Set<Result> findAll();
}

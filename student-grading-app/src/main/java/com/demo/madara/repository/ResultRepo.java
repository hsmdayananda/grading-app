package com.demo.madara.repository;

import com.demo.madara.model.Result;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Set;

public interface ResultRepo extends Repository<Result, Integer> {
    Set<Result> findByUserNameOrderByAttemptAsc(String userName);
}

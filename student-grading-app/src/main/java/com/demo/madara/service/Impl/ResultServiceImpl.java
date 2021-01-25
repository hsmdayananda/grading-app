package com.demo.madara.service.Impl;

import com.demo.madara.model.Result;
import com.demo.madara.repository.ResultRepo;
import com.demo.madara.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    ResultRepo resultRepo;
    @Override
    public Set<Result> findResults(String userName) {
        Set<Result>  results =  resultRepo.findByUserNameOrderByAttemptAsc(userName);
        return results;
    }
}

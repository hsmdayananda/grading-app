package com.demo.madara.controller;

import com.demo.madara.model.Result;
import com.demo.madara.model.Stats;
import com.demo.madara.service.ResultService;
import com.demo.madara.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/demo-app")
public class GradingAppController {

    @Autowired
    ResultService resultService;

    @Autowired
    StatsService statsService;

    @RequestMapping(value = "/assignment",method = RequestMethod.GET)
    public Set<Result> fetchAllAssignmentRecords(
                                  @RequestParam(value = "username", required = true) String username
                                       ) {


        Set<Result> results = resultService.findResults(username);
        return results;

    }

    @RequestMapping(value = "/stats",method = RequestMethod.GET)
    public Set<Stats> fetchAllAssignmentStats(@RequestParam(value = "courseName", required = true) String courseName
    ) {


        Set<Stats> stats = statsService.findStats(courseName);
        return stats;

    }
}

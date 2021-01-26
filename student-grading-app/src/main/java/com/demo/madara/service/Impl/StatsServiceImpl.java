package com.demo.madara.service.Impl;

import com.demo.madara.model.Result;
import com.demo.madara.model.Stats;
import com.demo.madara.repository.StatsRepo;
import com.demo.madara.service.ResultService;
import com.demo.madara.service.StatsService;
import com.google.gson.JsonObject;
import com.oracle.javafx.jmx.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.json.*;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@EnableScheduling
public class StatsServiceImpl implements StatsService {

    @Autowired
    StatsRepo statsRepo;
    @Autowired
    ResultService resultService;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public Set<Stats> findStats(String courseName) {
      //  generateStatsRecordsForAssignment();
        return statsRepo.findByCourseName(courseName);
    }
    @Scheduled(fixedRate = 3600000)
    private  JsonObject generateStatsRecordsForAssignment(){
       Set<Result> results =  resultService.findAll();
        JsonObject statObject = new JsonObject();
       Set<String> assignmentIds = results.stream().map(Result::getAssignmentId).collect(Collectors.toSet());
        JsonObject finalStatObject = statObject;

       for (String id: assignmentIds){
           final int[] count = {0};
           final int[] timeSpent = {0};
           final int[] A = {0};
           final int[] B = {0};
           final int[] C = {0};
           final int[] D = {0};

           final int[] correct = {0};
           final int[] incorrect = {0};
           final int[] partially = {0};

           statObject =  results.stream().filter(f -> f.getAssignmentId().equals(id)).map(s ->
           {

               try {
                   JSONObject json = new JSONObject(s.getQuest());
                   String grade = json.getString("grade");
                   String status= json.getString("status");
                   timeSpent[0] = timeSpent[0] + json.getInt("timeSpent");

                   count[0] = (int) results.stream().filter(f -> f.getAssignmentId().equals(id)).count();

                   switch (grade){
                       case ("A"):
                           A[0]++;
                           break;
                       case ("B"):
                           B[0]++;
                           break;
                       case ("C"):
                           C[0]++;
                           break;
                       case ("D"):
                           D[0]++;
                           break;

                       default:
                           throw new RuntimeException(" Invalid Grade");
                   }

                   switch (status){
                       case ("correct"):
                           correct[0]++;
                           break;
                       case ("incorrect"):
                           incorrect[0]++;
                           break;
                       case ("partially"):
                           partially[0]++;
                           break;
                   }




               }catch (JSONException err){
                   throw new RuntimeException("Can not parse object to json,Invalid Json string "+ err.toString());
               }
               return finalStatObject;
           }).findFirst().get();
           StringBuilder sb = new StringBuilder();
           sb.append("{").append("\"A:\"").append(A[0]).append("\"B:\"").append(B[0]).append("\"C:\"").append(C[0]).append("\"D:\"").append(D[0]).append("}");
           finalStatObject.addProperty("grading",sb.toString());
           finalStatObject.addProperty("averageTimeSpent:",timeSpent[0]/count[0]);
           finalStatObject.addProperty("correct:",correct[0]);
           finalStatObject.addProperty("incorrect:",incorrect[0]);
           finalStatObject.addProperty("incorrect:",partially[0]);

           Stats stats = new Stats();
           stats.setAssignmentId(id);
           //need to pass assignmentId and get the courseName, hardcoded fornow
           stats.setCourseName("FIT");
           stats.setResultQuest(statObject.toString().replace("\\", ""));

           statsRepo.save(stats);

       }

       return statObject;

    }
}

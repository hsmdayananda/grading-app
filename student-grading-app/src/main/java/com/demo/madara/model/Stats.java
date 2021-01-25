package com.demo.madara.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "stats")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "course_name")
    String courseName;
    @Column(name = "assignment_id")
    String assignmentId;
    @Column(name = "result_quest")
    String resultQuest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getResultQuest() {
        return resultQuest;
    }

    public void setResultQuest(String resultQuest) {
        this.resultQuest = resultQuest;
    }
}

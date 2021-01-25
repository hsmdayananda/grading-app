package com.demo.madara.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stats")
public class Stats {
    String courseName;
    String assignmentId;
    //Stat
}

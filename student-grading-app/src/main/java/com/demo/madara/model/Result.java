package com.demo.madara.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "results")
public class Result {

    String userName;
    String assignmentId;
    // quest;
    int attempt;
}

package com.test.timesheetbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Timesheet {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "project_title")
    private String projectTitle;
    @Column(name = "task_title")
    private String taskTitle;
    @Column(name = "date_from")
    private String dateFrom;
    @Column(name = "date_to")
    private String dateTo;
    
    @ManyToOne @JoinColumn(name="status_id")
    private Status status;

    //JsonIgnoreProperties will ignore attribute "timesheetList" 
    //inside User Model if we request an API from timesheet controller,
    @JsonIgnoreProperties({"timesheetList"}) 
    @ManyToOne @JoinColumn(name="user_id")
    private User user;

    public Timesheet(int id,String projectTitle,String taskTitle,String dateFrom,String dateTo,Status status,User user)
    {
        this.id = id;
        this.projectTitle = projectTitle;
        this.taskTitle = taskTitle;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.status = status;
        this.user = user;
    }

    public Timesheet map(Object object) {
        return null;
    }
    
}

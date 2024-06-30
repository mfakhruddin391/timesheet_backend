package com.test.timesheetbackend.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="user_name")
    private String userName;

    public User(Integer id,String userName)
    {
        this.id = id;
        this.userName = userName;
    }

    //JsonIgnoreProperties will ignore attribute "user" inside Timesheet Model (timesheetList) if we request an API from User controller,
    //if we need to request User and its timesheet (1-to-M), make sure to ignore user properties inside timesheetList
    //because this will avoid a loop.
    //Any reference table such as "StakeholderType" table doesn't need to know its child since it is reference table
    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Timesheet> timesheetList;
}

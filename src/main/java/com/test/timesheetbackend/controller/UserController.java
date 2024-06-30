package com.test.timesheetbackend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.User;
import com.test.timesheetbackend.service.UserSO;

// @CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@Controller
@RequestMapping(path="api/user")
public class UserController {

    private UserSO userSO;

    UserController(UserSO userSO){
        this.userSO = userSO;
    
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> all(){
        return userSO.findAll();
    }
}

package com.test.timesheetbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.Status;
import com.test.timesheetbackend.service.StatusSO;

// @CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@Controller
@RequestMapping(path="api/status")
public class StatusController {

    private StatusSO statusSO;

    StatusController(StatusSO statusSO){
        this.statusSO = statusSO;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Status> all(){
        return statusSO.findAll();
    }

}

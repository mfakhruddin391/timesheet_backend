package com.test.timesheetbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.Status;
import com.test.timesheetbackend.entity.Timesheet;
import com.test.timesheetbackend.service.StatusSO;
import com.test.timesheetbackend.service.TimesheetSO;
import com.test.timesheetbackend.service.UserSO;

// @CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@Controller
@RequestMapping(path="api/timesheet")
public class TimesheetController {
    
    private TimesheetSO timesheetSO;
   
   TimesheetController(TimesheetSO timesheetSO) {
        this.timesheetSO = timesheetSO;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Timesheet> all(){
        return timesheetSO.findAllByOrderByDateFrom();
    }

    @GetMapping(path="/findbytask-title/{task_title}")
    public @ResponseBody Iterable<Timesheet> byTaskTitle(@PathVariable String task_title){
        return timesheetSO.findByTaskTitleContaining(task_title);
    }

    @PostMapping(path="/createTimesheet")
    public @ResponseBody Timesheet createTimesheet(@RequestBody Timesheet timesheet){
    
        return timesheetSO.save(timesheet);
    }

    @GetMapping(path="/findTimesheet-byid/{id}")
    public @ResponseBody Timesheet findById(@PathVariable int id){
      
        return timesheetSO.findById(id);
    }

    @PutMapping(path="/updateTimesheet-byid/{id}")
    @ResponseBody Timesheet replaceTimesheet(@RequestBody Timesheet newTimesheet){
        
        Timesheet ts = timesheetSO.findById(newTimesheet.getId());
        ts.setProjectTitle(newTimesheet.getProjectTitle());
        ts.setTaskTitle(newTimesheet.getTaskTitle());
        ts.setDateFrom(newTimesheet.getDateFrom());
        ts.setDateTo(newTimesheet.getDateTo());
        ts.setStatus(newTimesheet.getStatus());
        ts.setUser(newTimesheet.getUser());
        System.out.println(newTimesheet);

        return timesheetSO.save(ts);
        }

     @DeleteMapping(path="/deleteTimesheet-byid/{id}")   
     public @ResponseBody Timesheet deleteTimesheet(@PathVariable int id)
     {
       return timesheetSO.deleteById(id);
     }

    }

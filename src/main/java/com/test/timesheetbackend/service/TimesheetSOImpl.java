package com.test.timesheetbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.timesheetbackend.entity.Timesheet;
import com.test.timesheetbackend.repository.TimesheetRepository;

@Service
public class TimesheetSOImpl implements TimesheetSO {

    @Autowired
    private final TimesheetRepository timesheetRepository;
    
    
    TimesheetSOImpl(TimesheetRepository timesheetRepository){

        this.timesheetRepository = timesheetRepository;

    }

    @Override
    public List<Timesheet> findByTaskTitleContaining(String taskTitle) {
       return this.timesheetRepository.findByTaskTitleContaining(taskTitle);
    }

    @Override
    public Timesheet findById(int id) {
      return this.timesheetRepository.findById(id);
    }

    @Override
    public Timesheet deleteById(int id) {
        return this.timesheetRepository.deleteById(id);
    }

    @Override
    public List<Timesheet> findAllByOrderByDateFrom() {
       return this.timesheetRepository.findAllByOrderByDateFrom();
    }
    
    @Override
    public Timesheet save(Timesheet timesheet){
        return this.timesheetRepository.save(timesheet);
    }
    
}

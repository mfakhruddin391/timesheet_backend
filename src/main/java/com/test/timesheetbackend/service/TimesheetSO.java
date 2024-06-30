package com.test.timesheetbackend.service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.timesheetbackend.entity.Timesheet;

import java.util.List;


public interface TimesheetSO {

    List<Timesheet> findByTaskTitleContaining(String taskTitle);
    Timesheet findById(int id);
    Timesheet deleteById(int id);
    List<Timesheet> findAllByOrderByDateFrom();
    Timesheet save(Timesheet timesheet);
}

package com.test.timesheetbackend.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.timesheetbackend.entity.Timesheet;

import java.util.List;

public interface TimesheetRepository extends CrudRepository<Timesheet,Integer> {

    List<Timesheet> findByTaskTitleContaining(String taskTitle);
    Timesheet findById(int id);
    Timesheet deleteById(int id);
    List<Timesheet> findAllByOrderByDateFrom();
}

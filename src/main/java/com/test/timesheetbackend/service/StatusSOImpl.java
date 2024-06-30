package com.test.timesheetbackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.timesheetbackend.entity.Status;
import com.test.timesheetbackend.repository.StatusRepository;

@Service
public class StatusSOImpl implements StatusSO {

    @Autowired
    private final StatusRepository statusRepository;

    StatusSOImpl(StatusRepository statusRepository){

        this.statusRepository = statusRepository;

    }

    @Override
    public Iterable<Status> findAll() {
        // TODO Auto-generated method stub
        return this.statusRepository.findAll();
    }
}

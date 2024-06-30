package com.test.timesheetbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.StakeholderGeneral;
import com.test.timesheetbackend.repository.StakeholderGeneralRepository;

@Service
public class StakeholderGeneralSOImpl implements StakeholderGeneralSO {


    StakeholderGeneralRepository repository;

    StakeholderGeneralSOImpl(StakeholderGeneralRepository repository){
        this.repository = repository;
    }


    @Override
    public Iterable<StakeholderGeneral> findAll() {
      return this.repository.findAll();
    }


    @Override
    public List<StakeholderGeneral> findAllV2() {
      
      
      return (List<StakeholderGeneral>) this.repository.findAll();
    }

    

}

package com.test.timesheetbackend.service;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.StakeholderGeneral;

public interface StakeholderGeneralSO {

    @ResponseBody Iterable<StakeholderGeneral> findAll();

    @ResponseBody List<StakeholderGeneral> findAllV2();
    
}

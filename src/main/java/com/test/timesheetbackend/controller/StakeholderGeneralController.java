package com.test.timesheetbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.StakeholderGeneral;
import com.test.timesheetbackend.entity.Timesheet;
import com.test.timesheetbackend.service.StakeholderGeneralSO;


import model.StakeholderDetailModel;
import model.StakeholderGeneralNewModel;
import model.StakeholderTypeModel;
import model.StakeholderGeneralModel;

@Controller
@RequestMapping(path="api/stakeholderGeneral")
public class StakeholderGeneralController {
    
    StakeholderGeneralSO stakeholderGeneralSO;

    StakeholderGeneralController(StakeholderGeneralSO stakeholderGeneralSO){

        this.stakeholderGeneralSO = stakeholderGeneralSO;
    }

    @GetMapping(path="/findAll")
    public @ResponseBody Iterable<StakeholderGeneral> findAll(){
        return stakeholderGeneralSO.findAll();
    }

    @GetMapping(path="/findByStakeholders")
    public @ResponseBody StakeholderGeneralNewModel findByStakeholders(){
        StakeholderGeneralNewModel stakeholderModel = new StakeholderGeneralNewModel();
        List<StakeholderDetailModel> stakeholderDetailModel = new ArrayList<StakeholderDetailModel>();
        
        List<StakeholderGeneral> stakeholderGeneralModel = stakeholderGeneralSO.findAllV2();

    

        stakeholderGeneralModel.forEach((res) -> {
            if(res.getStakeHolderType().getStakeholderType().equals("feror")) {

            } else {

                StakeholderTypeModel stakeholderTypeModel = new StakeholderTypeModel();
                stakeholderTypeModel.setEntityToModel(res.getStakeHolderType());
                
                StakeholderDetailModel addingNewStakeholder = new StakeholderDetailModel();
                addingNewStakeholder.setId(res.getId());
                addingNewStakeholder.setStakeholderType(stakeholderTypeModel);
                addingNewStakeholder.setName(res.getName());
                addingNewStakeholder.setTotalShare(res.getStakeholder().getTotalShare());
                stakeholderDetailModel.add(addingNewStakeholder);
                // stakeholderModel.setStakeholders(stakeholderDetailModel);
            }
         
        });
        stakeholderModel.setStakeholders(stakeholderDetailModel);

        return stakeholderModel;
    }

    @GetMapping(path="/findTest")
    public @ResponseBody  List<StakeholderGeneral> findTest(){

        List<StakeholderGeneral> stakeholderGeneralModel = stakeholderGeneralSO.findAllV2();
        return stakeholderGeneralModel;
    }


}

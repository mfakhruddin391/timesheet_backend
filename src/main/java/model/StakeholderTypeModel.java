package model;
import com.test.timesheetbackend.entity.StakeholderType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StakeholderTypeModel {

    private Integer id;
    private String stakeholderType;
    private String stakeholderDesc;

    public void setEntityToModel(StakeholderType stakeholderType){

        this.id = stakeholderType.getId();
        this.stakeholderType = stakeholderType.getStakeholderType();
        this.stakeholderDesc = stakeholderType.getStakeholderDesc();
    }
}

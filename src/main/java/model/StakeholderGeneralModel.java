package model;

import com.test.timesheetbackend.entity.Feror;
import com.test.timesheetbackend.entity.Stakeholder;
import com.test.timesheetbackend.entity.StakeholderType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StakeholderGeneralModel {

    private Integer id;
    private String name;
    private StakeholderType stakeHolderType;
    private Integer informationGatheringId;
    private Feror feror;
    private Stakeholder stakeholder;
}

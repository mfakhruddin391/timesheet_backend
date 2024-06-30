package model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class StakeholderGeneralNewModel {

    @Getter @Setter
    private List<StakeholderDetailModel> stakeholders;

    // private List<StakeholderDetailModel> lease;
    // private List<StakeholderDetailModel> smallLease;
    // private List<StakeholderDetailModel> rental;
    // private List<StakeholderDetailModel> other;

    private List<StakeholderDetailModel> filterStakeholder(String stakeholderType){
        List<StakeholderDetailModel> filteredLease = new ArrayList<StakeholderDetailModel>();

        stakeholders.forEach((res) -> {

            if(((StakeholderDetailModel) res).getStakeholderType().getStakeholderType().equals(stakeholderType)){
                filteredLease.add((StakeholderDetailModel) res);
            }
        });
        return filteredLease;


    }


    public List<StakeholderDetailModel> getLease(){
    return  this.filterStakeholder("lease");
    }

    public List<StakeholderDetailModel> getSmallLease(){
    return  this.filterStakeholder("smallLease");
    }

    public List<StakeholderDetailModel> getRental(){
    return  this.filterStakeholder("rental");
    }

    public List<StakeholderDetailModel> getOther(){
    return  this.filterStakeholder("other");
    }
    
}

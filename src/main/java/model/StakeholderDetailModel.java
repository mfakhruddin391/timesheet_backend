package model;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StakeholderDetailModel {
    private Integer id;
    private StakeholderTypeModel stakeholderType;
    private String name;
    private String totalShare = "0";
}

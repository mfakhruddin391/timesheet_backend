package com.test.timesheetbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class StakeholderGeneral {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="STR_NAME")
    private String name;

    @ManyToOne @JoinColumn(name="FK_STAKEHOLDER_TYPE_ID")
    private StakeholderType stakeHolderType;

    @Column(name="INFORMATION_GATHERING_ID")
    private Integer informationGatheringId;

    @OneToOne(mappedBy = "stakeholderGeneral")
    @PrimaryKeyJoinColumn
    @JsonIgnoreProperties({"stakeholderGeneral"})
    private Feror feror;
    
    @OneToOne(mappedBy = "stakeholderGeneral")
    @PrimaryKeyJoinColumn
    @JsonIgnoreProperties({"stakeholderGeneral"})
    private Stakeholder stakeholder;
}

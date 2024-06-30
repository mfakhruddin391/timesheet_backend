package com.test.timesheetbackend.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Stakeholder {
    @Id
    @Column(name = "stakeholderGeneral_id")
    private Integer id;
    
    @Column(name="INT_TOTAL_SHARE")
    private String totalShare;

    @OneToOne @JoinColumn(name = "stakeholderGeneral_id",referencedColumnName = "id")
    @JsonIgnoreProperties({"stakeholder"})
    private StakeholderGeneral stakeholderGeneral;

}

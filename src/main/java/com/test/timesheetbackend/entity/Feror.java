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
public class Feror {

    @Id
    @Column(name = "stakeholderGeneral_id")
    private Integer id;
    
    @Column(name="STR_NO_KP")
    private String noKp;

    @Column(name="ADDRESS1")
    private String address1;

    @Column(name="ADDRESS2")
    private String address2;

    @Column(name="ADDRESS3")
    private String address3;

    @OneToOne
    @JoinColumn(name = "stakeholderGeneral_id",referencedColumnName = "id")
    @JsonIgnoreProperties({"feror"})
    private StakeholderGeneral stakeholderGeneral;
}

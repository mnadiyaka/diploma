package com.uni.diploma.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "characteristics")
@Data
public class Characteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ch_id")
    private String id;

    @Column(name = "ch_name")
    private String name;

    @OneToMany(mappedBy = "characteristics")
    private List<SubCh> subs = new java.util.ArrayList<>();

}

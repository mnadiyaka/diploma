package com.uni.diploma.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "sub_ch")
@Data
public class SubCh {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sub_ch_id")
    private String id;

    @Column
    private String sub_text;

    @ManyToOne
    private Characteristics characteristics;

    @OneToMany(mappedBy = "subChAttribute")
    private List<Attributes> attributes = new java.util.ArrayList<>();
}

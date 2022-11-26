package com.uni.diploma.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "internal_types")
@Data
public class Types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "in_type_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "internal")
    private boolean internal;

    @ManyToMany
    @JoinTable(name = "types_with_attributes", joinColumns = @JoinColumn(name = "in_type_id"), inverseJoinColumns = @JoinColumn(name = "at_id"))
    @Column
    List<Attributes> attributes;

    public Types(String name, boolean internal, List<Attributes> attributes) {
        this.name = name;
        this.internal = internal;
        this.attributes = attributes;
    }

    public Types() {

    }
}

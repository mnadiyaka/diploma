package com.uni.diploma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "attribute")
public class Attributes implements Comparable<Attributes> {

    @Id
    @Column(name = "at_id")
    private String id;

    @Column
    private String attribute_text;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "sub_ch_attribute", referencedColumnName = "sub_ch_id")
    private SubCh subChAttribute;

    @Column
    private boolean internal;

    @Column
    private boolean external;

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "attributes", cascade = CascadeType.DETACH)
    List<Types> types;

    @Override
    public int compareTo(Attributes other) {
        return this.getId().compareTo(other.getId());
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id='" + id + '\'' +
                ", attribute_text='" + attribute_text + '\'' +
                ", internal=" + internal +
                ", external=" + external +
                '}';
    }
}

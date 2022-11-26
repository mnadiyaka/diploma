package com.uni.diploma.repository;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.entity.SubCh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, String> {
}

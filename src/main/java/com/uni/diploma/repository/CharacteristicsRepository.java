package com.uni.diploma.repository;

import com.uni.diploma.entity.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsRepository extends JpaRepository<Characteristics, String> {
}

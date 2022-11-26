package com.uni.diploma.repository;

import com.uni.diploma.entity.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesRepository extends JpaRepository<Types, Integer> {
}

package com.uni.diploma.repository;

import com.uni.diploma.entity.SubCh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubChsRepository extends JpaRepository<SubCh, String> {
}

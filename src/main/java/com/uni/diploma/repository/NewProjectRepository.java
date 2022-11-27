package com.uni.diploma.repository;

import com.uni.diploma.entity.NewProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewProjectRepository extends JpaRepository<NewProject, Integer> {
}

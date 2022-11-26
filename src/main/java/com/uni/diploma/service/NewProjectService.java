package com.uni.diploma.service;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.entity.NewProject;

import java.util.Set;

public interface NewProjectService {

    Set<Attributes> findSuitableAttributes(NewProject newProject);
}

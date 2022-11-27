package com.uni.diploma.service;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.entity.NewProject;

import java.util.Set;

public interface NewProjectService {

    Set<Attributes> findAllSuitableAttributes(NewProject newProject);

    Set<Attributes> findCommonAttributes(NewProject newProject);

    Set<Attributes> findUniqueInnerAttributes(NewProject newProject);

    Set<Attributes> findUniqueExternalAttributes(NewProject newProject);

}

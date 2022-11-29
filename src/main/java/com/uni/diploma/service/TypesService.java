package com.uni.diploma.service;

import com.uni.diploma.entity.Types;

import java.util.List;

public interface TypesService {

    Types findById(int id);

    void createType(String name, boolean internal);

    void addAttributeType(int id, List<String> ids);
}

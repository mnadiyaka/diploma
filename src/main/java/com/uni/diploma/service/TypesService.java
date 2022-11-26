package com.uni.diploma.service;

import com.uni.diploma.entity.Types;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TypesService {

    Types findById(int id);

    void createType(String name, boolean internal);

    void addAttributeType(int id, List<String> ids);
}

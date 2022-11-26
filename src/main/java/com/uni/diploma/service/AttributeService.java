package com.uni.diploma.service;

import com.uni.diploma.entity.Attributes;
import org.springframework.stereotype.Service;

public interface AttributeService {

    Attributes findById(String id);
}

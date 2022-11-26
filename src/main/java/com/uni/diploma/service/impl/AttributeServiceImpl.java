package com.uni.diploma.service.impl;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.repository.AttributesRepository;
import com.uni.diploma.service.AttributeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class AttributeServiceImpl implements AttributeService {

    private final AttributesRepository attributesRepository;

    @Override
    public Attributes findById(String id) {
        return attributesRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }
}

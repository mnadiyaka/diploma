package com.uni.diploma.service.impl;

import com.uni.diploma.entity.Types;
import com.uni.diploma.repository.TypesRepository;
import com.uni.diploma.service.AttributeService;
import com.uni.diploma.service.TypesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TypesServiceImpl implements TypesService {

    private final TypesRepository typesRepository;

    private final AttributeService attributeService;

    @Override
    public Types findById(int id) {
        return typesRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public void createType(String name, boolean internal) {
        typesRepository.save(new Types(name, internal, new ArrayList<>()));
    }

    @Override
    public void addAttributeType(int id, List<String> ids) {
        Types type = findById(id);
        ids.stream().forEach(el -> type.getAttributes().add(attributeService.findById(el)));
        typesRepository.save(type);
    }
}

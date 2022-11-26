package com.uni.diploma.service.impl;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.entity.NewProject;
import com.uni.diploma.entity.Types;
import com.uni.diploma.repository.TypesRepository;
import com.uni.diploma.service.NewProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NewProjectServiceImpl implements NewProjectService {

    TypesRepository typesRepository;

    @Override
    public Set<Attributes> findSuitableAttributes(NewProject newProject) {
        List<Types> types = typesRepository.findAll();
        String[] myDescription = (newProject.getDescription() + " " + newProject.getName()).toLowerCase().split(" ");

        types = types.stream().filter(type -> Arrays.stream(myDescription)
                        .filter(word -> type.getName().toLowerCase().contains((word.length() < 6 ? word.substring(1, word.length() - 1) : word.substring(1, word.length() - 3))))
                        .count() > 0)
                .collect(Collectors.toList());

        Set<Attributes> myAttributes = new TreeSet<>();
        for (Types type : types) {
            type.getAttributes().stream().forEach(el -> myAttributes.add(el));
        }
        return myAttributes;
    }
}

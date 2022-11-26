package com.uni.diploma.controller;

import com.uni.diploma.entity.Attributes;
import com.uni.diploma.entity.NewProject;
import com.uni.diploma.service.NewProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("findBest")
public class NewProjectController {

    NewProjectService newProjectService;

    @GetMapping()
    public Set<Attributes> create(@RequestBody NewProject newProject) {
        return newProjectService.findSuitableAttributes(newProject);

    }
}

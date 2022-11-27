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

    @GetMapping("/all")
    public Set<Attributes> findAll(@RequestBody NewProject newProject) {
        return newProjectService.findAllSuitableAttributes(newProject);
    }

    @GetMapping("/common")
    public Set<Attributes> findCommon(@RequestBody NewProject newProject) {
        return newProjectService.findCommonAttributes(newProject);
    }

    @GetMapping("/inner")
    public Set<Attributes> findInner(@RequestBody NewProject newProject) {
        return newProjectService.findUniqueInnerAttributes(newProject);
    }

    @GetMapping("/external")
    public Set<Attributes> findExternal(@RequestBody NewProject newProject) {
        return newProjectService.findUniqueExternalAttributes(newProject);
    }
}

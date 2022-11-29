package com.uni.diploma.controller;

import com.uni.diploma.entity.Types;
import com.uni.diploma.service.TypesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class TypesController {

    private TypesService typesService;

    @GetMapping("/{id}")
    public Types getType(@PathVariable int id) {
        return typesService.findById(id);
    }

    @PostMapping("/create-{internal}")
    public String createTepe(@RequestBody String name, @PathVariable boolean internal) {
        typesService.createType(name, internal);
        return "created";
    }

    @PatchMapping("/add-{id}")
    public String addAttributes(@PathVariable int id, @RequestBody String list) {
        list = list.trim();
        list = list.replace(" ,", ",");
        list = list.replace(", ", ",");
        List<String> nList = List.of(list.split(","));
        typesService.addAttributeType(id, nList);
        return "added";
    }
}

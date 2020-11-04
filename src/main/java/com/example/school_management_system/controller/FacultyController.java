package com.example.school_management_system.controller;

import com.example.school_management_system.entity.Faculty;
import com.example.school_management_system.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    FacultyService facultyService;

    @PostMapping("/addFaculty")
    public Faculty addFaculty(@RequestBody Faculty faculty){
        return facultyService.saveFaculty(faculty);
    }

    @PostMapping("/addFaculties")
    public List<Faculty> addFaculties(@RequestBody List<Faculty>faculties){
        return facultyService.saveFaculties(faculties);
    }

    @GetMapping("/faculties")
    public List<Faculty> getAllFaculties(){
        return facultyService.getFaculties();
    }

    @GetMapping("/faculty/{name}")
    public Faculty getFacultyByName(@PathVariable String name){
        return facultyService.getFacultyByName(name);
    }

    @GetMapping("/faculty/id")
    public Faculty getFacultyById(@PathVariable String id){
        return facultyService.getFacultyById(id);
    }

    @PutMapping("/updateFaculty")
    public Faculty updateFaculty(@PathVariable Faculty faculty){
        return facultyService.updateFaculty(faculty);
    }

    @DeleteMapping("/deleteFaculty/{id}")
    public String deleteFacultyById(@PathVariable String id){
        return facultyService.deleteFaculty(id);
    }
}

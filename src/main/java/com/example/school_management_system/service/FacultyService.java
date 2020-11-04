package com.example.school_management_system.service;

import com.example.school_management_system.entity.Faculty;
import com.example.school_management_system.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacultyService {
    @Autowired
    FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

    public List<Faculty> saveFaculties(List<Faculty> faculties){
        return facultyRepository.saveAll(faculties);
    }
    public List<Faculty> getFaculties(){
        return facultyRepository.findAll();
    }

    public Faculty getFacultyById(String registration){
        return facultyRepository.findById(registration).orElse(null);
    }

    public Faculty getFacultyByName(String name){
        return facultyRepository.findByName(name);
    }

    public Faculty updateFaculty(Faculty faculty){
        Faculty currentFaculty = facultyRepository.findById(faculty.getRegistration_id()).orElse(null);
        currentFaculty.setEmail_address(faculty.getEmail_address());
        currentFaculty.setName(faculty.getName());
        currentFaculty.setGender(faculty.getGender());
        currentFaculty.setMobile_number(faculty.getMobile_number());
        return facultyRepository.save(currentFaculty);
    }

    public String deleteFaculty(String registration_number){
        facultyRepository.deleteById(registration_number);
        return "Successfully Deleted!";
    }
}

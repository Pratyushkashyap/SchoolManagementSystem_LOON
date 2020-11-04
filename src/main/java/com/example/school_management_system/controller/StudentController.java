package com.example.school_management_system.controller;

import com.example.school_management_system.entity.Student;
import com.example.school_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/student/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    // This has a bug
    @GetMapping("/student/roll_class_section/{}")
    public Student getStudentByClassSectionRoll(@PathVariable String string) {
        String []value = string.split("_");
        System.out.println(value[0]+" "+value[1]+" "+value[2]);
        return studentService. getStudentByRollNoClassSection(value[0],value[1],value[2]);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }
}
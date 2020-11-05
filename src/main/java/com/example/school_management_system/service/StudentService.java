package com.example.school_management_system.service;

import com.example.school_management_system.entity.Student;
import com.example.school_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> saveStudents(List<Student> student) {
        return studentRepository.saveAll(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String registration_number) {
        return studentRepository.findById(registration_number).orElse(null);
    }

    public Student getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }



    public Student getStudentByRollNoClassSection(String RollNumber,String class_,String section){
        return studentRepository.findStudentByRollClassSection(RollNumber,class_,section);
    }

    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getRegistration_number()).orElse(null);
        assert (existingStudent != null);

        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setRollNumber(student.getRollNumber());
        existingStudent.setClassNumber(student.getClassNumber());
        existingStudent.setSection(student.getSection());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setFather_name(student.getFather_name());
        existingStudent.setMother_name(student.getMother_name());
        existingStudent.setMobile_number(student.getMobile_number());
        existingStudent.setGender(student.getGender());
        return studentRepository.save(existingStudent);
    }

    public String deleteStudent(String registration_number) {
        studentRepository.deleteById(registration_number);
        return "Successfully removed";
    }
}

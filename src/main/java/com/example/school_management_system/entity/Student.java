package com.example.school_management_system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "student")

public class Student {
    String rollNumber;
    String Name;
    String classNumber;
    String section;

    @Id
    String registration_number;

    String email;
    String father_name;
    String mother_name;
    String gender;
    String address;
    String mobile_number;

}
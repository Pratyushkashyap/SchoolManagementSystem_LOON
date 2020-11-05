package com.example.school_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor

@Table(name = "faculty")
public class Faculty{
    @Id
    String registration_id;
    String name;
    String email_address;
    String mobile_number;
    String gender;
}

package com.example.school_management_system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class StudentAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int at_id;
    @Column(nullable = false)
    private String rollNumber;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String classNumber;
    @Column(nullable = false)
    private String section;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String status="A";

}

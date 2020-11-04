package com.example.school_management_system.repository;

import com.example.school_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface StudentRepository extends JpaRepository<Student,String> {

    @Query(value = "Select * from student where student.name = :name",nativeQuery = true)
    Student findByName(@Param("name") String name);

    /*current feature upon test */
    @Query(value = "Select * from student where student.roll_number = :roll and student.class_number = :class_ and student.section = :sec",nativeQuery = true)
    Student findStudentByRollClassSection(@Param("roll") String roll,@Param("class_") String class_,@Param("sec") String sec);
}


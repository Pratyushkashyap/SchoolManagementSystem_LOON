package com.example.school_management_system.repository;

import com.example.school_management_system.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FacultyRepository extends JpaRepository<Faculty,String> {

    @Query(value = "select * from Faculty where Faculty.name = :name",nativeQuery = true)
    Faculty findByName(@Param("name") String name);


}

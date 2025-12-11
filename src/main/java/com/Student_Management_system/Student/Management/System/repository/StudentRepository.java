package com.Student_Management_system.Student.Management.System.repository;

import com.Student_Management_system.Student.Management.System.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

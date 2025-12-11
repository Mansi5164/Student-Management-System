package com.Student_Management_system.Student.Management.System.service;

import com.Student_Management_system.Student.Management.System.dto.StudentDto;
import com.Student_Management_system.Student.Management.System.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public interface StudentService {
    List<StudentDto> getStudents();
    StudentDto getStudentById(Long id);
    StudentDto addStudent(@RequestBody StudentDto studentDto);
    StudentDto updateStudent(Long id, @RequestBody StudentDto studentDto);
    String deleteStudent(Long id);
}

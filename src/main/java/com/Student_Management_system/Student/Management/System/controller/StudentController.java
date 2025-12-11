package com.Student_Management_system.Student.Management.System.controller;

import com.Student_Management_system.Student.Management.System.dto.StudentDto;
import com.Student_Management_system.Student.Management.System.entity.StudentEntity;
import com.Student_Management_system.Student.Management.System.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentService;
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudents")
    public ResponseEntity<List<StudentDto>> getStudent(){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping("/addStudent")
    public ResponseEntity<StudentDto> addStudent(@RequestBody @Valid StudentDto studentDto){
        return ResponseEntity.ok(studentService.addStudent(studentDto));
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        StudentDto student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleStudentNotFound(NoSuchElementException e){
        return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/updateStudent/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody @Valid StudentDto studentDto){
        StudentDto studentDto1 = studentService.updateStudent(id, studentDto);
        if(studentDto1 == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(studentDto1);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }
}

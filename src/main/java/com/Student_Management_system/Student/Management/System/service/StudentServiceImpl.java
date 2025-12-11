package com.Student_Management_system.Student.Management.System.service;
import com.Student_Management_system.Student.Management.System.Exception.ResourceNotFoundException;
import com.Student_Management_system.Student.Management.System.dto.StudentDto;
import com.Student_Management_system.Student.Management.System.entity.StudentEntity;
import com.Student_Management_system.Student.Management.System.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements  StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getStudents() {
        List<StudentEntity> students = studentRepository.findAll();
        List<StudentDto> studentDto = students
                .stream()
                .map(student ->
                        modelMapper.map(student, StudentDto.class))
                .toList();
        return studentDto;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        IsExistsStudent(id);
        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Student not Found with id : "+id));
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        studentEntity = studentRepository.save(studentEntity);
        return modelMapper.map(studentEntity, StudentDto.class);
    }
    public void IsExistsStudent(Long id){
        boolean exists = studentRepository.existsById(id);
        if(!exists)throw new ResourceNotFoundException("Student not Found with id : "+id);
    }

    @Override
    public StudentDto updateStudent(Long id, StudentDto studentDto) {
        IsExistsStudent(id);
        StudentEntity student = studentRepository.findById(id).orElse(null);
        student.setId(id);
        StudentEntity entity = studentRepository.save(student);
        return modelMapper.map(entity, StudentDto.class);
    }

    @Override
    public String deleteStudent(Long id) {
        IsExistsStudent(id);
        studentRepository.deleteById(id);
        return "Student deleted successfully!!!😃";

    }


}

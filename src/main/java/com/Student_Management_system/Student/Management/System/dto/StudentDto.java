package com.Student_Management_system.Student.Management.System.dto;
import com.Student_Management_system.Student.Management.System.annotation.PrimeNumberValidation;
import com.Student_Management_system.Student.Management.System.annotation.StudentRoleValidation;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDto {

    private Long id;

    @NotBlank(message = "Name of the Student can not be blank")
    @Size(min = 3 , max = 10, message = "Number of characters in Name should be in the range :[3, 10]")
    private String firstName;

    @NotBlank(message = "Name of the Student can not be blank")
    @Size(min = 3 , max = 10, message = "Number of characters in Name should be in the range :[3, 10]")
    private String lastName;

    @NotBlank(message = "email of the Student can not be blank")
    @Email(message = "email should be a valid email")
    private String email;

    @NotNull
    @Digits(integer = 2, fraction = 0, message = "age should be in the form XX")
    @Max(value = 80, message = "age cannot be greater than 80")
    @Min(value = 18, message = "age cannot be lesser than 18")
    @PrimeNumberValidation
    private int age;

    @NotBlank(message = "Course can not be blank")
    @Size(min = 2, max = 10, message = "Number of chracters in Name should be in the range : [2, 10]")
    private String Course;

    @Size(min = 10 , max = 10)
    private String phoneNumber;

    @NotBlank(message = "Role of the Student can not be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$")
    @StudentRoleValidation
    private String role;

}


package com.Student_Management_system.Student.Management.System.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class StudentRoleValidator implements ConstraintValidator<StudentRoleValidation, String> {

    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext constraintValidatorContext) {
        List<String> roles = List.of("USER","ADMIN");
        return roles.contains(inputRole);
    }
}

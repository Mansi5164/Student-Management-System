package com.Student_Management_system.Student.Management.System.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PrimeNumberValidator implements ConstraintValidator<PrimeNumberValidation, Integer> {
    @Override
    public boolean isValid(Integer num, ConstraintValidatorContext constraintValidatorContext) {
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}

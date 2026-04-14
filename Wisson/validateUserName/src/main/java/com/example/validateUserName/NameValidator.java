package com.example.validateUserName;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, UserDto> {

    @Override
    public boolean isValid(UserDto user, ConstraintValidatorContext context) {

        if (user == null) return true;

        boolean hasMiddle = user.getMiddleName() != null && !user.getMiddleName().trim().isEmpty();
        boolean hasLast = user.getLastName() != null && !user.getLastName().trim().isEmpty();

        return hasMiddle || hasLast;
    }
}

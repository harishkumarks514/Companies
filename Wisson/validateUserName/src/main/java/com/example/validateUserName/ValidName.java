package com.example.validateUserName;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = NameValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {

    String message() default "Either middle name or last name must be provided";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

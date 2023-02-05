package com.example.workbook.ch2;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.Set;

import static com.example.workbook.ch2.P51_ImmutableBuilder.*;

public class P52_BadDataInImmutable {

    public void playGround(){
        User user = null;
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        UserBuilder userBuilder = new UserBuilder("monika", "123456")
                .email("monika")
                .firstname("Monika")
                .lastname("Kowalska");

        Set<ConstraintViolation<UserBuilder>> violations = validator.validate(userBuilder);
        if(violations.isEmpty()){
            user = userBuilder.build();
            System.out.println(user);
        }else{
            printConstraintViolations("UserBuilder Violoations: ", violations);
        }
    }

    private static <T> void printConstraintViolations(
            String caption, Set<ConstraintViolation<T>> violations) {

        System.out.println(caption);

        violations.forEach((v) -> {
            System.out.println("\t" + v.getPropertyPath() + " " + v.getMessage());
        });
    }
}

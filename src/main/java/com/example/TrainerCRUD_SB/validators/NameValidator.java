/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TrainerCRUD_SB.validators;


import com.example.TrainerCRUD_SB.model.Trainer;
import java.util.Set;
import java.util.regex.Pattern;
import javax.validation.ConstraintViolation;

import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author user
 */
@Component
public class  NameValidator implements Validator {

  
    @Override
    public boolean supports(Class<?> type) {
        return Trainer.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Trainer t = (Trainer) o;
        Pattern namesPattern = Pattern.compile("[\\p{L}\\s-]+");
        Pattern subjectPattern = Pattern.compile("[\\p{L}\\d\\s-]+");
       
        if (!namesPattern.matcher(t.getFirstName()).matches()) {
            errors.rejectValue("firstName", "first.name.nomatch");
        }
        if (!namesPattern.matcher(t.getLastName()).matches()) {
            errors.rejectValue("lastName", "last.name.nomatch");
        }
        if (!subjectPattern.matcher(t.getSubject()).matches()) {
            errors.rejectValue("subject", "subject.nomatch");
        }
    }
    
    
  
}

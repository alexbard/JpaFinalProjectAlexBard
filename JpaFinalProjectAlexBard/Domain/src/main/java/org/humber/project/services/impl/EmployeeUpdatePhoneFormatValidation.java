package org.humber.project.services.impl;

import lombok.NonNull;
import org.humber.project.domain.Employee;
import org.humber.project.exceptions.EmployeeUpdateValidationException;
import org.humber.project.exceptions.ErrorCode;
import org.humber.project.services.EmployeeUpdateValidationService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUpdatePhoneFormatValidation implements EmployeeUpdateValidationService {
    @Override
    public void validateEmployeeUpdate(@NonNull Employee employee) {

        if(employee.getPhoneNumber().length() != 12) {
            System.err.println("Please use the following format: ***-***-****");
            throw new EmployeeUpdateValidationException(ErrorCode.INVALID_EMPLOYEE_PHONE_NUMBER);
        }
    }
}

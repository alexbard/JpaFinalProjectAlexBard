package org.humber.project.services.impl;

import lombok.NonNull;
import org.humber.project.domain.Employee;
import org.humber.project.exceptions.EmployeeUpdateValidationException;
import org.humber.project.exceptions.ErrorCode;
import org.humber.project.services.EmployeeUpdateValidationService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUpdateRateValidation implements EmployeeUpdateValidationService {
    @Override
    public void validateEmployeeUpdate(@NonNull Employee employee) {

        if(employee.getRate() > 150.00) {
            throw new EmployeeUpdateValidationException(ErrorCode.INVALID_EMPLOYEE_RATE);
        }
    }
}

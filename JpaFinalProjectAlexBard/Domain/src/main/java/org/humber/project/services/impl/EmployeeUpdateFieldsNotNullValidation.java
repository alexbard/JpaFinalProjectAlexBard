package org.humber.project.services.impl;

import lombok.NonNull;
import org.humber.project.domain.Employee;
import org.humber.project.exceptions.EmployeeUpdateValidationException;
import org.humber.project.exceptions.ErrorCode;
import org.humber.project.services.EmployeeUpdateValidationService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUpdateFieldsNotNullValidation implements EmployeeUpdateValidationService {
    @Override
    public void validateEmployeeUpdate(@NonNull Employee employee) {
        if(employee.getFirstName() == null || employee.getFirstName().isEmpty()) {
            System.err.println("Employee first name is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getLastName() == null || employee.getLastName().isEmpty()) {
            System.err.println("Employee last name is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getPosition() == null || employee.getPosition().isEmpty()) {
            System.err.println("Employee position is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getShiftType() == null || employee.getShiftType().isEmpty()) {
            System.err.println("Employee shift type is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getRate() == null) {
            System.err.println("Employee rate is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getStatus() == null || employee.getStatus().isEmpty()) {
            System.err.println("Employee status is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getPassword() == null || employee.getPassword().isEmpty()) {
            System.err.println("Employee password is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
        if(employee.getPhoneNumber() == null || employee.getPhoneNumber().isEmpty()) {
            System.err.println("Employee phone number is null");
            throw new EmployeeUpdateValidationException(ErrorCode.EMPLOYEE_FIELD_NULL);
        }
    }
}

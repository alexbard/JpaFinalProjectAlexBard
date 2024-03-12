package org.humber.project.services;

import org.humber.project.domain.Employee;


public interface EmployeeUpdateValidationService {
    void validateEmployeeUpdate(Employee employee);
}

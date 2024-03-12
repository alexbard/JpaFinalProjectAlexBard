package org.humber.project.services;

import org.humber.project.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {
    List<Employee> getAllEmployees();

    void updateEmployee(Employee employee);

    Employee getEmployeeDetails(Long employeeId);
}

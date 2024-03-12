package org.humber.project.services;

import org.humber.project.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeJPAService {
    List<Employee> findAllEmployees();

    void updateSingleEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);
}

package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Employee;
import org.humber.project.services.EmployeeJPAService;
import org.humber.project.services.EmployeeService;
import org.humber.project.services.EmployeeUpdateValidationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeJPAService employeeJPAService;
    private final List<EmployeeUpdateValidationService> validationServices;

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("Retrieving all employees");
        return employeeJPAService.findAllEmployees();
    }

    @Override
    public void updateEmployee(Employee employee) {
        System.out.println("In updateEmployee method, validating employee: " + employee.toString());
        for(EmployeeUpdateValidationService validationService : validationServices) {
            validationService.validateEmployeeUpdate(employee);
        }
        employeeJPAService.updateSingleEmployee(employee);
        System.out.println("Updated Record: " + employee);
    }

    @Override
    public Employee getEmployeeDetails(Long employeeId) {
        return employeeJPAService.getEmployeeById(employeeId);
    }

}

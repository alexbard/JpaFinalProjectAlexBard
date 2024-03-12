package org.humber.project.transformers;

import org.humber.project.domain.Employee;
import org.humber.project.repositories.entities.EmployeeEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class EmployeeEntityTransformer {
    private EmployeeEntityTransformer() {
    }

    public static EmployeeEntity transformToEmployeeEntity(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(employee.getEmployeeId());
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        employeeEntity.setPosition(employee.getPosition());
        employeeEntity.setShiftType(employee.getShiftType());
        employeeEntity.setRate(String.valueOf(employee.getRate()));
        employeeEntity.setStatus(employee.getStatus());
        employeeEntity.setPassword(employee.getPassword());
        employeeEntity.setPhoneNumber(employee.getPhoneNumber());
        return employeeEntity;
    }

    public static Employee transformToEmployee(EmployeeEntity employeeEntity) {
        return Employee.builder()
                .employeeId(employeeEntity.getEmployeeId())
                .firstName(employeeEntity.getFirstName())
                .lastName(employeeEntity.getLastName())
                .position(employeeEntity.getPosition())
                .shiftType(employeeEntity.getShiftType())
                .rate(Double.valueOf(employeeEntity.getRate()))
                .status(employeeEntity.getStatus())
                .password(employeeEntity.getPassword())
                .phoneNumber(employeeEntity.getPhoneNumber())
                .build();
    }

    public static List<Employee> transformToEmployees(List<EmployeeEntity> entities) {
        return entities.stream()
                .map(EmployeeEntityTransformer::transformToEmployee)
                .collect(Collectors.toList());
    }
}

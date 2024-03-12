package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Employee;
import org.humber.project.repositories.EmployeeJPARepository;
import org.humber.project.repositories.entities.EmployeeEntity;
import org.humber.project.services.EmployeeJPAService;
import org.humber.project.transformers.EmployeeEntityTransformer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.humber.project.transformers.EmployeeEntityTransformer.transformToEmployee;
import static org.humber.project.transformers.EmployeeEntityTransformer.transformToEmployeeEntity;

@Service
@RequiredArgsConstructor
public class EmployeeJPAServiceImpl implements EmployeeJPAService {

    private final EmployeeJPARepository employeeJPARepository;

    @Override
    public List<Employee> findAllEmployees() {
        return Optional.of(employeeJPARepository.findAll())
                .map(EmployeeEntityTransformer::transformToEmployees)
                .orElse(null);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeJPARepository.findById(employeeId)
                .map(EmployeeEntityTransformer::transformToEmployee)
                .orElse(null);
    }

    @Override
    public void updateSingleEmployee(Employee employee) {
        EmployeeEntity employeeEntity = transformToEmployeeEntity(employee);
        EmployeeEntity savedEntity = employeeJPARepository.save(employeeEntity);
        transformToEmployee(savedEntity);
    }
}

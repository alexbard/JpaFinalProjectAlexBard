package org.humber.project.controllers;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Employee;
import org.humber.project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAllEmployees")
    public ModelAndView getAllEmployees() {
        ModelAndView modelAndView = new ModelAndView("employee");
        modelAndView.addObject("employees", employeeService.getAllEmployees());
        return modelAndView;
    }
}

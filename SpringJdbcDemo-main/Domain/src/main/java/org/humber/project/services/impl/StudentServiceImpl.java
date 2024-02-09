package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Student;
import org.humber.project.services.StudentJdbcService;
import org.humber.project.services.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentJdbcService studentJdbcService;

    @Override
    public List<Student> getAllStudents() {
        System.out.println("Retrieving all students");
        return studentJdbcService.findAll();
    }

    @Override
    public void insertStudent(Student student) {
        studentJdbcService.insert(student);
        System.out.println("Saved Record: " + student);
    }

    @Override
    public void updateStudent(Student student) {
        studentJdbcService.update(student);
        System.out.println("Updated Record: " + student);
    }
}

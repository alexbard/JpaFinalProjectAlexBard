package org.humber.project.services;

import org.humber.project.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void insertStudent(Student student);

    void updateStudent(Student student);
}

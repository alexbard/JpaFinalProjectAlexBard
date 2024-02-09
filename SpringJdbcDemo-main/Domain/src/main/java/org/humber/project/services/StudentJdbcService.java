package org.humber.project.services;

import org.humber.project.domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public interface StudentJdbcService {

    List<Student> findAll();

    void insert(Student student);

    void update(Student student);

}

package org.humber.project.services.impl;

import org.humber.project.domain.Student;
import org.humber.project.services.StudentJdbcService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentJdbcServiceImpl implements StudentJdbcService {
    private final JdbcTemplate jdbcTemplate;

    public StudentJdbcServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student", new BeanPropertyRowMapper<>(Student.class));
    }

    public void insert(Student student) {
        jdbcTemplate.update("INSERT INTO student(student_id, name, gender, semester) VALUES (?, ?, ?, ?)",
                student.getStudentId(), student.getName(), student.getGender(), student.getSemester());
    }

    public void update(Student student) {
        jdbcTemplate.update("UPDATE student SET name = ?, gender = ?, semester = ? WHERE studentId = ?",
                student.getName(), student.getGender(), student.getSemester(), student.getStudentId());
    }

}

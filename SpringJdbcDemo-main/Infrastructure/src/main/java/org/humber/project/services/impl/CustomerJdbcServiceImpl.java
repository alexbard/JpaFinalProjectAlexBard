package org.humber.project.services.impl;

import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerJdbcService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerJdbcServiceImpl implements CustomerJdbcService {
    private final JdbcTemplate jdbcTemplate;

    public CustomerJdbcServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", new BeanPropertyRowMapper<>(Customer.class));
    }

    public void insert(Customer customer) {
        jdbcTemplate.update("INSERT INTO customer(customer_id, name, email, phone, postal_code, country) VALUES (?, ?, ?, ?, ?, ?)",
                customer.getCustomerId(), customer.getName(), customer.getEmail(), customer.getPhone(), customer.getPostalCode(), customer.getCountry());
    }

    public void update(Customer customer) {
        jdbcTemplate.update("UPDATE customer SET name = ?, email = ?, phone = ?, postal_code = ?, country = ? WHERE customer_id = ?",
                customer.getName(), customer.getEmail(), customer.getPhone(), customer.getPostalCode(), customer.getCountry(), customer.getCustomerId());
    }
}

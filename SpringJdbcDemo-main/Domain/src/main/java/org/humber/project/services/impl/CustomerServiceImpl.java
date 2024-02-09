package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerJdbcService;
import org.humber.project.services.CustomerService;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerJdbcService customerJdbcService;

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println("Retrieving all customers");
        return customerJdbcService.findAll();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerJdbcService.insert(customer);
        System.out.println("Saved Record: " + customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerJdbcService.update(customer);
        System.out.println("Updated Record: " + customer);
    }
}

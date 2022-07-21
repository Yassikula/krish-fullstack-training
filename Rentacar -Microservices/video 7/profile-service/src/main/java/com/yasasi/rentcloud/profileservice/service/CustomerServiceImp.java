package com.yasasi.rentcloud.profileservice.service;

import com.yasasi.rentcloud.commons.model.Customer;
import com.yasasi.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements  CustomerService {


    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}

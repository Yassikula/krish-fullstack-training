package com.yasasi.rentcloud.profileservice.repository;


import com.yasasi.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

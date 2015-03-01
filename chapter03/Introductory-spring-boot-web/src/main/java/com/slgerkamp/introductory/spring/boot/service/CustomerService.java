package com.slgerkamp.introductory.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slgerkamp.introductory.spring.boot.domain.Customer;
import com.slgerkamp.introductory.spring.boot.repository.CustomerRepository;

/**
 * 顧客情報用サービス
 *
 */
@Service
@Transactional
public class CustomerService {
	
	@Autowired
    CustomerRepository customerRepository;

    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAllOrderByName(pageable);
    }

    public Customer findOne(Integer id) {
        return customerRepository.findOne(id);
    }

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(Integer id) {
        customerRepository.delete(id);
    }
    
    public List<Customer> findAll() {
        return customerRepository.findAllOrderByName();
    }

}

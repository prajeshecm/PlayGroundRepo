package com.example.redissample.repo;

import com.example.redissample.domain.Customer;

import java.util.Map;

public interface CustomerRepo {


      void saveCustomer(Customer customer);

      Map<String,Customer> getAllCustomer();


}

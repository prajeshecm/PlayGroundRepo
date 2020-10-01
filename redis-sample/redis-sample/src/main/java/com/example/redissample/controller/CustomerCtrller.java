package com.example.redissample.controller;

import com.example.redissample.domain.Customer;
import com.example.redissample.repo.CustomerRepo;
import com.example.redissample.repo.CustomerRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest/customer")
public class CustomerCtrller {

    public CustomerRepoImpl getCustomerRepo() {
        return customerRepo;
    }

    public void setCustomerRepo(CustomerRepoImpl customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Autowired
    CustomerRepoImpl customerRepo;


    @GetMapping("/add/{id}/{name}/{location}/{salary}")
    public void addCustomer(@PathVariable("id") final Long id ,@PathVariable("name") final String name ,@PathVariable("location") final String location ,@PathVariable("salary") final Long salary ){
       System.out.println("addCustomer");
        Customer customer = new Customer(id,name,location,salary);
         customerRepo.saveCustomer(customer);
    }

    @GetMapping("/getAll")
    public Map<String, Customer> getAllCustomer(){
        System.out.println("getAllCustomer");
        return customerRepo.getAllCustomer();
    }

    /*public CustomerRepo getCustomerRepo() {
        return customerRepo;
    }

    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }*/
}

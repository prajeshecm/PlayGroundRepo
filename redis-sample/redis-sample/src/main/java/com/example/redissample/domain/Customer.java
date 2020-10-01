package com.example.redissample.domain;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

    private Long customerId;
    private String customerName;
    private String customerLocation;
    private Long customerSalary;

    public Customer(Long customerId, String customerName, String customerLocation, Long customerSalary) {
        System.out.println("Domain :Customer Constructor");
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLocation = customerLocation;
        this.customerSalary = customerSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(customerLocation, customer.customerLocation) &&
                Objects.equals(customerSalary, customer.customerSalary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, customerName, customerLocation, customerSalary);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                ", customerSalary=" + customerSalary +
                '}';
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(Long customerSalary) {
        this.customerSalary = customerSalary;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }
}

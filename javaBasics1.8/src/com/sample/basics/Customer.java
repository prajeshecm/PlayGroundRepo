package com.sample.basics;

import java.util.Objects;

public class Customer {

    private String customerName;

    private int age;

    public Customer(String customerName, int age) {
        this.customerName = customerName;
        this.age = age;
    }

    public void changeCustomerDetails(String name , int age){
        this.customerName = name;
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName=" + customerName +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                customerName.equals(customer.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, age);
    }
}

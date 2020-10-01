package com.example.redissample.repo;

import com.example.redissample.domain.Customer;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CustomerRepoImpl implements CustomerRepo{

    RedisTemplate<String,Customer> redisTemplate;

    HashOperations hashOperations;

    public CustomerRepoImpl(RedisTemplate<String,Customer> redisTemplate) {
        System.out.println("ORM :CustomerRepoImpl");
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();

    }

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("ORM :saveCustomer");
        hashOperations.put("CUSTOMER",customer.getCustomerId(),customer);
    }

    @Override
    public Map<String,Customer> getAllCustomer() {
        System.out.println("ORM :getAllCustomer");
        return hashOperations.entries("CUSTOMER");
    }
}

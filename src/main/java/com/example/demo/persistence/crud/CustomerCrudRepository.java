package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerCrudRepository extends CrudRepository<Customer, Integer>{
      
}

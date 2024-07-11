package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaCrudRepository extends CrudRepository<Pizza, Integer>{
    
}

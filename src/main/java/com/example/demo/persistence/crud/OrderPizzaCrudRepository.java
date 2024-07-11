package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.OrderPizza;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrderPizzaCrudRepository extends CrudRepository<OrderPizza, Integer> {
    
    List<OrderPizza> findByIdCustomerOrderByDateAsc(int idCustomer);
}
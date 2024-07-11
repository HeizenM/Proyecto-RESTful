package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.OrderItem;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemCrudRepository extends CrudRepository<OrderItem, Integer>{
    
    List<OrderItem> findByIdOrder(int idOrder);
    List<OrderItem> findByIdPizza(int idPizza);
    
}

package com.example.demo.domain.repository;

import com.example.demo.domain.dto.OrderPizzaDto;
import java.util.List;
import java.util.Optional;

public interface OrderPizzaDtoRepository {
    
    List<OrderPizzaDto> getAll();

    List<OrderPizzaDto> getByCustomerId(int idCustomer);

    Optional<OrderPizzaDto> getOrderPizzaDto(int idOrder);

    Boolean edit(OrderPizzaDto orderPizzaDto);

    OrderPizzaDto save(OrderPizzaDto orderPizzaDto);

    void delete(int idOrder);  //idOrderDto
    
}

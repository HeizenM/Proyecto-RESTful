package com.example.demo.domain.repository;

import com.example.demo.domain.dto.OrderItemDto;
import java.util.List;
import java.util.Optional;

public interface OrderItemDtoRepository {
    
    List<OrderItemDto> getAll();

    List<OrderItemDto> getByOrderId(int idOrder);
    
    List<OrderItemDto> getByPizzaId(int idPizza);

    Optional<OrderItemDto> getOrderItemDto(int idItem);

    Boolean edit(OrderItemDto orderItemDto);

    OrderItemDto save(OrderItemDto orderItemDto);

    void delete(int idItem);  //idItemDto
    
}

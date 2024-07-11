package com.example.demo.domain.service;

import com.example.demo.domain.dto.OrderItemDto;
import com.example.demo.domain.repository.OrderItemDtoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    
    @Autowired
    private OrderItemDtoRepository orderItemRepository;

    public List<OrderItemDto> getAll() {
        return orderItemRepository.getAll();
    }

    public List<OrderItemDto> getByOrderId(int idOrder) {
        return orderItemRepository.getByOrderId(idOrder);
    }
    
    public List<OrderItemDto> getByPizzaId(int idPizza) {
        return orderItemRepository.getByPizzaId(idPizza);
    }

    public Optional<OrderItemDto> getOrderItemDto(int idItem) {
        return orderItemRepository.getOrderItemDto(idItem);
    }

    public Boolean edit(OrderItemDto orderItemDto) {
        return orderItemRepository.edit(orderItemDto);
    }

    public OrderItemDto save(OrderItemDto orderItemDto) {
        return orderItemRepository.save(orderItemDto);
    }

    public void delete(int idItem) {
        orderItemRepository.delete(idItem);
    }
}

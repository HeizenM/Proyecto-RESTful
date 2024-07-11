package com.example.demo.persistence;

import com.example.demo.domain.dto.OrderItemDto;
import com.example.demo.domain.repository.OrderItemDtoRepository;
import com.example.demo.persistence.crud.OrderItemCrudRepository;
import com.example.demo.persistence.entity.OrderItem;
import com.example.demo.persistence.mapper.OrderItemMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderItemRepository implements OrderItemDtoRepository{
    
    @Autowired
    private OrderItemCrudRepository OrderItemCrudRepository;

    @Autowired
    private OrderItemMapper mapper;

    @Override
    public List<OrderItemDto> getAll() {
        List<OrderItem> orderItemList = (List<OrderItem>) OrderItemCrudRepository.findAll();
        return mapper.toOrderItemDtos(orderItemList);
    }

    @Override
    public List<OrderItemDto> getByOrderId(int idOrder) {
        List<OrderItem> orderItem = OrderItemCrudRepository.findByIdOrder(idOrder);
        return mapper.toOrderItemDtos(orderItem);
    }
    
    @Override
    public List<OrderItemDto> getByPizzaId(int idPizza) {
        List<OrderItem> orderItem = OrderItemCrudRepository.findByIdPizza(idPizza);
        return mapper.toOrderItemDtos(orderItem);
    }

    @Override
    public Optional<OrderItemDto> getOrderItemDto(int idItem) {
        return OrderItemCrudRepository.findById(idItem).map(orderItem -> mapper.toOrderItemDto(orderItem));
    }

    @Override
    public Boolean edit(OrderItemDto orderItemDto) {
        Optional<OrderItem> existingItem = OrderItemCrudRepository.findById(orderItemDto.getIdItemDto());
        if (existingItem.isPresent()) {
            OrderItem orderItem = mapper.toOrderItem(orderItemDto);
            OrderItemCrudRepository.save(orderItem);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public OrderItemDto save(OrderItemDto orderItemDto) {
        OrderItem orderItem = mapper.toOrderItem(orderItemDto);
        return mapper.toOrderItemDto(OrderItemCrudRepository.save(orderItem));
    }

    @Override
    public void delete(int idOrder) {
        OrderItemCrudRepository.deleteById(idOrder);
    }
}


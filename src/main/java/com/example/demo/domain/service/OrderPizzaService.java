package com.example.demo.domain.service;

import com.example.demo.domain.dto.OrderPizzaDto;
import com.example.demo.domain.repository.OrderPizzaDtoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPizzaService {
    
    @Autowired
    private OrderPizzaDtoRepository orderPizzaRepository;

    public List<OrderPizzaDto> getAll() {
        return orderPizzaRepository.getAll();
    }

    public List<OrderPizzaDto> getByCustomerId(int idCustomer) {
        return orderPizzaRepository.getByCustomerId(idCustomer);
    }

    public Optional<OrderPizzaDto> getOrderPizzaDto(int idOrder) {
        return orderPizzaRepository.getOrderPizzaDto(idOrder);
    }

    public Boolean edit(OrderPizzaDto orderPizzaDto) {
        return orderPizzaRepository.edit(orderPizzaDto);
    }

    public OrderPizzaDto save(OrderPizzaDto orderPizzaDto) {
        return orderPizzaRepository.save(orderPizzaDto);
    }

    public void delete(int idOrder) {
        orderPizzaRepository.delete(idOrder);
    }
}

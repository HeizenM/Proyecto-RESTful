package com.example.demo.persistence;

import com.example.demo.domain.dto.OrderPizzaDto;
import com.example.demo.domain.repository.OrderPizzaDtoRepository;
import com.example.demo.persistence.crud.OrderPizzaCrudRepository;
import com.example.demo.persistence.entity.OrderPizza;
import com.example.demo.persistence.mapper.OrderPizzaMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderPizzaRepository implements OrderPizzaDtoRepository {

    @Autowired
    private OrderPizzaCrudRepository orderPizzaCrudRepository;

    @Autowired
    private OrderPizzaMapper mapper;

    @Override
    public List<OrderPizzaDto> getAll() {
        List<OrderPizza> orderPizzaList = (List<OrderPizza>) orderPizzaCrudRepository.findAll();
        return mapper.toOrderPizzaDtos(orderPizzaList);
    }

    @Override
    public List<OrderPizzaDto> getByCustomerId(int idCustomer) {
        List<OrderPizza> orderPizzas = orderPizzaCrudRepository.findByIdCustomerOrderByDateAsc(idCustomer);
        return mapper.toOrderPizzaDtos(orderPizzas);
    }

    @Override
    public Optional<OrderPizzaDto> getOrderPizzaDto(int idOrder) {
        return orderPizzaCrudRepository.findById(idOrder).map(orderPizza -> mapper.toOrderPizzaDto(orderPizza));
    }

    @Override
    public Boolean edit(OrderPizzaDto orderPizzaDto) {
        Optional<OrderPizza> existingOrder = orderPizzaCrudRepository.findById(orderPizzaDto.getIdOrderDto());
        if (existingOrder.isPresent()) {
            OrderPizza orderPizza = mapper.toOrderPizza(orderPizzaDto);
            orderPizzaCrudRepository.save(orderPizza);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public OrderPizzaDto save(OrderPizzaDto orderPizzaDto) {
        OrderPizza orderPizza = mapper.toOrderPizza(orderPizzaDto);
        return mapper.toOrderPizzaDto(orderPizzaCrudRepository.save(orderPizza));
    }

    @Override
    public void delete(int idOrder) {
        orderPizzaCrudRepository.deleteById(idOrder);
    }
}

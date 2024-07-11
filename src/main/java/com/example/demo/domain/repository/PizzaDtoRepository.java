package com.example.demo.domain.repository;

import com.example.demo.domain.dto.PizzaDto;
import java.util.List;
import java.util.Optional;

public interface PizzaDtoRepository {
    
    List<PizzaDto> getAll();

    Optional<PizzaDto> getPizzaDto(int idPizza);

    Boolean edit(PizzaDto pizzaDto);

    PizzaDto save(PizzaDto pizzaDto);

    void delete(int idPizza);
    
}

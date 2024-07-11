package com.example.demo.persistence;

import com.example.demo.domain.dto.PizzaDto;
import com.example.demo.domain.repository.PizzaDtoRepository;
import com.example.demo.persistence.crud.PizzaCrudRepository;
import com.example.demo.persistence.entity.Pizza;
import com.example.demo.persistence.mapper.PizzaMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PizzaRepository implements PizzaDtoRepository{
    
    @Autowired
    private PizzaCrudRepository pizzaCrudRepository;

    @Autowired
    private PizzaMapper mapper;

    
    @Override
    public List<PizzaDto> getAll() {
        List<Pizza> pizzaList = (List<Pizza>) pizzaCrudRepository.findAll();
        return mapper.toPizzaDtos(pizzaList);
    }
    
    @Override
    public Optional<PizzaDto> getPizzaDto(int idPizza) {
        return pizzaCrudRepository.findById(idPizza).map(pizza -> mapper.toPizzaDto(pizza));
    }

    @Override
    public Boolean edit(PizzaDto pizzaDto) {
        Optional<Pizza> existingPizza = pizzaCrudRepository.findById(pizzaDto.getIdPizzaDto());
        if (existingPizza.isPresent()) {
            Pizza pizza = mapper.toPizza(pizzaDto);
            pizzaCrudRepository.save(pizza);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public PizzaDto save(PizzaDto pizzaDto) {
        Pizza pizza = mapper.toPizza(pizzaDto);
        return mapper.toPizzaDto(pizzaCrudRepository.save(pizza));
    }

    @Override
    public void delete(int idPizza) {
        pizzaCrudRepository.deleteById(idPizza);
    }
}

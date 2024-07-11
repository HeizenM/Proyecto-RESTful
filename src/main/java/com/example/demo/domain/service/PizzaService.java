package com.example.demo.domain.service;

import com.example.demo.domain.dto.PizzaDto;
import com.example.demo.domain.repository.PizzaDtoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    
    @Autowired
    private PizzaDtoRepository pizzaDtoRepository;

    public List<PizzaDto> getAll() {
        return pizzaDtoRepository.getAll();
    }

    public Optional<PizzaDto> getCustomerDto(int idPizza) {
        return pizzaDtoRepository.getPizzaDto(idPizza);
    }

    public Boolean edit(PizzaDto customerDto) {
        return pizzaDtoRepository.edit(customerDto);
    }

    public PizzaDto save(PizzaDto customerDto) {
        return pizzaDtoRepository.save(customerDto);
    }

    public void delete(int idPizza) {
        pizzaDtoRepository.delete(idPizza);
    }
}


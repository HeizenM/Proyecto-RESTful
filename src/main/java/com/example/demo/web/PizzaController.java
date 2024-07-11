package com.example.demo.web;

import com.example.demo.domain.dto.PizzaDto;
import com.example.demo.domain.service.PizzaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;
    
    
    @GetMapping("/all_other")
    public List<PizzaDto> getAll() {
        return pizzaService.getAll();
    }

    @PutMapping("/edit")
    public Boolean edit(@RequestBody PizzaDto pizzaDto) {
        return pizzaService.edit(pizzaDto);
    }
    @PostMapping("/save")
    public PizzaDto save(@RequestBody PizzaDto pizzaDto) {
        return pizzaService.save(pizzaDto);
    }

     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int idPizza) {  
        pizzaService.delete(idPizza);
    }
    
}

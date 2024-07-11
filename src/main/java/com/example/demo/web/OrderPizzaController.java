package com.example.demo.web;

import com.example.demo.domain.dto.OrderPizzaDto;
import com.example.demo.domain.service.OrderPizzaService;
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
@RequestMapping("/orderPizza")
public class OrderPizzaController {
    @Autowired
    private OrderPizzaService OrderPizzaService;
    
    @GetMapping("/all_other")
    public List<OrderPizzaDto> getAll() {
        return OrderPizzaService.getAll();
    }

    @PutMapping("/edit")
    public Boolean edit(@RequestBody OrderPizzaDto orderPizzaDto) {
        return OrderPizzaService.edit(orderPizzaDto);
    }
    @PostMapping("/save")
    public OrderPizzaDto save(@RequestBody OrderPizzaDto orderPizzaDto) {
        return OrderPizzaService.save(orderPizzaDto);
    }

     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int idOrder) {   ///idOrderDto
        OrderPizzaService.delete(idOrder);
    }
    

}

package com.example.demo.web;

import com.example.demo.domain.dto.OrderItemDto;
import com.example.demo.domain.service.OrderItemService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
    
    @Autowired
    private OrderItemService OrderItemService;
    
    @GetMapping("/all_other")
    public List<OrderItemDto> getAll() {
        return OrderItemService.getAll();
    }

    @PutMapping("/edit")
    public Boolean edit(@RequestBody OrderItemDto orderItemDto) {
        return OrderItemService.edit(orderItemDto);
    }
    @PostMapping("/save")
    public OrderItemDto save(@RequestBody OrderItemDto orderItemDto) {
        return OrderItemService.save(orderItemDto);
    }

     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int idItem) {   ///idOrderDto
        OrderItemService.delete(idItem);
    }
    

}



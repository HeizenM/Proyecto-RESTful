package com.example.demo.web;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.service.CustomerService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    
    @GetMapping("/all_other")
    public List<CustomerDto> getAll() {
        return customerService.getAll();
    }

    @PutMapping("/edit")
    public Boolean edit(@RequestBody CustomerDto customerDto) {
        return customerService.edit(customerDto);
    }
    @PostMapping("/save")
    public CustomerDto save(@RequestBody CustomerDto customerDto) {
        return customerService.save(customerDto);
    }

     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int idCustomer) {   ///idOrderDto
        customerService.delete(idCustomer);
    }
    

}



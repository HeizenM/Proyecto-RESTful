 package com.example.demo.domain.service;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.repository.CustomerDtoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerDtoRepository customerDtoRepository;

    public List<CustomerDto> getAll() {
        return customerDtoRepository.getAll();
    }

    public Optional<CustomerDto> getCustomerDto(int idCustomer) {
        return customerDtoRepository.getCustomerDto(idCustomer);
    }

    public Boolean edit(CustomerDto customerDto) {
        return customerDtoRepository.edit(customerDto);
    }

    public CustomerDto save(CustomerDto customerDto) {
        return customerDtoRepository.save(customerDto);
    }

    public void delete(int idCustomer) {
        customerDtoRepository.delete(idCustomer);
    }
}

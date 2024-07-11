
package com.example.demo.persistence;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.repository.CustomerDtoRepository;
import com.example.demo.persistence.crud.CustomerCrudRepository;
import com.example.demo.persistence.entity.Customer;
import com.example.demo.persistence.mapper.CustomerMapper;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements CustomerDtoRepository{
    
    @Autowired
    private CustomerCrudRepository customerCrudRepository;

    @Autowired
    private CustomerMapper mapper;

    
    @Override
    public List<CustomerDto> getAll() {
        List<Customer> customerList = (List<Customer>) customerCrudRepository.findAll();
        return mapper.toCustomerDtos(customerList);
    }
    
    @Override
    public Optional<CustomerDto> getCustomerDto(int idCustomer) {
        return customerCrudRepository.findById(idCustomer).map(customer -> mapper.toCustomerDto(customer));
    }

    @Override
    public Boolean edit(CustomerDto customerDto) {
        Optional<Customer> existingCustomer = customerCrudRepository.findById(customerDto.getIdCustomerDto());
        if (existingCustomer.isPresent()) {
            Customer customer = mapper.toCustomer(customerDto);
            customerCrudRepository.save(customer);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customer customer = mapper.toCustomer(customerDto);
        return mapper.toCustomerDto(customerCrudRepository.save(customer));
    }

    @Override
    public void delete(int idCustomer) {
        customerCrudRepository.deleteById(idCustomer);
    }
}


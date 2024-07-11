package com.example.demo.persistence.mapper;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.persistence.entity.Customer;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
        @Mapping(source = "idCustomer", target = "idCustomerDto"),
        @Mapping(source = "name", target = "nameDto"),
        @Mapping(source = "address", target = "addressDto"),
        @Mapping(source = "email", target = "emailDto"),
        @Mapping(source = "phoneNumber", target = "phoneNumberDto")
    })
    CustomerDto toCustomerDto(Customer customer);

    List<CustomerDto> toCustomerDtos(List<Customer> Customer);
    
    @InheritInverseConfiguration
    Customer toCustomer(CustomerDto customerDto);

    List<CustomerDto> toCustomers(List<CustomerDto> CustomerDto);
}

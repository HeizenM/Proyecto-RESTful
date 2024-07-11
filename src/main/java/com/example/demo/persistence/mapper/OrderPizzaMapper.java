package com.example.demo.persistence.mapper;

import com.example.demo.domain.dto.OrderPizzaDto;
import com.example.demo.persistence.entity.OrderPizza;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class, CustomerMapper.class})
public interface OrderPizzaMapper {

    @Mappings({
        @Mapping(source = "idOrder", target = "idOrderDto"),
        @Mapping(source = "idCustomer", target = "idCustomerDto"),
        @Mapping(source = "date", target = "dateDto"),
        @Mapping(source = "total", target = "totalDto"),
        @Mapping(source = "method", target = "methodDto"),
        @Mapping(source = "additionalNotes", target = "additionalNotesDto"),
        @Mapping(source = "customer", target = "customerDto")
    })
    
    OrderPizzaDto toOrderPizzaDto(OrderPizza orderPizza);

    List<OrderPizzaDto> toOrderPizzaDtos(List<OrderPizza> orderPizzas);

    @InheritInverseConfiguration
    OrderPizza toOrderPizza(OrderPizzaDto orderPizzaDto);

    List<OrderPizza> toOrderPizzas(List<OrderPizzaDto> orderPizzaDtos);
    
}

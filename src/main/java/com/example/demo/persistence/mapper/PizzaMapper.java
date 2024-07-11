package com.example.demo.persistence.mapper;

import com.example.demo.domain.dto.PizzaDto;
import com.example.demo.persistence.entity.Pizza;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PizzaMapper {

    @Mappings({
        @Mapping(source = "idPizza", target = "idPizzaDto"),
        @Mapping(source = "name", target = "nameDto"),
        @Mapping(source = "description", target = "descriptionDto"),
        @Mapping(source = "price", target = "priceDto"),
        @Mapping(source = "vegetarian", target = "vegetarianDto"),
        @Mapping(source = "vegan", target = "veganDto"),
        @Mapping(source = "avaliable", target = "avaliableDto")
    })
    PizzaDto toPizzaDto(Pizza pizza);

    List<PizzaDto> toPizzaDtos(List<Pizza> Pizza);

    @InheritInverseConfiguration
    Pizza toPizza(PizzaDto pizzaDto);

    List<PizzaDto> toPizzas(List<PizzaDto> PizzaDto);

}

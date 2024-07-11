package com.example.demo.domain.dto;

public class OrderItemDto {

    private int idItemDto;

    private int idOrderDto;

    private int idPizzaDto;

    private Double quantityDto;
    
    private Double priceDto;
    
    private OrderPizzaDto orderPizzaDto;
    
    private PizzaDto pizzaDto;

    public OrderPizzaDto getOrderPizzaDto() {
        return orderPizzaDto;
    }

    public void setOrderPizzaDto(OrderPizzaDto orderPizzaDto) {
        this.orderPizzaDto = orderPizzaDto;
    }

    public PizzaDto getPizzaDto() {
        return pizzaDto;
    }

    public void setPizzaDto(PizzaDto pizzaDto) {
        this.pizzaDto = pizzaDto;
    }

    public int getIdItemDto() {
        return idItemDto;
    }

    public void setIdItemDto(int idItemDto) {
        this.idItemDto = idItemDto;
    }

    public int getIdOrderDto() {
        return idOrderDto;
    }

    public void setIdOrderDto(int idOrderDto) {
        this.idOrderDto = idOrderDto;
    }

    public int getIdPizzaDto() {
        return idPizzaDto;
    }

    public void setIdPizzaDto(int idPizzaDto) {
        this.idPizzaDto = idPizzaDto;
    }

    public Double getQuantityDto() {
        return quantityDto;
    }

    public void setQuantityDto(Double quantityDto) {
        this.quantityDto = quantityDto;
    }

    public Double getPriceDto() {
        return priceDto;
    }

    public void setPriceDto(Double priceDto) {
        this.priceDto = priceDto;
    }

    

    
    
}

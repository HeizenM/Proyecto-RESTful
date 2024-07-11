package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="order_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    private Integer idItem;
    
    @Column(name="id_order", nullable=false)
    private Integer idOrder;
    
    @Column(name="id_pizza", nullable=false)
    private Integer idPizza;

    @Column(columnDefinition = "DECIMAL(2,1)", nullable=false)
    private Double quantity;
    
    @Column(columnDefinition = "DECIMAL(5,2)", nullable=false)
    private Double price;
    
    @ManyToOne
    @JoinColumn(name="id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    private OrderPizza orderPizza;    
    
    @ManyToOne
    @JoinColumn(name="id_pizza", referencedColumnName = "id_pizza", insertable = false, updatable = false)
    private Pizza pizza;

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderPizza getOrderPizza() {
        return orderPizza;
    }

    public void setOrderPizza(OrderPizza orderPizza) {
        this.orderPizza = orderPizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
}

package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@Table(name="pizza")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pizza")
    private Integer idPizza;
    
    @Column(nullable=false, length = 30)
    private String name;
    
    @Column(nullable=false, length = 150)
    private String description;
    
    @Column(nullable=false, columnDefinition = "DECIMAL(5,2)")
    private Double price;
    
    @Column(columnDefinition = "TINYINT")
    private Boolean vegetarian;
    
    @Column(columnDefinition = "TINYINT")
    private Boolean vegan;
    
    @Column(columnDefinition = "TINYINT")
    private Boolean avaliable;
    
    @OneToMany(mappedBy = "pizza")
    private List<OrderItem> pizza;

    public Integer getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        this.avaliable = avaliable;
    }

    public List<OrderItem> getPizza() {
        return pizza;
    }

    public void setPizza(List<OrderItem> pizza) {
        this.pizza = pizza;
    }
    
}

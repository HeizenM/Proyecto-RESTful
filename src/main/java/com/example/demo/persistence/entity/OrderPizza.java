package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Entity
@Table(name="pizza_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderPizza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_order")
    private Integer idOrder;
    
    @Column(name="id_customer", nullable=false)
    private Integer idCustomer;
    
    @Column(columnDefinition = "DATETIME", nullable=false)
    private LocalDate date;
    
    @Column(columnDefinition = "DECIMAL(6,2)", nullable=false)
    private Double total;
    
    @Column(columnDefinition = "CHAR(1)", nullable=false)
    private String method;
    
    @Column(name="additional_notes", length = 200)
    private String additionalNotes;
    
    @OneToMany(mappedBy = "orderPizza")
    private List<OrderItem> items;
    
    @ManyToOne
    @JoinColumn(name="id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    private Customer customer;    

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}

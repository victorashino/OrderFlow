package dev.bicutoru.orderflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;

    private String date;

    @ManyToOne
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Customer customer;

    private List<Products> products;
}

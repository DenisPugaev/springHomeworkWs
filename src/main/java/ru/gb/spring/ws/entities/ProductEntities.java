package ru.gb.spring.ws.entities;


import lombok.Data;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class ProductEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "manufacturer")
    private String manufacturer;


    public ProductEntities(Long id, String title, BigDecimal price, String manufacturer) {
        this.title = title;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public ProductEntities() {
    }
}

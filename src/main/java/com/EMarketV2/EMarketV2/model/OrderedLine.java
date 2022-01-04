package com.EMarketV2.EMarketV2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ORDERED_LINE")
public class OrderedLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLine;
    @ManyToOne
    @JoinColumn(name = "idOrdered")
    private Order ordered;
    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;
    private int quantity;
    private double price;

    public OrderedLine() {
    }

    public OrderedLine(Order ordered, Product product, int quantity, double price) {
        super();
        this.ordered = ordered;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getIdLine() {
        return idLine;
    }

    public void setIdLine(Long idLine) {
        this.idLine = idLine;
    }

    public Order getOrdered() {
        return ordered;
    }

    public void setOrdered(Order ordered) {
        this.ordered = ordered;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

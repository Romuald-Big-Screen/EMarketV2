package com.EMarketV2.EMarketV2.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="ORDER")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Date orderDate;


    @OneToMany(mappedBy="order")
    private Collection<OrderLine> lines;

    @ManyToOne
    @JoinColumn(name="costumerId")
    private Customer customer;

    public Order(Date orderDate, List<OrderLine> lines, Customer customer) {
        super();
        this.orderDate = orderDate;
        this.lines = lines;
        this.customer = customer;
    }

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Collection<OrderLine> getLines() {
        return lines;
    }

    public void setLines(List<OrderLine> lines) {
        this.lines = lines;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

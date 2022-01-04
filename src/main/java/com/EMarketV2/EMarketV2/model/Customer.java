package com.EMarketV2.EMarketV2.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    @Size(min=5 , max = 20)
    private String nameCustomer;
    private String address;
    @Email
    private String email;
    private String phone;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer(String nameCustomer, String address, String email, String phone) {
        super();
        this.nameCustomer = nameCustomer;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

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

}

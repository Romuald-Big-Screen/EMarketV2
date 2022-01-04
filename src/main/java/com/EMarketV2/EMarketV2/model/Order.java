package com.EMarketV2.EMarketV2.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="ORDERED")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;
    private Date dateOrder;


    @OneToMany(mappedBy="ordered")
    private List<OrderedLine> orderedLines;

    @ManyToOne
    @JoinColumn(name="idCostumer")
    private Customer customer;

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }



}

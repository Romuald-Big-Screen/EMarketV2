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
    private Long idCommande;
    private Date dateCommande;


    @OneToMany(mappedBy="ordered")
    private List<OrderedLine> orderedLines;

    @ManyToOne
    @JoinColumn(name="idClient")
    private Customer customer;

}

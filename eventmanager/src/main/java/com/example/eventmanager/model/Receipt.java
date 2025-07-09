package com.example.eventmanager.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Costumer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sale> sales;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Costumer getCustomer() { return customer; }
    public void setCustomer(Costumer customer) { this.customer = customer; }

    public List<Sale> getSales() { return sales; }
    public void setSales(List<Sale> sales) { this.sales = sales; }
}

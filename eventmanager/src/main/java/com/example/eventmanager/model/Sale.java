package com.example.eventmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

@Entity
@Table(name = "Sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

    @ManyToOne
    private Costumer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SaleItem> saleItems;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    private double totalSale;

    private double tip;

    public Long getSaleId() { return saleId; }
    public void setSaleId(Long saleId) { this.saleId = saleId; }

    public Costumer getCustomer() { return customer; }
    public void setCustomer(Costumer customer) { this.customer = customer; }

    public List<SaleItem> getSaleItems() { return saleItems; }
    public void setSaleItems(List<SaleItem> saleItems) { this.saleItems = saleItems; }

    public Staff getStaff() { return staff; }
    public void setStaff(Staff staff) { this.staff = staff; }

    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) { this.totalSale = totalSale; }

    public double getTip() { return tip; }
    public void setTip(double tip) { this.tip = tip; }

}
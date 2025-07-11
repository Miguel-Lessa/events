package com.example.eventmanager.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

@Entity
@Table(name = "expenses")
public class Expenses {

    private List<Item> items;
    private List <Staff> staff;
    private List <Attraction> attractions;

    public List<Attraction> getAttractions() {
        return attractions;
    }
    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public List<Staff> getStaff() {
        return staff;
    }
    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
    
}

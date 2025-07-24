package com.example.eventmanager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private double wage;
    private String telephone;
    private String password;

    private Role role; 

    public Staff(Long id, String name, String email, double wage, String telephone, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.wage = wage;
        this.telephone = telephone;
        this.role = role;
        this.password = password;
    }

    public enum Role {
    ADMIN, MANAGER, WAITER
}

public Role getRole() {
    return role;
}

public void setRole(Role role) {
    this.role = role;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

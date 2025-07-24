package com.example.eventmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.eventmanager.repository.StaffRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.eventmanager.model.Staff.Role;
import com.example.eventmanager.model.Staff;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

@Autowired
private StaffRepository staffRepository;

@PostMapping("/login")
public String login(@RequestParam String email,
                    @RequestParam String password,
                    @RequestParam Role role){


    Optional<Staff> staffOpt = staffRepository.findByEmailAndPasswordAndRole(email, password, role);
                        if (staffOpt.isPresent()){
                            switch (role) {
                                case ADMIN:
                                    return "redirect:/homeAdmin";
                                case MANAGER:
                                    return "redirect:/homeManager";
                                case WAITER:
                                    return "redirect:/homeWaiter";
                                default:
                                     return "error";
                            }
                        } else {
                            return "login";
                        }
                      }
                    }
            
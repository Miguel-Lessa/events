package com.example.eventmanager.repository;

import com.example.eventmanager.model.Staff.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.eventmanager.model.Staff;




public interface StaffRepository extends JpaRepository<Staff, Long> {
    Optional<Staff> findByEmail(String email);
    Optional<Staff> findByPassword(String password);
    Optional<Staff> findByRole(Role role);
    Optional<Staff> findByEmailAndPasswordAndRole(String email, String password, Role role);
}
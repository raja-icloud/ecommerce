package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.models.User;

@Repository
public interface UserRep extends JpaRepository<User, Long> {
    // Additional query methods can be defined here if needed

    
}

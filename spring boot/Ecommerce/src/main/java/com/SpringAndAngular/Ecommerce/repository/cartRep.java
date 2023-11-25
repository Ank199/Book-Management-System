package com.SpringAndAngular.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAndAngular.Ecommerce.modal.cart;

public interface cartRep extends JpaRepository<cart,Integer> {

    
} 

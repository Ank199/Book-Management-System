package com.SpringAndAngular.Ecommerce.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringAndAngular.Ecommerce.modal.cart;

@Service
public interface cartService {

    public String AddToCart(cart Cart);
    public List<cart>getAllCart();
    public String Remove(Integer Id);
    
} 

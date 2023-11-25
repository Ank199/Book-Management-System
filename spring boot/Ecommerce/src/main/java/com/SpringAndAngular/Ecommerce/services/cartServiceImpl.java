package com.SpringAndAngular.Ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAndAngular.Ecommerce.modal.cart;
import com.SpringAndAngular.Ecommerce.repository.cartRep;

@Service
public class cartServiceImpl implements cartService{

    @Autowired
    cartRep cartService;
    @Override
    public String AddToCart(cart Cart) {
        cartService.save(Cart);
        return "cart added successfully";
    }

    @Override
    public List<cart> getAllCart() {
        return cartService.findAll();
    }
    
    @Override
    public String Remove(Integer Id) {
        cartService.deleteById(Id);
        return "deleted";
    }
    
}

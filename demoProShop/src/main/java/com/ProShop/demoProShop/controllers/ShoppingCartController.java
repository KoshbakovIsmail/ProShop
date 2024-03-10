package com.ProShop.demoProShop.controllers;


import com.ProShop.demoProShop.services.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void addItemToCart(@RequestParam("itemId") List<Integer> itemIds) {
        shoppingCartService.addItem(itemIds);
    }

    @GetMapping("get")
    public List<Integer> getItemInCart() {
       return shoppingCartService.getItemId();
    }

}


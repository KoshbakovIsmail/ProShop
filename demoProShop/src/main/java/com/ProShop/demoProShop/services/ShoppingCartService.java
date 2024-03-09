package com.ProShop.demoProShop.services;


import java.util.List;

public interface ShoppingCartService {

    void addItem(int itemId);

    List<Integer> getItemId();

}

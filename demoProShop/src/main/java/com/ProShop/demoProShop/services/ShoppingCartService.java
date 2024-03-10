package com.ProShop.demoProShop.services;


import java.util.List;

public interface ShoppingCartService {

    void addItem(List<Integer> itemIds);

    List<Integer> getItemId();

}

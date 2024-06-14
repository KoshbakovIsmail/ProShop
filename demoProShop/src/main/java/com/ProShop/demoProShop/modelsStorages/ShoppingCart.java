package com.ProShop.demoProShop.modelsStorages;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ShoppingCart {

    private final List<Integer> itemIdBasket = new ArrayList<>();

    public void addItems(List<Integer> itemsIds) {
        itemIdBasket.addAll(itemsIds);
    }

    public List<Integer> getItemIds() {
        return itemIdBasket;
    }
}

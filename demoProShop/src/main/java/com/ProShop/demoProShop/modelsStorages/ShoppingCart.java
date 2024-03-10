package com.ProShop.demoProShop.modelsStorages;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> itemIdBasket = new ArrayList<>();

    public void addItems(List<Integer> itemIds) {
        for (int itemId : itemIds) {
            itemIdBasket.add(itemId);
        }
    }

    public List<Integer> getItemIds() {
        return itemIdBasket;
    }
}

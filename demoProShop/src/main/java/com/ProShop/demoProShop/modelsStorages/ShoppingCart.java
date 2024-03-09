package com.ProShop.demoProShop.modelsStorages;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer>itemIds  = new ArrayList<>();

    public void addItems(int itemId) {
        itemIds.add(itemId);
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }
}

package com.ProShop.demoProShop.services;

import com.ProShop.demoProShop.modelsStorages.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addItem(List<Integer> itemIds) {
        shoppingCart.addItems(itemIds);
    }

    @Override
    public List<Integer> getItemId() {
        return shoppingCart.getItemIds();
    }

}

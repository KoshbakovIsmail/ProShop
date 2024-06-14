package com.ProShop.demoProShop.services;

import com.ProShop.demoProShop.modelsStorages.ShoppingCart;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;
    private final HttpSession httpSession;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart, HttpSession httpSession) {
        this.shoppingCart = shoppingCart;
        this.httpSession = httpSession;
    }

    private static final String SHOPPING_CART_ATTRIBUTE_NAME = "shoppingCart";

    @Override
    public void addItem(List<Integer> itemsIds) {
        ShoppingCart shoppingCart = getOrCreateShoppingCart();
        shoppingCart.addItems(itemsIds);
    }

    @Override
    public List<Integer> getItemId() {
        ShoppingCart shoppingCart = getOrCreateShoppingCart();
        return shoppingCart.getItemIds();
    }

    private ShoppingCart getOrCreateShoppingCart() {
        ShoppingCart shoppingCart = (ShoppingCart) httpSession.getAttribute(SHOPPING_CART_ATTRIBUTE_NAME);
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCart();
            httpSession.setAttribute(SHOPPING_CART_ATTRIBUTE_NAME, shoppingCart);
        }
        return shoppingCart;
    }
}

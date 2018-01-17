package com.cart.CartHandler.services;

import com.cart.CartHandler.entity.Cart;
import com.cart.CartHandler.entity.CartIdentity;

import java.util.List;

public interface CartService {

    public boolean addToCart(Cart data);
    public boolean incrementQuantity(String cartId,String prodId);
    public boolean decrementQuantity(String cartId,String prodId);
    public boolean removeProductFromCart(String cartId,String prodId);
public Cart findOne(String cartId,String prodId);

    public List<Cart> findOneByCartId(String cartId);
}

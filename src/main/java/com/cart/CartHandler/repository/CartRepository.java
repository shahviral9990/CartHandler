package com.cart.CartHandler.repository;

import com.cart.CartHandler.entity.Cart;
import com.cart.CartHandler.entity.CartIdentity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart,CartIdentity> {

   // public boolean update(Cart c);
    public List<Cart> findByCartIdentityCartId(String cartID);
    public int countByCartIdentityCartId(String cartId);

}

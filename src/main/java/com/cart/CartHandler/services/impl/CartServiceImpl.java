package com.cart.CartHandler.services.impl;

import com.cart.CartHandler.entity.Cart;
import com.cart.CartHandler.entity.CartIdentity;
import com.cart.CartHandler.repository.CartRepository;
import com.cart.CartHandler.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class CartServiceImpl implements CartService {


    @Autowired
    CartRepository cartRepository;


    @Override
    public boolean addToCart(Cart data) {
        if (cartRepository.exists(new CartIdentity(data.getCartIdentity().getCartId(), data.getCartIdentity().getProductId()))) {
            return incrementQuantity(data.getCartIdentity().getCartId(), data.getCartIdentity().getProductId());
        } else {
            if (cartRepository.countByCartIdentityCartId(data.getCartIdentity().getCartId()) < 4) {
                Cart responseData = cartRepository.save(data);
                if (responseData != null)
                    return true;
                return false;
            } else {
                return false;
            }
        }

    }

    @Override
    public boolean incrementQuantity(String cartId, String prodId) {
        Cart tempData = cartRepository.findOne(new CartIdentity(cartId, prodId));
        tempData.setQuantity(tempData.getQuantity() + 1);
        cartRepository.save(tempData);
        return true;
    }

    @Override
    public boolean decrementQuantity(String cartId, String prodId) {
        Cart tempData = cartRepository.findOne(new CartIdentity(cartId, prodId));
        tempData.setQuantity(tempData.getQuantity() - 1);
        cartRepository.save(tempData);
        return true;

    }

    @Override
    public boolean removeProductFromCart(String cartId, String prodId) {
        cartRepository.delete(new CartIdentity(cartId, prodId));
        return true;
    }


    @Override
    public Cart findOne(String cartId, String prodId) {
        return cartRepository.findOne(new CartIdentity(cartId, prodId));
    }



    @Override
    public List<Cart> findOneByCartId(String cartId) {
        return cartRepository.findByCartIdentityCartId(cartId);
    }
}

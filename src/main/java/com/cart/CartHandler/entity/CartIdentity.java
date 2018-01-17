package com.cart.CartHandler.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Embeddable
public class CartIdentity implements Serializable {
    @NotNull
    private String cartId;

    public CartIdentity() {
    }

    public CartIdentity(String cartId, String productId) {
        this.cartId = cartId;
        this.productId = productId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    @NotNull
    private String productId;
}

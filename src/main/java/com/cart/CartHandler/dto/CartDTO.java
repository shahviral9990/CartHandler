package com.cart.CartHandler.dto;

import com.cart.CartHandler.entity.CartIdentity;

import javax.persistence.JoinColumn;
import java.util.Map;

public class CartDTO {
    private static final Integer MAX_LIMIT=4;
    //email
     private CartIdentity cartIdentity;
    private int price;
    private String sellerId;
    private int quantity;
    private String productName;
    private String sellerName;



    private String productImage;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public static Integer getMaxLimit() {
        return MAX_LIMIT;
    }

    public CartIdentity getCartIdentity() {
        return cartIdentity;
    }

    public void setCartIdentity(CartIdentity cartIdentity) {
        this.cartIdentity = cartIdentity;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}

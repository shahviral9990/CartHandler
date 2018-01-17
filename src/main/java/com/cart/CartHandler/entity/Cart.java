package com.cart.CartHandler.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name=Cart.TABLE_NAME)
public class Cart {
    private static final Integer MAX_LIMIT=4;
    //email
    @EmbeddedId
   private CartIdentity cartIdentity;
    private int price;
    private String sellerId;
    private int quantity;
    private String productName;
    private String sellerName;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    private String productImage;


    public CartIdentity getCartIdentity() {
        return cartIdentity;
    }

    public void setCartIdentity(CartIdentity cartIdentity) {
        this.cartIdentity = cartIdentity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static final String TABLE_NAME="cart_db";
    public static Integer getMaxLimit() {
        return MAX_LIMIT;
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

    public static String getTableName() {
        return TABLE_NAME;
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

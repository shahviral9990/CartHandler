package com.cart.CartHandler.dto;

import java.util.Map;

public class CartDTO {
    private static final Integer MAX_LIMIT=4;
    //email
    private String cartId;
    private Map<ProductDetailsDTO,Integer> productList;
    private String shipmentMethod;
    private String paymentMethod;
    private BillDTO cartBill;

    public static Integer getMaxLimit() {
        return MAX_LIMIT;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Map<ProductDetailsDTO, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<ProductDetailsDTO, Integer> productList) {
        this.productList = productList;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BillDTO getCartBill() {
        return cartBill;
    }

    public void setCartBill(BillDTO cartBill) {
        this.cartBill = cartBill;
    }
}

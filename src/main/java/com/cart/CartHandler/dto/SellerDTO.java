package com.cart.CartHandler.dto;

import java.util.Map;

public class SellerDTO {
    private String sellerId;
    private Map<String,SellerProductDetailsDTO> productList;
    private Map<String,Long> soldList;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Map<String, SellerProductDetailsDTO> getProductList() {
        return productList;
    }

    public void setProductList(Map<String, SellerProductDetailsDTO> productList) {
        this.productList = productList;
    }

    public Map<String, Long> getSoldList() {
        return soldList;
    }

    public void setSoldList(Map<String, Long> soldList) {
        this.soldList = soldList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    private String name;
    private String address;
    private long phoneNumber;
    private int rate;

}

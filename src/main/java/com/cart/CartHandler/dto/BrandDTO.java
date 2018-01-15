package com.cart.CartHandler.dto;

public class BrandDTO {
   private String brandId;
    private String brandName;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDetails() {
        return brandDetails;
    }

    public void setBrandDetails(String brandDetails) {
        this.brandDetails = brandDetails;
    }

    private String brandDetails;
}

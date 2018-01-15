package com.cart.CartHandler.dto;

import java.util.List;

public class ProductDetailsDTO {
    private String productId;
    private String productName;
    private long price;
    private BrandDTO brandDetails;
    private String imageUrl;
    private List<String>  imageList;
    private String USP;
private List<SellerDTO> sellerList;
private SellerDTO selectedSeller;
private SpecsDTO specsDetails;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public BrandDTO getBrandDetails() {
        return brandDetails;
    }

    public void setBrandDetails(BrandDTO brandDetails) {
        this.brandDetails = brandDetails;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getUSP() {
        return USP;
    }

    public void setUSP(String USP) {
        this.USP = USP;
    }

    public List<SellerDTO> getSellerList() {
        return sellerList;
    }

    public void setSellerList(List<SellerDTO> sellerList) {
        this.sellerList = sellerList;
    }

    public SellerDTO getSelectedSeller() {
        return selectedSeller;
    }

    public void setSelectedSeller(SellerDTO selectedSeller) {
        this.selectedSeller = selectedSeller;
    }

    public SpecsDTO getSpecsDetails() {
        return specsDetails;
    }

    public void setSpecsDetails(SpecsDTO specsDetails) {
        this.specsDetails = specsDetails;
    }
}

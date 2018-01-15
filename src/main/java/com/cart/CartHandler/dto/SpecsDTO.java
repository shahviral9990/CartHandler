package com.cart.CartHandler.dto;

import java.util.Map;

public class SpecsDTO {
    private String specsId;

    public String getSpecsId() {
        return specsId;
    }

    public void setSpecsId(String specsId) {
        this.specsId = specsId;
    }

    public Map<SpecsDetailsDTO, Boolean> getSpecsList() {
        return specsList;
    }

    public void setSpecsList(Map<SpecsDetailsDTO, Boolean> specsList) {
        this.specsList = specsList;
    }

    private Map<SpecsDetailsDTO,Boolean> specsList;



}

package com.cart.CartHandler.dto;

public class BillDTO {
    private String billId;
    private long cartPrice;
    private long shipmentCost;
    private long tax;
    private long payableAmount;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public long getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(long cartPrice) {
        this.cartPrice = cartPrice;
    }

    public long getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(long shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public long getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(long payableAmount) {
        this.payableAmount = payableAmount;
    }
}

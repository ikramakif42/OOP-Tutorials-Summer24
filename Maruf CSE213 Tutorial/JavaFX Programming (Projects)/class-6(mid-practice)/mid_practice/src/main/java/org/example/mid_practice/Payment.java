package org.example.mid_practice;

public class Payment {
    private String productName;
    private Double unitPrice;
    private Integer quantity;
    private Double predefinedVat;
    private Double vatAmount;
    private Double totalAmount;

    // Constructors

    public Payment(String productName, Double unitPrice, Integer quantity, Double predefinedVat, Double vatAmount, Double totalAmount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.predefinedVat = predefinedVat;
        this.vatAmount = vatAmount;
        this.totalAmount = totalAmount;
    }

    public Payment() {

    }

    // getter and setter


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPredefinedVat() {
        return predefinedVat;
    }

    public void setPredefinedVat(Double predefinedVat) {
        this.predefinedVat = predefinedVat;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // generate to string


    @Override
    public String toString() {
        return "Payment{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", predefinedVat=" + predefinedVat +
                ", vatAmount=" + vatAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

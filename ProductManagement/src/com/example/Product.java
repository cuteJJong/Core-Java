package com.example;

public class Product {
    private String name;    //제품명
    private int quantity;   //수량
    private int sellPrice;  //판매단가
    private int buyPrice;   //매입단가
    private int transport;  //운송료
    private int benefit;    //이익금
    private double rate;    //이익률


    public Product(String name, int quantity, int sellPrice, int buyPrice, int transport) {
        this.name = name;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return String.format("%-12s\t%,7d\t%,7d\t%,7d\t%,7d\t%,10d\t%7.2f",
                name, quantity, sellPrice, buyPrice, benefit, benefit, rate);

    }
}

package org.example.sweets;

public abstract class Cart {
    private String brand;
    private Double price;
    private int weight;

    public Cart(String brand, Double price, int weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return brand + ", price = " + price + " руб." + ", weight = " + weight + " г.";
    }
}

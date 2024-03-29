package org.example.sweets;

public class Candies extends Cart {
    private String special3;
    public Candies(String brand, Double price, int weight, String special3) {
        super(brand, price, weight);
        this.special3 = special3;
    }

    public String getSpecial3() {
        return special3;
    }

    public void setSpecial2(String special3) {
        this.special3 = special3;
    }

    @Override
    public String toString(){
        return "Конфеты - (" + super.toString() + ", особенность - " + special3 + ")";
    }
}

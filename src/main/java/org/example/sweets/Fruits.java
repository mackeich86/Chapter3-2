package org.example.sweets;

public class Fruits extends Cart{
    private String special;
    public Fruits(String brand, Double price, int weight, String special) {
        super(brand, price, weight);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString(){
        return "Фрукты - (" + super.toString() + ", особенность - " + special + ")";
    }
}

package org.example.sweets;

public class Cakes extends Cart {
    private String special2;
    public Cakes(String brand, Double price, int weight, String special2) {
        super(brand, price, weight);
        this.special2 = special2;
    }

    public String getSpecial2() {
        return special2;
    }

    public void setSpecial2(String special2) {
        this.special2 = special2;
    }

    @Override
    public String toString(){
        return "Торт - (" + super.toString() + ", особенность - " + special2 + ")";
    }
}

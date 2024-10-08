package com.ps;

public class Candy {
   private String name;
   private float price;
    private String flavor;
    private short quantity;

    public Candy(String name, short quantity, String flavor, float price) {
        this.name = name;
        this.quantity = quantity;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

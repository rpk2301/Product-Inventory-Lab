package models;

public class Whiskey {
    String brand;
    String name;
    float price;

    public Whiskey()
    {

    }
    public Whiskey(String brand, String name, float price)
    {
        this.brand=brand;
        this.name = name;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

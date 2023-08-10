package models;

public class Sneaker {

    private  int id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int qty;
    private float price;

    public Sneaker()
    {

    }

    public Sneaker(int expectedId, String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice) {
        this.id = expectedId;
        this.name = expectedName;
        this.brand = expectedBrand;
        this.sport = expectedSport;
        this.qty = expectedQty;
        this.price = expectedPrice;
    }

    public Sneaker(int i, String name, String brand, String sport, float size, int quantity, float price) {
        this.id = i;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = quantity;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

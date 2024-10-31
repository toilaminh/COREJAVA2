package org.example;

public class Product {
    protected String name;
    protected int quantity;
    protected int price;
    public Product(){}
    public Product(String n, int q, int p){
        name = n;
        quantity = q;
        price = p;
    }
    public void displayAll(){
        System.out.println("= = = = =");
        System.out.println("Name : " + getName() + "\nQuantity: " + getQuantity() + "\nPrice: " + getPrice());
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

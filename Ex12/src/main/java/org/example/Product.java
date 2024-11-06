package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private static int id_ind = 0;
    private int id;
    private String name;
    private double price;
    private LocalDate date;
    public Product(String name, double price, LocalDate date){
        this.id = id_ind;
        this.name = name;
        this.price = price;
        if(!date.isAfter(LocalDate.now())){
            this.date = date;
        }
        else {
            this.date = LocalDate.now();
        }
        id_ind += 1;
    }
    public Product(String name, double price){
        this.id = id_ind;
        this.name = name;
        this.price = price;
        this.date = LocalDate.now();
        id_ind += 1;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getId_ind(){
        return id_ind;
    }
}

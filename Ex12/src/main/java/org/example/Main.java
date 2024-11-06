package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> all_product = new ArrayList<>();
        Product a = new Product("Dau an", 5, LocalDate.parse("2024-10-21"));
        Product b = new Product("Kem", 0.5, LocalDate.parse("2024-07-14"));
        Product c = new Product("Coca-Cola", 7, LocalDate.parse("2024-09-25"));
        Product d = new Product("Thit bo", 6);
        all_product.add(a);
        all_product.add(b);
        all_product.add(c);
        all_product.add(d);
        System.out.println("=== Before sort by name ===");
        display(all_product);
        System.out.println("=== After sort by name ===");
        sortByName(all_product);
        display(all_product);
        System.out.println("=== After sort by price ===");
        sortByPrice(all_product);
        display(all_product);
        System.out.println("=== After sort by date ===");
        sortByDate(all_product);
        display(all_product);
        System.out.println("=== After sort by price and date ===");
        sortByPriceDate(all_product);
        display(all_product);
    }
    public static void display(ArrayList<Product> l){
        for (Product i : l){
            System.out.println("ID: " + i.getId() + " - Name: " + i.getName() + " - Price: " + i.getPrice() + " - Date: " + i.getDate());
        }
    }
    public static void sortByName(ArrayList<Product> l){
        for(int i = 0;i < l.size() - 1;i++){
            for (int j = i+1;j < l.size();j++){
                if(l.get(i).getName().compareTo(l.get(j).getName()) == 1){
                    Collections.swap(l,i,j);
                }
            }
        }
    }

    public static void sortByPrice(ArrayList<Product> l){
        for(int i = 0;i < l.size() - 1;i++){
            for (int j = i+1;j < l.size();j++){
                if(l.get(i).getPrice() > l.get(j).getPrice()){
                    Collections.swap(l,i,j);
                }
            }
        }
    }

    public static void sortByDate(ArrayList<Product> l){
        for(int i = 0;i < l.size() - 1;i++){
            for (int j = i+1;j < l.size();j++){
                if(l.get(i).getDate().isAfter(l.get(j).getDate())){
                    Collections.swap(l,i,j);
                }
            }
        }
    }

    public static void sortByPriceDate(ArrayList<Product> l){
        for(int i = 0;i < l.size() - 1;i++){
            for (int j = i+1;j < l.size();j++){
                if(l.get(i).getDate().isAfter(l.get(j).getDate()) && l.get(i).getPrice() > l.get(j).getPrice()){
                    Collections.swap(l,i,j);
                }
            }
        }
    }
}
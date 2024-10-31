package org.example;

import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int INDEX = 0;
    public static void main(String[] args) {
        HashMap<Integer,Product> products = new HashMap<>();
        addNewProduct(products, "Dau an",30,90000);
        addNewProduct(products, "Xoong",20,290000);
        addNewProduct(products, "Coca",50,20000);
        addNewProduct(products, "Mioi I-Ot",23,10000);
        INDEX++;
        displayAll(products);
        System.out.println("Find product with id 2");
        if(findById(products,2) != null){
            displayById(products,2);
        }
        else {
            System.out.println("Can't find product with id 2!");
        }
        System.out.println("Find product with id 5");
        if(findById(products,5) != null){
            displayById(products,5);
        }
        else {
            System.out.println("Can't find product with id 5...");
        }
        System.out.println("Remove product with id 2");
        if(findById(products,2) != null){
            removeById(products,2);
            System.out.println("Product with id 2 has been removed!");
        }
        else {
            System.out.println("Can't find product with id 2!");
        }
        System.out.println("Updating product with id 3...");
        updateProduct(products,3,"Ca ro phi", 7, 30000);
        System.out.println("Product with id 3:");
        displayById(products,3);
    }

    public static void addNewProduct(HashMap<Integer, Product> products, String name, int quantity, int price){
        Product product = new Product(name, quantity, price);
        products.put(INDEX,product);
        INDEX++;
    }

    public static void displayAll(HashMap<Integer, Product> products){
        for(int i : products.keySet()){
            Product p = products.get(i);
            System.out.println("= = = = =");
            System.out.println("Name : " + p.getName() + "\nQuantity: " + p.getQuantity() + "\nPrice: " + p.getPrice());
        }
    }

    public static void displayById(HashMap<Integer, Product> products, int id){
        for(int i : products.keySet()){
            if(i == id){
                Product p = products.get(i);
                System.out.println("= = = = =");
                System.out.println("Name : " + p.getName() + "\nQuantity: " + p.getQuantity() + "\nPrice: " + p.getPrice());
                break;
            }
        }
    }

    public static Product findById(HashMap<Integer, Product> products, int id){
        Product p = null;
        for(int i : products.keySet()){
            if(i == id){
                p = products.get(i);
                break;
            }
        }
        return p;
    }

    public static void removeById(HashMap<Integer, Product> products, int id){
        products.remove(id);
    }

    public static void updateProduct(HashMap<Integer, Product> products, int id, String name, int quantity, int price){
        Product p = null;
        for(int i : products.keySet()){
            if(i == id){
                p = products.get(i);
                p.setName(name);
                p.setQuantity(quantity);
                p.setPrice(price);
                break;
            }
        }
    }
}
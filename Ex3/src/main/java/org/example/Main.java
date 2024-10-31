package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        addElement(person, "Minh", 22);
        addElement(person, "Hoang", 21);
        addElement(person, "Dung", 23);
        showElements(person);
        findAgePersonByName(person, "Hoang");
        removeOnePerson(person, "Minh");
        if(checkOnePersonExist(person, "Dung")){
            System.out.println("Dung co trong danh sach!");
        }
        else {
            System.out.println("Dung khong co trong danh sach!");
        }
        if(checkOnePersonExist(person, "Minh")){
            System.out.println("Minh co trong danh sach!");
        }
        else {
            System.out.println("Minh khong co trong danh sach!");
        }
    }

    private static void addElement(HashMap<String, Integer> person, String name, int age) {
        person.put(name, age);
    }

    private static void showElements(HashMap<String, Integer> person) {
        for (String name : person.keySet()) {
            System.out.println(name + " " + person.get(name));
        }
    }

    private static void findAgePersonByName(HashMap<String, Integer> person, String nameOfPerson) {
        for (String name : person.keySet()) {
            if(name.equals(nameOfPerson)) {
                System.out.println("The age of " +  name + " is " + person.get(name));
            }
        }
    }

    private static void removeOnePerson(HashMap<String, Integer> person, String nameOfPerson) {
        person.remove(nameOfPerson);
    }

    private static boolean checkOnePersonExist(HashMap<String, Integer> person, String nameOfPerson) {
        if(person.containsKey(nameOfPerson)) {
            return true;
        } else {
            return false;
        }
    }
}
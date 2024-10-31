package org.example;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> listNational = new HashSet<>();
        addNational(listNational,"Viet Nam");
        addNational(listNational,"USA");
        addNational(listNational,"Japan");
        showNational(listNational);
        System.out.println("The list after: ");
        removeNational(listNational,"USA");
        calculateNumberNational(listNational);
        if(checkNationExistInList(listNational,"Viet Nam"))
        {
            System.out.println("Viet Nam is exist in the list");
        }
        else {
            System.out.println("Viet Nam isn't exist in the list");
        }
        if(checkNationExistInList(listNational,"USA"))
        {
            System.out.println("USA is exist in the list");
        }
        else {
            System.out.println("USA isn't exist in the list");
        }
    }

    private static void addNational(HashSet<String> national, String nameCountry) {
        national.add(nameCountry);
    }

    private static void showNational(HashSet<String> national) {
        for (String nameCountry : national) {
            System.out.println(nameCountry + " ");
        }
    }

    private static void removeNational(HashSet<String> national, String nameCountry) {
        national.remove(nameCountry);
        showNational(national);
    }

    private static void calculateNumberNational(HashSet<String> national) {
        System.out.println("Number of national: " + national.size());
    }

    private static boolean checkNationExistInList(HashSet<String> national, String nameCountry) {
        if (national.contains(nameCountry)) {
            return true;
        } else {
            return false;
        }
    }
}
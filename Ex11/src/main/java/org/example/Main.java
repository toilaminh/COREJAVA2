package org.example;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        boolean flag = true;
        while (flag){
            System.out.println("=======================");
            System.out.println("    1. Add new word");
            System.out.println("    2. Search word");
            System.out.println("    0. Exit");
            System.out.println("=======================");
            System.out.print("    ==> ");
            int chose;
            try{
                Scanner x = new Scanner(System.in);
                chose = x.nextInt();
                Scanner y = new Scanner(System.in);
                switch (chose){
                    case 1:
                        System.out.print(" Your word ==> ");
                        String word = y.nextLine();
                        System.out.print(" Your description ==> ");
                        String des = y.nextLine();
                        dictionary.put(word,des);
                        break;
                    case 2:
                        System.out.print(" Your word ==> ");
                        String search = y.nextLine();
                        System.out.println("=======================");
                        System.out.println(" Your word : " + search);
                        if (!dictionary.get(search).equals("")) {
                            System.out.println(" Description : " + dictionary.get(search));
                        }
                        break;
                    case 0:
                        flag = false;
                        break;
                }

            }
            catch (Exception exception){
                clearScreen();
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
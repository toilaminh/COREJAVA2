package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr_large1,arr_large2;
        while (true){
            try{
                System.out.print("Your array length 1: ");
                Scanner input = new Scanner(System.in);
                arr_large1 = input.nextInt();
                if(arr_large1 > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        while (true){
            try{
                System.out.print("Your array length 2: ");
                Scanner input = new Scanner(System.in);
                arr_large2 = input.nextInt();
                if(arr_large2 > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr_large1; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    set1.add(input.nextInt());
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        for (int i = 0; i < arr_large2; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    set2.add(input.nextInt());
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        System.out.println("Intersection of 2 sets:");
        for(int i : set1){
            for (int j : set2){
                if(i == j){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
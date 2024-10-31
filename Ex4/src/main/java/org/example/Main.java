package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        arr.add(0);
        arr.add(7);
        arr.add(-5);
        System.out.println("Before sort:");
        display(arr);
        System.out.println("Increase sort:");
        Collections.sort(arr);
        display(arr);
        System.out.println("Decrease sort:");
        Collections.sort(arr, Collections.reverseOrder());
        display(arr);
    }
    public static void display(ArrayList<Integer> l){
        for (int i : l){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
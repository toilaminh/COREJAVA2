package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        displayList(arrayList);
        System.out.println(maxList(arrayList));
        System.out.println(minList(arrayList));
        del(arrayList,3);
        displayList(arrayList);
        if(indexOf(arrayList,2)){
            System.out.println("2 is a part of Arraylist");
        }
        else {
            System.out.println("2 isn't a part of Arraylist");
        }
        if(indexOf(arrayList,5)){
            System.out.println("5 is a part of Arraylist");
        }
        else {
            System.out.println("5 isn't a part of Arraylist");
        }

    }

    public static void displayList(List<Integer> l){
        System.out.print("{ ");
        for (int i : l){
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
    public static int sumAll(List<Integer> l){
        int sum = 0;
        for (int i : l){
            sum += i;
        }
        return sum;
    }
    public static int maxList(List<Integer> l){
        int max = l.get(0);
        for (int i : l){
            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static int minList(List<Integer> l){
        int min = l.get(0);
        for (int i : l){
            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static void del(List<Integer> l, int x){
        List<Integer> result = new ArrayList<>();
        for (int i : l){
            if (i != x){
                result.add(i);
            }
        }
        l.clear();
        l.addAll(result);
    }
    public static boolean indexOf(List<Integer> l, int x){
        if(l.contains(x)){
            return true;
        }
        else
            return false;
    }
}
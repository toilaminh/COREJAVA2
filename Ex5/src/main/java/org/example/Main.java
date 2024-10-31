package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
//        int[] result = twoIndex(arr,target);
        System.out.print("[ ");
        for (int i : twoIndex(arr,target)){
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
    public static int[] twoIndex(int[] arr, int target){
        for (int i = 0;i < arr.length-1;i++){
            for (int j = i+1;j < arr.length;i++){
                if(arr[i] + arr[j] == target){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        int[] result = null;
        return result;
    }
}
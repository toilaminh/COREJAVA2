package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] price = {7,1,4,5,6,3};

        System.out.print("[ ");
        System.out.print(hightestProfit(price));
        System.out.println(" ]");
    }
    // Buy and Sell
    public static int hightestProfit(int[] arr){
        int highest_pr = 0;
        for (int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(highest_pr < arr[j] - arr[i]){
                    highest_pr = arr[j] - arr[i];
                }
            }
        }
        return highest_pr;
    }
}
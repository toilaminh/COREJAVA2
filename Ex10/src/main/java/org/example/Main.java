package org.example;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<>();
        int arr_large;
        while (true){
            try{
                System.out.print("Your array length: ");
                Scanner input = new Scanner(System.in);
                arr_large = input.nextInt();
                if(arr_large > 0){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong input! Please try again!");
            }
        }
        double[] str_arr = new double[arr_large];
        for (int i = 0; i < arr_large; i++){
            while (true)
            {
                try{
                    System.out.print("Your number " + i + ": ");
                    Scanner input = new Scanner(System.in);
                    str_arr[i] = input.nextDouble();
                    break;
                }
                catch (Exception e){
                    System.out.println("Wrong input! Please try again!");
                }
            }
        }
        addScores(scoreMap, str_arr);
        display(scoreMap);
    }

    public static void addScores(HashMap<String, Integer> scoreMap ,double[] scores){
        int eight = 0, five = 0, under5 = 0;
        for (int i = 0;i <  scores.length;i++){
            if(scores[i] >= 8){
                eight += 1;
            } else if (scores[i] >= 5) {
                five += 1;
            }
            else {
                under5 += 1;
            }
        }
        scoreMap.put(">= 8.0",eight);
        scoreMap.put("<= 8.0 & >=5.0",five);
        scoreMap.put("< 5.0",under5);
    }

    public static void display(HashMap<String, Integer> scoreMap){
        System.out.println(">= 8.0         : " + scoreMap.get(">= 8.0"));
        System.out.println("<= 8.0 & >=5.0 : " + scoreMap.get("<= 8.0 & >=5.0"));
        System.out.println("< 5.0          : " + scoreMap.get("< 5.0"));
    }
}
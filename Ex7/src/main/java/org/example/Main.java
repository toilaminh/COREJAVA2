package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> students = new HashMap<>();
        addStudent(students, "Chien", List.of( 90, 90, 70));
        addStudent(students, "Thang", List.of( 85, 70, 95));
        addStudent(students, "De", List.of( 100, 90, 88));
        addStudent(students, "Quoc", List.of( 95, 80, 85));
        avgScores(students);
    }

    private static void addStudent(HashMap<String, List<Integer>> students, String name, List<Integer> score) {
        if (students.containsKey(name)) {
            students.get(name).addAll(score);
        } else {
            List<Integer> scores = new ArrayList<>();
            scores.addAll(score);
            students.put(name, scores);
        }
    }

    private static void avgScores(HashMap<String, List<Integer>> students) {
        for (String name : students.keySet()) {
            List<Integer> scores = students.get(name);
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            double average = (double) sum / scores.size();
            System.out.println( name + ": " + String.format("%.2f", average));
        }
    }
}
package org.example;

import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<List<String>, Integer> numberAppearOfWord = new HashMap<>();
        countWord(numberAppearOfWord, "  hello coder. my name is     Luu hoang minh. Welcome to my  program  hello  bro,");
    }

    private static void countWord(HashMap<List<String>, Integer> numberAppearOfWord, String str) {
        str = str.replaceAll("[^a-zA-Z ]", "").trim();
        String[] words = str.split("\\s+") ;
        for (String word : words) {
            int count = 0;
            for (String word1 : words) {
                if (word.equals(word1)) {

                    count++;
                }
            }
            numberAppearOfWord.put(List.of(word), count);
        }
        System.out.println(numberAppearOfWord);
    }
}
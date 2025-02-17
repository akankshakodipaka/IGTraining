package com.TaskSaturday;
public class Program6 {
    public static int calculateWordSum(String str) {
        String[] words = str.split(" ");
        if (words.length == 0) {
            return 0;
        }
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        if (firstWord.equals(lastWord)) {
            return firstWord.length();
        } else {
            return firstWord.length() + lastWord.length();
        }
    }
    public static void main(String[] args) {
        String input1 = "Insight Global Insight";
        String input2 = "Insight Global Evergreen";
        System.out.println(calculateWordSum(input1));
        System.out.println(calculateWordSum(input2));
    }
}


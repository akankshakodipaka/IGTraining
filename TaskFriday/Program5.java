package com.TaskSaturday;
public class Program5 {
    public static String getLastLetter(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = word.charAt(word.length() - 1);
                result.append(Character.toUpperCase(lastChar));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "This is the My First Experience";
        String finalString = getLastLetter(sentence);
        System.out.println(finalString); 
    }
}

package com.TaskSaturday;

public class Program1 {
    public static String getCapitalized(String sentence) {
        String[] words = sentence.split(" ");
        
        StringBuilder capitalizedSentence = new StringBuilder();
        
        for (String word : words) {
    
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "now is the time to act!";
        String capitalizedSentence = getCapitalized(sentence);
        System.out.println(capitalizedSentence);
    }
}

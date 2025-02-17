package com.TaskSaturday;
public class Program4 {
    public static String reshape(String str, char separator) {
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversedString.length(); i++) {
            result.append(reversedString.charAt(i));
            if (i < reversedString.length() - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Rabbit";
        char separator = '-';
        String finalString = reshape(str, separator);
        System.out.println(finalString);
    }
}

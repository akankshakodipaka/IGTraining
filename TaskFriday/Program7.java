package com.TaskSaturday;
public class Program7 {
    public static String convertFormat(String input) {
        String digits = input.replace("-", "");
        if (digits.length() != 10) {
            throw new IllegalArgumentException("Input must be a 10-digit number in the format XXX-XXX-XXXX");
        }
        String result = digits.substring(0, 2) + "-" +
                        digits.substring(2, 4) + "-" +
                        digits.substring(4, 7) + "-" +
                        digits.substring(7, 10);
        return result;
    }

    public static void main(String[] args) {
        String input = "7993622469";
        try {
            String output = convertFormat(input);
            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


package com.Exceptions;
public class Source {

    public static void main(String[] args) {
        Activity activity = new Activity("Hello", "Hai", "-");
        Source source = new Source();

        try {
            if (!source.validate(activity)) {
                throw new OperatorException("Invalid parameters");
            }

            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (OperatorException e) {
            e.printStackTrace();
        }
    }

    public boolean validate(Activity activity) {
        // If string1 or string2 or operator are null, throw NullPointerException and return false
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("String1, String2, or Operator cannot be null");
        }

        // If operator is other than + or -, throw OperatorException and return false
        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            return false;
        }

        // If no exception, return true
        return true;
    }

    public String doOperation(Activity activity) {
        // If operator is +, return concatenated string of string1 and string2.
        if (activity.getOperator().equals("+")) {
            return activity.getString1() + activity.getString2();
        }

        // If operator is -, return string1 - string2 i.e., removing characters in string1 that are present in string2
        if (activity.getOperator().equals("-")) {
            String result = activity.getString1();
            for (int i = 0; i < activity.getString2().length(); i++) {
                result = result.replace(String.valueOf(activity.getString2().charAt(i)), "");
            }
            return result;
        }

        return "";
    }
}

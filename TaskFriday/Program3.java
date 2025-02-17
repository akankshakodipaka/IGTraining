package com.TaskSaturday;
public class Program3 {

    public static boolean validatePAN(String pan) {
        
        if (pan.length() != 8) {
            return false;
        }
        
        String regex = "^[A-Z]{3}\\d{4}[A-Z]$";
        return pan.matches(regex);
    }

    public static void main(String[] args) {
        String pan1 = "ALD3245E";
        
        String pan2 = "OLE124F";
        
        System.out.println(validatePAN(pan1) ? "Valid" : "Invalid"); 
        System.out.println(validatePAN(pan2) ? "Valid" : "Invalid"); 
        }
}


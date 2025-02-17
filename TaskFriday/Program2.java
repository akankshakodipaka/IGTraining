package com.TaskSaturday;

public class Program2 {
    public static Integer findMaxDistance(int[] arr, int n) {
        if (arr == null || n < 2) {
            return -1;  
        }

        int maxDifference = 0;
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff > maxDifference) {
                maxDifference = diff;
                if (arr[i] > arr[i + 1]) {
                    index = i; 
                } else {
                    index = i + 1;
                }
            }
        }

        return index; 
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 1, 9, 4};
        int n = arr.length;
        Integer index = findMaxDistance(arr, n);
        System.out.println(index); 
    }
}


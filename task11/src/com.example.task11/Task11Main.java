package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[idx]) {
                idx = i;
            }
        }
        int min = arr[idx];
        arr[idx] = arr[0];
        arr[0] = min;
    }

}
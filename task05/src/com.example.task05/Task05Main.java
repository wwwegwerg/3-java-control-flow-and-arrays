package com.example.task05;

import java.util.Arrays;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5, 4, 3));
    }

    static int getMin(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        return Arrays.stream(arr).min().getAsInt();
    }
}
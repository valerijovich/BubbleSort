package com.company.valerijovich;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9999);
        }

        System.out.print("Initial array looks like this: ");
        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }

        System.out.print("Sorted array looks like this: ");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.print("]\n");
    }
}

package com.learn.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            int insertionElement = arr[unsortedIndex];

            int i;

            for (i = unsortedIndex; i > 0 && arr[i - 1] > insertionElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = insertionElement;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr.length - i == 1 ? arr[i] : arr[i] + ", ");

    }
}

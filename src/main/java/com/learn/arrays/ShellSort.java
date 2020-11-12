package com.learn.arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = arr.length/2; gap > 0; gap/=2) {

            for(int i = gap; i < arr.length; i++){
                int insertionElement = arr[i];

                int j = i;

                while(j >= gap && arr[j-gap] > insertionElement){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }

                arr[j] = insertionElement;
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr.length - i == 1 ? arr[i] : arr[i] + ", ");

    }
}

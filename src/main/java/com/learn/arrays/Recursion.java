package com.learn.arrays;

import java.util.Date;

public class Recursion {
    public static void main(String[] args) {
        long firstStartTime = new Date().getTime();
        System.out.println(iterativeFactorial(16));
        long intervalTime = new Date().getTime();
        System.out.println(recursiveFactorial(16));
        long secondEndTime = new Date().getTime();
        System.out.println("Iterative Factorial Time: " + (intervalTime - firstStartTime) * 1000000);
        System.out.println("Recursive Factorial Time: " + (secondEndTime - intervalTime) * 1000000);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num){
        if(1 == num)
            return 1;
        return num-- * recursiveFactorial(num);
    }
}

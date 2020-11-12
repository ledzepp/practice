package com.learn.solutions;

import java.util.Date;

public class SpiderMove {
    public static void main(String[] args) throws Exception {
        long startTime = new Date().getTime();
        int n = 10, m = 12;
        SpiderMove sm = new SpiderMove();
        System.out.println("Factorial of n: " + sm.calculateFactorial(n));
        System.out.println("Factorial of m: " + sm.calculateFactorial(m));
        long endTime = new Date().getTime();
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Time taken: " + (endTime - startTime));
    }

    private int calculateFactorial(int k) {
        if(0 == k || 1 == k){
            return 1;
        }
        
        return k * calculateFactorial(k-1);
    }

    /* int countPaths(int n, int m)
    {
        // If we reach bottom or top left, we are
        // have only one way to reach (0, 0)
        if (n == 0 || m == 0)
            return 1;
     
        // Else count sum of both ways
        return (countPaths(n - 1, m) + countPaths(n, m - 1));
    } */
}

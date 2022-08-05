package com.real1;

import java.util.Scanner;



public class Frequency2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of N");
            int N = sc.nextInt();
            System.out.println(minNum(N));
    }

    private static int minNum(int N) {
        int k = 0;
        int count = 0;
        while (N != k) {
            if (N > 0) {
                for (int i = N - k; i > 0; i--) {
                    if (pow2(i) || pow3(i)) {
                        k = k + i;
                        count++;
                        break;
                    }
                }
            } else {
                for (int i = N - k; i < 0; i++) {
                    if (pow2(i) || pow3(i)) {
                        k = k + i;
                        count++;
                        break;
                    }
                }
            }
        }
        if (N == k) {
            return count;
        }
        return -1;
    }

    private static boolean pow3(int N) {
        if(N<0){
           N=N*(-1);
        }
        while(N!=1){
            if(N%3!=0){
                return false;
            }
            N=N/3;
        }
        return true;
    }

    private static boolean pow2(int N) {
        if(N<0){
            N=N*(-1);
        }
        while(N!=1){
            if(N%2!=0){
                return false;
            }
            N=N/2;
        }
        return true;
    }

}
package com.real1;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        scan.close();
        System.out.print(minNum(N));
    }

    private static int minNum(int N) {
        int result=0;
        int k=9;
       if(9+0<=N&&N<=9+4){
           result=2;
       } else if (9+4<=N&&N<=13+2) {
           result=3;
       } else if (13+2<N) {
           result=1;
       }
        return result;
    }
}

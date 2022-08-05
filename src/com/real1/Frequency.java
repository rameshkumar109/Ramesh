package com.real1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array size  N");
        int N=scan.nextInt();
        System.out.println("Enter digit M");
        int M=scan.nextInt();
        int A[]=new int[N];
        for (int i = 0; i < N; i++) {
            A[i]= scan.nextInt();
        }
        System.out.println(elementFrequency(N,M,A));

    }

    private static int elementFrequency(int N, int M, int[] A) {
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])){
                hm.put(A[i],hm.get(A[i])+1);
            }else{
                hm.put(A[i],1);
            }
        }
        int ans=0;
        System.out.println(hm.keySet());
        System.out.println();
        for (int z: hm.keySet()) {
            int value=hm.get(z);
            if (value<M){
               ans+=M-value;
            }
        }
        return ans;
    }
}

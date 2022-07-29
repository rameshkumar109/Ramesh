package com.real;

import java.util.Scanner;

public class CountingRepeated {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        System.out.println(s.length());
        int distinct=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    distinct++;
                }
                System.out.println(s.charAt(i)+" "+distinct);
                String d=String.valueOf(s.charAt(i)).trim();
                s=s.replaceAll(d, "");
                distinct=0;
            }
        }
    }
}

package com.real;

import java.util.Scanner;

public class Example {
    public static int maxOne(int n,int m){

        int ans = 0;
        String S="";

        int i = 0;

        // Traversing the string
        while (i < n) {

            // Count of consecutive 0's & 1's
            int cnt0 = 0, cnt1 = 0;

            // Counting subarrays of type "01"
            if (S.charAt(i) == '0') {

                // Count the consecutive 0's
                while (i < n && S.charAt(i) == '0') {
                    cnt0++;
                    i++;
                }

                // If consecutive 0's ends then check for
                // consecutive 1's
                int j = i;

                // Counting consecutive 1's
                while (j < n && S.charAt(j) == '1') {
                    cnt1++;
                    j++;
                }
            }

            // Counting subarrays of type "10"
            else {

                // Count consecutive 1's
                while (i < n && S.charAt(i) == '1') {
                    cnt1++;
                    i++;
                }

                // If consecutive 1's ends then check for
                // consecutive 0's
                int j = i;

                // Count consecutive 0's
                while (j < n && S.charAt(j) == '0') {
                    cnt0++;
                    j++;
                }
            }

            // Update the total count of substrings with
            // minimum of (cnt0, cnt1)
            ans += Math.min(cnt0, cnt1);
        }

        // Return answer
        return ans;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int n=Integer.parseInt((scan.nextLine().trim()));
        int m=Integer.parseInt((scan.nextLine().trim()));
        int result=maxOne(n,m);
        System.out.println(result);
    }
}

package com.real1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int temperature_size= scan.nextInt();
        int temperature[]=new int[temperature_size];
        for (int idx = 0; idx < temperature_size; idx++) {
            temperature[idx]=scan.nextInt();
        }
        int result=productsAtNegativeTemp(temperature);
        System.out.println(result);
    }

    private static int productsAtNegativeTemp(int[] temperature) {
        int answer=0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i]<0){
                answer++;
            }
        }
        return answer;
    }
}

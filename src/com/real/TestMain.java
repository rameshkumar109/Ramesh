package com.real;

public class TestMain {
    public static void main(String[] args) {
        for(int i = 100; i < 10000;i++ ){
            if(i%111 == 0){
                System.out.println(i);
            } else if (i%1111==0) {
                System.out.println(i);
                i = i + 1110;
            }
        }
    }
}

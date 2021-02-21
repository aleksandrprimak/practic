package com.alfabank.work65;

import java.util.Scanner;

public class Main {

    public static void printPyramid(int  n){
        for(int i=0; i < n; i++){
            for(int j=0; j < 2*n; j++){
                int abs = Math.abs(n-j);
                System.out.print(abs>i ? " " : i-abs+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number=in.nextInt();
        printPyramid(number);
    }
}

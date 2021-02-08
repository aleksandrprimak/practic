package com.alfabank.work45;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        x=1;
        y=1;
        z=0;
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------------");
        while (x<10) {
            System.out.print(x +"|");
            z=y;
            while (y<10){
                System.out.print("["+ (x*y) +"]");
                y++;
            }
            x++;
            y=z;
            System.out.println("");
        }

        System.out.println("----------------------------------------------");
    }
}

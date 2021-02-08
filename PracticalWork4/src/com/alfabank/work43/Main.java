package com.alfabank.work43;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        x=0;
        y=1;
        while (x<8){
            z=y;
            while (y>=1){
                System.out.print("["+ y +"]");
                y--;
            }
            x++;
            y=z+1;
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------");
    }
}

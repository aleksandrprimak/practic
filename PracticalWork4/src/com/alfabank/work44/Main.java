package com.alfabank.work44;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        x=3;
        y=0;
        z =0;
        outer:while (y <10) {
            inner:while (x < 300) {
                if (y==10) { System.out.println("Exit"); break;}
                if (x % 3 == 0) { System.out.print(x +"|");x++;y++;continue  inner;}
                if (x % 4 == 0) { System.out.print(x +"|");x++;y++;continue  inner;}
                if (x % 3 == 1) { System.out.print("");x++;continue  inner;}
                x++;
            }
        }
    }
}

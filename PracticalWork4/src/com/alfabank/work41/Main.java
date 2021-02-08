package com.alfabank.work41;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a: " );
        a = scanner.nextInt();
        System.out.print("Enter b: " );
        b = scanner.nextInt();
        System.out.print("Enter c: " );
        c = scanner.nextInt();
        if (a >b){
            if (a > c){
                System.out.print("Max: a" );
            }
            else {
                System.out.print("Max: c" );
            }
        }
        else{
            if (b>c){
                System.out.print("Max: b" );
            }
            else{
                System.out.print("Max: c" );
            }
        }
    }
}

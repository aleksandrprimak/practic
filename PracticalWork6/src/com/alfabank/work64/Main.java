package com.alfabank.work64;

import java.util.Scanner;

public class Main {

    private static String printBinaryform(int number) {
        String a = Integer.toBinaryString(number);
        return a;
    }


    public static void main(String[] args) {
	// write your code here
        int number;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number=in.nextInt();

        if (number <0)
            System.out.println("Error: Not a positive integer");
        else {

            System.out.print("Convert to binary is:");
            System.out.println(printBinaryform(number));
        }
    }
}

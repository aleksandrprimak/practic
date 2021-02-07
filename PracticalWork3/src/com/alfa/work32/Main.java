package com.alfa.work32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("----------------------------------------------");
    Scanner scanner = new Scanner(System.in);
    int value,month;

    System.out.print("Enter the amount : " );
    value = scanner.nextInt();
    System.out.print("set the number of months : " );
    month = scanner.nextInt();
    double result = (value * 0.12 )/12;
    result -= (result * 0.20);
    result = result * month;
    System.out.println("Profit deposit : "+ result);
    }
}

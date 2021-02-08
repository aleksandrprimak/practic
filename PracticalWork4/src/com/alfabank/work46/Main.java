package com.alfabank.work46;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        System.out.print("Input value: ");
        x = scanner.nextInt();
        String q = String.valueOf(x);
        y=0;
        int result =0;
        while (y <q.length()){
            z= Character.getNumericValue(q.charAt(y));
            int tmp = z*z;
            result+=tmp;
            System.out.println(tmp);
            y++;
        }
        System.out.println("Result: "+ result);
        System.out.println("----------------------------------------------");
    }
}

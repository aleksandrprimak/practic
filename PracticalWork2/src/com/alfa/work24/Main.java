package com.alfa.work24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

       System.out.println("-----------------------" );
       System.out.print("Imput: " );
       Scanner scanner = new Scanner(System.in);
       int q = scanner.nextInt();
       String w = String.valueOf(q);

       System.out.println("-----------------------" );
       int number,reverse_number,save_number;
       number = q;
       save_number=number;
       reverse_number = 0;
       System.out.println("oring: " + number );
       reverse_number = reverse_number*10 + number%10;
       number = number/10;
       reverse_number = reverse_number*10 + number%10;
       number = number/10;
       reverse_number = reverse_number*10 + number%10;
       number = number/10;
       System.out.println("rewers: " + reverse_number);
       System.out.println("difference: " + (save_number - reverse_number));
    }
}

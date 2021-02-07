package com.alfa.work2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Long time = System.currentTimeMillis() /1000;
       long sec = time  %60;
       long min = time / 60 % 60;
       long hour = time / 60 /60 %24;
        long day = time / 60 /60 /24;
       System.out.println("Time"+ day +"|"+ hour+"|"+min+"|"+sec );

       int a =2;
       int b =3;
       a +=b;
       b =a -b;
       a =a -b;
       System.out.println("Time"+ a +"|"+ b );




       System.out.println("-----------------------" );
       System.out.print("Imput: " );
       Scanner scanner = new Scanner(System.in);
       int q = scanner.nextInt();
       String w = String.valueOf(q);
       String qw = "";
       System.out.println("oring: " + w );
        for (int i = w.length()-1;i >=0 ;i--)
       {
           qw = qw+String.valueOf(w.charAt(i));
       }
        System.out.println("rewers: " + qw);

        System.out.println("-----------------------" );
        int n,m;
        n = q;
        m = 0;
        System.out.println("oring: " + n );
        while (n > 0) {
            m = m*10 + n%10;
            n = n/10;
        }
        System.out.println("rewers: " + m);
    }
}

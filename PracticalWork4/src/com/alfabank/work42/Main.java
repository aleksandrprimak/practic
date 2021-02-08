package com.alfabank.work42;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter number: " );
        x = scanner.nextInt();
        switch (x){
            case 1:{ System.out.println("Один"); break;}
            case 2:{ System.out.println("Два"); break;}
            case 3:{ System.out.println("Три"); break;}
            case 4:{ System.out.println("Четыре"); break;}
            case 5:{ System.out.println("Пять"); break;}
            case 6:{ System.out.println("Шесть"); break;}
            case 7:{ System.out.println("Семь"); break;}
            case 8:{ System.out.println("Восемь"); break;}
            case 9:{ System.out.println("Девять"); break;}

            default:{System.out.println("Другое"); break;}
        }
        System.out.println("----------------------------------------------");
    }
}

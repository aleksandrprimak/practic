package com.alfabank.work63;

import java.util.Scanner;

public class Main {

    public static char getFirstCharacterOfWord(String str, int numberWord){

        String[] subStr;
        String delimeter = " "; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
        return subStr[numberWord].charAt(0);
    }
    public static void main(String[] args) {
	// write your code here

        String str;
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter Text: ");
        str=in2.nextLine();

        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number=in.nextInt();

        System.out.println(getFirstCharacterOfWord(str,number));
    }
}

package com.alfabank.Task52;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        String str3 = "National Aviation University";
        System.out.println("original: "+str3);
        System.out.println(str3.indexOf('N'));
        System.out.println(str3.indexOf('A'));
        System.out.println(str3.indexOf('U'));
        String str4 = "";
        str4 = str4 + str3.charAt(str3.indexOf('N'));
        str4 = str4 + str3.charAt(str3.indexOf('A'));
        str4 = str4 + str3.charAt(str3.indexOf('U'));
        System.out.println("abbreviation: "+str4);
        //not work
        System.out.println("----------------------------------------------");
    }
}

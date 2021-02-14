package com.alfabank.Task53;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("----------------------------------------------");

        String str5 = "An information  system  is  designed  to  collect,  process, store and distribute information";
        System.out.println("original: "+str5);
        int a ,b;
        a = str5.indexOf(' ');
        b = str5.lastIndexOf(' ');
        String str6,str7;
        str6 = str5.substring(0,a);
        str7 = str5.substring(b+1,str5.length());
        String resum = str7 + str5.substring(a,b+1) + str6;
        System.out.println("original: "+resum);
        System.out.println("----------------------------------------------");

    }
}

package com.alfabank.Task55;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String a = "Cartoon+ Tomcat";
       int i =0;
       System.out.println("word 1: "+ a);
       System.out.print("unique letters : ");
       while (i <a.length()){
           if(a.indexOf(a.charAt(i)) == a.lastIndexOf(a.charAt(i))){
               System.out.print("["+a.charAt(i)+"]");
           }
           i++;
       }
        System.out.println(" ");
        System.out.println("----------------------------------------------");
    }
}

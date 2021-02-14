package com.alfabank.Task54;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String a = "Cartoon";
       String b = "Tomcat";
       int i =0;
       System.out.println("word 1: "+ a);
       System.out.println("word 2: "+ b);
       System.out.print("unique letters : ");
       while (i <a.length()){
           if(b.indexOf(a.charAt(i)) == -1){
               System.out.print("["+a.charAt(i)+"]");
           }
           i++;
       }
        System.out.println(" ");
        System.out.println("----------------------------------------------");
    }
}

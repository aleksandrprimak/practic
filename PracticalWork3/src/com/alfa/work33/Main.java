package com.alfa.work33;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------------------------------------");
        double price =830;
        System.out.println("Originall Price : "+ price);
        price -= price *0.13;
        System.out.println("New Price -13%: "+ price);
        price += price *0.07;
        System.out.println("New Price +7%: "+ price);
    }
}

package com.alfabank.work61;

public class Main {


    public static double geroneSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void main(String[] args) {
        // write your code here
        System.out.printf("Площадь %.2f",geroneSquare(14, 12, 12));
    }


}

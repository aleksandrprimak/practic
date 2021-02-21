package com.alfabank.work62;

public class Main {

    public static void sayHi(String name) {
        System.out.println("Добрый вечер, " + name + ", как ваши дела?");
    }
    public  static String latestDigit(int number){
        String tmp = String.valueOf(number);
        if(tmp.length() >=2)
        {
            String q = "";
            q = String.valueOf(tmp.charAt(tmp.length()-1));
            q = q + String.valueOf(tmp.charAt(tmp.length()-2));
            System.out.println("number: " + q );
            return q;
        }
        else {
            tmp = "<2";
            System.out.println("number: " + tmp );
            return tmp;
        }

    }
    public static void main(String[] args) {
        // write your code here
        int number = 12345;
        System.out.println("number: " + number );
        latestDigit(number);
    }
}

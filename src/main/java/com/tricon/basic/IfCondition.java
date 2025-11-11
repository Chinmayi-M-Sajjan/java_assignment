package com.tricon.basic;

public class IfCondition {
    public static void main(String[] args) {
//        String city="Davanagere";
//        String city1="Banglore";
//        String city2="Chitradurga";
//
//        if(city.equals(city1)) {
//            System.out.println("Davanagere");
//        }
//            else{
//            System.out.println("no");
//
//        }
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            n = n + 1;
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            }
        }
    }
}

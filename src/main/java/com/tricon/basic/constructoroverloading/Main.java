package com.tricon.basic.constructoroverloading;

public class Main {
    public static void main(String[] args) {
        HDFC h1 = new HDFC();
        System.out.println("----------------");

        HDFC h2 = new HDFC(5000);
        System.out.println("----------------");

        SBI s1 = new SBI(4000);
        System.out.println("----------------");

        SBI s2 = new SBI();

    }
}

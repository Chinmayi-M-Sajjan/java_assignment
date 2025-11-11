package com.tricon.basic.constructoroverloading;

public class SBI extends Bank{
    SBI() {
        balance = 2000;
        System.out.println("SBI constructor:" + balance);
    }
    SBI(double sbiBalance) {

        System.out.println("SBI parameterized constructor: Balance = " + sbiBalance);
    }
}

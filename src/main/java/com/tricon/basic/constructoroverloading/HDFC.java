package com.tricon.basic.constructoroverloading;

public class HDFC extends Bank{
    HDFC() {
        balance = 1000;
        System.out.println("HDFC constructor : " + balance);
    }
    HDFC(double hdfcBalance) {
        System.out.println("HDFC parameterized constructor:" + hdfcBalance);
    }
}

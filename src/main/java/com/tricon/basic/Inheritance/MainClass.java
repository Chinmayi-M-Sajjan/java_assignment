package com.tricon.basic.Inheritance;

public class MainClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.fromGrandParent();
        c.fromParent();
        c.fromChild();

        System.out.println("----------------------");

        Child2 c2=new Child2();
        c2.fromGrandParent();
        c2.fromParent();
        c2.fromChild2();
    }
}

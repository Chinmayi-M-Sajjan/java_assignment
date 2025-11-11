package com.tricon.basic.Inheritance;

public class Child2 extends Parent{
    public void fromGrandParent(){
        System.out.println("from parent");
    }
    public void fromParent(){
        System.out.println("also from parent");
    }
    public void fromChild2(){
        System.out.println("from child2");
    }
}

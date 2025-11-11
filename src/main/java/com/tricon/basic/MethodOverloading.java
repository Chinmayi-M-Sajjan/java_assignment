package com.tricon.basic;

public class MethodOverloading {

    public void employee(int id, String name){
        System.out.println("id : "+id+"\nname: "+name);
    }

    public void employee(String department, String location){
        System.out.println("location: "+location+"\ndepartment:"+department);
    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.employee(1,"Chinmayi");
        mo.employee("development","davanagere");
    }
}

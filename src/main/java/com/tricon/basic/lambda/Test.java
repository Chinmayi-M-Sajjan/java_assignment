package com.tricon.basic.lambda;

import com.tricon.basic.Ipredicate;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Interface i = (a, b) -> a + b;
        int result = i.add(10, 20);
        System.out.println(result);

        Ipredicate p= age-> age>18;
        boolean result2= p.agerequired(22);
        System.out.println(result2);


        List<Integer> list = Arrays.asList(10,20,30);
        List<Integer> ans = list.stream().filter(j->j%2==0).map(j->j+j).toList();
        ans.forEach(System.out::println);

        list.stream().forEach(i1-> System.out.println(i1));
    }
}
// optional class (look after this)
//module system

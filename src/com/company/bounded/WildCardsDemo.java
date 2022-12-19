package com.company.bounded;

import java.util.ArrayList;
import java.util.List;

public class WildCardsDemo {
    public static void main(String[] args) {
        List<Pigeon> list1=new ArrayList<>();
        list1.add(new Pigeon());
        list1.add(new Pigeon());

        print2(list1);

        List<Animal> list2=new ArrayList<>();
        list2.add(new Cat());
        list2.add(new Pigeon());
        list2.add(new Bird());
        print2(list2);

        List<Bird> list3=new ArrayList<>();
        list3.add(new Sparrow());
        print(list3);

        List<?> list=new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
        List<Animal> list4=new ArrayList<>();
        list4.add(new Bird());
    }
    //upper wildcard
    public static void  print2(List<? extends Animal> list){
        System.out.println(list);

    }
    public static void  print3(List<? super Pigeon> list){
        System.out.println(list);

    } public static void  print(List<?> list){
        System.out.println(list);

    }


}

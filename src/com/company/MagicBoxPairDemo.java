package com.company;

public class MagicBoxPairDemo {
    public static void main(String[] args) {
        MagixBoxPair<Integer,String> magicBoxPair=new MagixBoxPair<>(1,"2");


    }

}

class MagixBoxPair<T,U>{
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }



    public MagixBoxPair(T first, U second) {
        this.first = first;
        this.second = second;
    }



}

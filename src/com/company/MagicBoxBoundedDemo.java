package com.company;

import com.company.bounded.Bird;
import com.company.bounded.Pigeon;

public class MagicBoxBoundedDemo {
    public static void main(String[] args) {
        MagicBoxBounded<Pigeon> magicBoxBounded = new MagicBoxBounded<>();
        magicBoxBounded.setObject(new Pigeon());
        System.out.println(magicBoxBounded.getObject());

    }
}

class MagicBoxBounded<T extends Bird> {
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    private T object;
}


interface IMagicPrinter<T> {
    void print(T object);
}

class MagicPrinter<T> implements IMagicPrinter<T> {

    @Override
    public void print(T object) {

    }
}
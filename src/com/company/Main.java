package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.setObject(1); //integer
        Object object = magicBox.getObject();
        Class clazz = object.getClass();
        System.out.println(clazz);

        System.out.println(magicBox.getObject());
        magicBox.setObject("2");
        System.out.println(magicBox.getObject());
        magicBox.setObject(new ArrayList<String>(Arrays.asList("hocus", "pocus", "spell")));
        System.out.println(magicBox.getObject());
//        Object object=magicBox.getObject();
//        Class clazz=object.getClass();
//        System.out.println(clazz);

        MagicBoxGeneric<Number> magicBoxGeneric=new MagicBoxGeneric<>();
        //magicBoxGeneric.setObject(1);
        magicBoxGeneric.setObject(2.3);

        MagicBoxGeneric<MagicBoxGeneric<Number>> magicBoxGeneric1=new MagicBoxGeneric<>();
        magicBoxGeneric1.setObject(magicBoxGeneric);
        System.out.println(magicBoxGeneric1.getObject().getObject());
    }
}

class MagicBox {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}

class MagicBoxGeneric<T>{
    private T object;
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }



}
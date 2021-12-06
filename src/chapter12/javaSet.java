package chapter12;

import java.util.HashSet;
import java.util.Set;

public class javaSet {

    public static void main(String[] args) {

        //Set es una interfaz y no puede ser instanciada pero puede ser un tipo de objeto. Pero Hashset la implementa.
        //También existen TreeHashSet y LinkedHashSet


        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);


    }

}

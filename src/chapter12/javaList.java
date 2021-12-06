package chapter12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class javaList {

    public static void main(String[] args) {

        //Dentro de List también existen ArrayList(), LinkedList(), Stack() y vector.


        List<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);


    }
}

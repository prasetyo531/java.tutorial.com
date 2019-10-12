package chapter12;

import java.util.HashSet;
import java.util.Set;

public class set {

    public static void main(String[] args){
        set();
    }

    /*
    ada
    1. add
    2. clear
    3. contains
    4. isEmpty
    5. iterator
    6. remove
    7. size
     */

    public static void set(){
        Set buah = new HashSet();
        buah.add("lemon");
        buah.add("apple");
        buah.add("banana");
        buah.add("orange");
        buah.add("lemon");


        System.out.println(buah.size()); //4
        System.out.println(buah); //[banana, orange, apple, lemon]
    }
}

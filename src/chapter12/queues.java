package chapter12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class queues {

    public static void main(String[] args){
        queue();
    }

    /*
    operation queues
    1. add
    2. peek
    3. element
    4. remove
    5. poll
     */

    public static void queue(){
        Queue buah = new LinkedList();
        buah.add("lemon");
        buah.add("apple");
        buah.add("banana");
        buah.add("orange");
        buah.add("lemon");


        System.out.println(buah.size()); //5
        System.out.println(buah); //[apple, lemon, banana, orange, lemon]

        buah.remove();
        System.out.println(buah);//[lemon, banana, orange, lemon]

        System.out.println(buah.peek());//lemon
    }
}

package chapter12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queues {

    public static void main(String[] args){
        queue();
    }

    /*
    http://tutorials.jenkov.com/java-collections/queue.html
    operation queues
    1. add
    2. peek -> first element in the Queue
    3. element
    4. remove -> removes the element at the head of the Queue.
    5. poll ->remove the first element of the Queue
     */

    public static void queue() {

        Queue buah = new LinkedList();
        buah.add("lemon");
        buah.add("apple");
        buah.add("banana");
        buah.add("orange");
        buah.add("lemon");

        System.out.println(buah.size()); //5
        System.out.println(buah); //[lemon, apple, banana, orange, lemon]

        //buah.remove();
        System.out.println("using remove"+" "+buah.remove());//lemon
        System.out.println("using poll"+" "+buah.poll());//apple

        System.out.println("using peek"+" "+buah.peek());//banana


        Iterator<String> iterator = buah.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("iterasi"+element);
        }
    }
}

package chapter12;

import java.util.*;
import java.util.stream.Stream;

public class arrayListStream {

    public static void main(String[] args){
        arraylist_for();
//        arrayList_streamFilter();
//        smartUsageStream();
//        usageForEach();
//
//        Linkedlist_for();
    }

    public static void arraylist_for(){

        //<bisa class/tipe data>
        ArrayList<String> names = new ArrayList<String>();
        names.add("abigail");
        names.add("bacandra");
        names.add("carlie");
        names.add("putranto");
        names.add("abimana");
        int count = 0;

        for(int i=0;i<names.size();i++){

            String actual = names.get(i);
            if(actual.startsWith("a")){
            count++;
            }
        }
        System.out.println("with logic for"+" "+count);
        names.stream().filter(s -> s.startsWith("a")).forEach(s->System.out.println("namanya adalah"+" "+s));

        //sorting desc
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("desc"+" "+names);

        //sorting asc
        Collections.sort(names);
        System.out.println("asc"+" "+names);

        //searching - starts from 0 like array
        String index = String.valueOf(Collections.binarySearch(names, "carlie"));
        System.out.println("index locations"+" "+index);
    }

    public static void arrayList_streamFilter(){

        //<bisa class/tipe data> as implementation
        ArrayList<String> middlename = new ArrayList<String>();
        middlename.add("chandra");
        middlename.add("destari");
        middlename.add("emilly");
        middlename.add("frans");
        middlename.add("eriani");

        long c = middlename.stream().filter(s->s.startsWith("e")).count();
        System.out.println("quantity"+" "+c);

    }

    public static void smartUsageStream(){

        //<bisa class/tipe data>
        ArrayList<String> skincare = new ArrayList<String>();
        skincare.add("cleanser");
        skincare.add("facewash");
        skincare.add("facepalm");
        skincare.add("facepalm");
        skincare.add("toner");

        /*
        long d = Stream.of("cleanser","facewash","facepalm","toner").filter(s->{
            s.endsWith("r");
            return true;
        }).count();
         */

        long d = skincare.stream().filter(s->s.startsWith("f")).count();
        System.out.println(d);

        long e = skincare.stream().filter(s->s.equals("facepalm")).count();
        System.out.println("object yg sama"+" "+e);
    }

    public static void usageForEach(){

        //<bisa class/tipe data>
        ArrayList<String> skincare = new ArrayList<String>();
        skincare.add("cleanser");
        skincare.add("facewash");
        skincare.add("facepalm");
        skincare.add("toner");
        skincare.remove("toner");

        skincare.stream().filter(s->s.startsWith("f")).forEach(s->System.out.println(s));
    }

    public static void Linkedlist_for(){

        //<bisa class/tipe data>
        LinkedList<String> sunscreen = new LinkedList<String>();
        sunscreen.add("cleanser");
        sunscreen.add("facewash");
        sunscreen.add("facepalm");
        sunscreen.add("toner");
        sunscreen.add("toner");

        System.out.println("Linkedlist_for" + " " + sunscreen.getLast());
        System.out.println(sunscreen);
    }
}

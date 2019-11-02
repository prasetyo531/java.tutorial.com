package chapter12;

import java.util.ArrayList;
import java.util.stream.Stream;

public class arrayListStream {

    public static void main(String[] args){
        arraylist_for();
        arrayList_streamFilter();
        smartUsageStream();
        usageForEach();
    }

    public static void arraylist_for(){

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
    }

    public static void arrayList_streamFilter(){

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

        ArrayList<String> skincare = new ArrayList<String>();
        skincare.add("cleanser");
        skincare.add("facewash");
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
    }

    public static void usageForEach(){

        ArrayList<String> skincare = new ArrayList<String>();
        skincare.add("cleanser");
        skincare.add("facewash");
        skincare.add("facepalm");
        skincare.add("toner");

        skincare.stream().filter(s->s.startsWith("f")).forEach(s->System.out.println(s));
    }
}

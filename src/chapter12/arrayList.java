package chapter12;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args){
        arraylist();
    }

    public static void arraylist(){

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
        System.out.println(count);
    }
}

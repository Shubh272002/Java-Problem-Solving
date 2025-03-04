// import java.util.*;
// import java.util.LinkedList;

// public class linked {
    
//     public static void main(String[] args) {
        
    //     ArrayList li = new ArrayList();
        
    // li.add("shubh");
    // li.add(10);
    // li.add(10.23);
    // li.add(true);
    // li.add(20.34f);
    // li.add(null);
    // li.add(null);

    // LinkedList li1 = new LinkedList();
        
    // li1.add("shubh");
    // li1.add(10);
    // li1.add(10.23);
    // li1.add(true);
    // li1.add(20.34f);
    // li1.add(null);
    // li1.add(null);
    
    // // li.push("shubh");

    // li.addAll(li1);
    // // li.push("shubh");
    // // li.pop();
    // // System.out.println(li.push());
    // System.out.println(li);

    // LinkedList<Integer> list = new LinkedList<integer>();

    // list.add(10);
    // list.add(20);
    // list.add(40);
    // list.add(60);
    // list.add(90);

    // Iterator<Integer> i = list.iterator();
    // while (i.hashNext()) {
    //     System.out.println(i.next());

import java.util.*;
import java.util.TreeMap;


class collection{
    public static void main(String[] args) {
        // TreeMap<String,Integer> num = new TreeMap<>();
        // num.put("two", 1);
        // num.put("three", 3);
        // num.put("four", 4);
        // num.put("five", 5);
        // System.out.print(num);
        // HashMap<String, Integer> num1 = new HashMap<>(num);
        // num1.put("six", 6);
        // System.out.println(num1);



        // Liked HAsh Map:-

        // LinkedHashMap<String,Integer> lang = new LinkedHashMap<>();
        // lang.put("one", 1);
        // lang.put("two", 2);
        // lang.put("three", 3);
        // lang.put("four", 4);
        // System.out.println(lang);


        TreeeMap<String ,Integer> rap = new TreeMap<>();
        rap.put("two",2);
        rap.put("three",2);
        rap.put("four",4);
        rap.put("five",5);

        rap.putIfAbsent("six", 6);
        System.out.println(rap);


    }
}


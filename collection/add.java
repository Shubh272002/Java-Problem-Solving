import java.util.ArrayList;
import java.util.*;

// public class add {
//     public static void main(String[] args) {
//         ArrayList dp = new ArrayList();

//         dp.add(10);
//         dp.add("shubh");
//         dp.add(10.34);
//         dp.add(23.90f);
//         dp.add("true");
//         dp.add("ShubhVerma");
//         dp.add("Chetan");
//         dp.add("shubh");
        
        // System.out.println(dp);
        // System.out.println(dp.get(3));
        // System.out.println(dp.set(1,20));
        // System.out.println(dp.getFirst());
        // System.out.println(dp.getLast());
        // System.out.println(dp.remove(0)); :- It Is Overloaded Method .
        // System.out.println(dp.indexOf("shubh"));
        // System.out.println(dp.lastindexOf("shubh"));
        // dp.clear();
        // System.out.println(dp.isEmpty());
        // System.out.println(dp.size());
        // System.out.println(dp.reversed());
        // System.out.println(dp.contains("shubh"));
        //    ListIterator list =dp.listIterator();
        //    while(list.hasNext()){
        //     System.out.println(list.next());
        //    }
        // Or:-

    //     for(Object obj :dp){
    //         System.out.println(obj );
    //     }

    //     // System.out.println(dp);
      
    // }
    
// }

// Generics Uses :- Student Use  class:- User defined data type:-

public class add {

    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<student>();
        

        students.add(new student(1,"SHubh","Saharanpur",98.45));
        students.add(new student(2,"Chetan","Noida",80.45));
        students.add(new student(2,"Shiv","Delhi",88.45));
        students.add(new student(2,"Mohan","Gurugram",75.45));

        for(student)

        System.out.println(students);

    }
}


import java.util.*;
// import java.util.Vector;
import java.util.Queue;


// public class vctor {
//     public static void main(String[] args) {
//         Vector v = new Vector();

//         v.add(10);
//         v.add("Shubh");
//         v.add(12.23);
//         v.add(15.34f);
//         v.add(true);
//         v.add(null);

//         System.out.println(v.get(2));
//     }

    
    
// }


public class Vector{
    public static void main(String[] args){

        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(3);
        num.add(4);
        num.add(1);
        num.add(2);

        System.out.println(num);
    }
}

class compr implements Comparator<Integer>{
   public int compare(Integer num1,Integer num2);
        int value = num1.compareTo(num2);
        if(value>0){
            return -1;

        }else if(value<0){
            return 1;
        }
        else{
            return 0;
        }
    }

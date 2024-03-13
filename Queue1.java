import java.util.*;
public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.add("Shivam");
        q1.add("Umesh");
        q1.add("Shivam");
        q1.add("Sakshi");
        System.out.println(q1);
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
        System.out.println(q1);
//        Queue<String> q1 = new LinkedList<>();
//        q1.add("Shivam");
//        q1.add("Umesh");
//        q1.add("Shivam");
//        q1.add("Sakshi");
//        q1.add(null);
//        System.out.println(q1);
//        System.out.println(q1.remove());
//        System.out.println(q1.isEmpty());
//        System.out.println(q1.poll());
//        System.out.println(q1);
    }
}

import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s1= new Stack();
        boolean result = s1.empty();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(null);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        System.out.println("peek = " + s1.peek());
        System.out.println("element found at " + s1.search(4));
        System.out.println(result = s1.empty());
    }
}

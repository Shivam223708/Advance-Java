package homework;

import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("original list = " + fruits);

        int i=0;
        int j= fruits.size()-1;
        while(i<j){
            String a= fruits.get(i);
            String b= fruits.get(j);
            String temp=a;
            a=b;
            b=temp;
            fruits.set(i,a);
            fruits.set(j,b);
            i++;
            j--;
            }
        System.out.println("reversed list = " + fruits);
    }
}

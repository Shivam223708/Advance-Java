import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        HashSet<String> Hashset = new HashSet<>();
        LinkedHashSet<String> linkedhashset=new LinkedHashSet<String>();
        Hashset.add("Banana");
        Hashset.add("Apple");
        Hashset.add("Sam");
        linkedhashset.add("Dahi");
        linkedhashset.add("Watermelon");
        linkedhashset.add("Kiwi");
        for(String fruit : linkedhashset)
            System.out.println(fruit);
        for(String Fruit : Hashset)
            System.out.println(Fruit);
    }
}
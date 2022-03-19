package hashmap.com.example.controller;
import java.util.HashMap;

public class HashMapGetValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer,String>();

        hmap.put(1,"AA");
        hmap.put(2,"BB");
        hmap.put(3,"CC");
        hmap.put(4,"DD");

        String val= hmap.get(4);
        System.out.println("The Value mapped to Key 4 is: "+val);

        String val2=hmap.get(5);
        System.out.println("The Value mapped to Key 5 is: "+val2);

    }

}

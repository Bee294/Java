package hashmap.com.example.controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class DetailsHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer,String>();

        hmap.put(12,"Thao");
        hmap.put(2,"Hai");
        hmap.put(7,"Linh");
        hmap.put(49,"Dung");
        hmap.put(3,"Hung");


        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key is: "+mentry.getKey()+"& Value is: ");
            System.out.println(mentry.getValue());
        }

        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);
        hmap.remove(3);
        System.out.println("Map key and values after removal: ");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry) iterator2.next();
            System.out.println("Key is: "+mentry2.getKey() + "& Value is: ");
            System.out.println(mentry2.getValue());
        }


    }
}

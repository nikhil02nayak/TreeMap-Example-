import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {

    public static void main(String[] args) {
        //Sorting in Descending order
        java.util.TreeMap<Integer,String> treeMap = new java.util.TreeMap<>(Collections.reverseOrder());
        //Adding elements
        treeMap.put(1,"Tom");
        treeMap.put(3,"sammy");
        treeMap.put(2,"Jessie");

        //looping using Advanced for loop

        for (Map.Entry map : treeMap.entrySet())
        {
            System.out.println("Sl.no : " + map.getKey() + " || Name : " + map.getValue());
        }


        System.out.println("****************************************************************");
        // Looping using Iterator and implementing Map entry

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println("Sl.no : " + map.getKey() + " || Name : " + map.getValue());
        }


        System.out.println("****************************************************************");

        //Size of Tree map
        System.out.println("Size : " + treeMap.size());

    }
}

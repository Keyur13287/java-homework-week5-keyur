package week5_homework;

import java.util.HashMap;
import java.util.Map;

/**
 *  Create a HashMap object called people that will store String keys and Integer
 *  values: And use for each loop to iterate the value from Map
 */
public class Programme9_map {
    public static void main(String[] args) {
        Map<String,Integer> maplist = new HashMap();
        maplist.put("1", 10);
        maplist.put("2", 20);
        maplist.put("3", 30);
        maplist.put("4",50);

        for (Map.Entry<String,Integer> numbers : maplist.entrySet()){
            System.out.println(numbers.getKey()+ "    "+numbers.getValue());
        }

    }
}

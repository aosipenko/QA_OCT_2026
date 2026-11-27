package org.prog.session9;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Alice");
        map.put("lastName", "Smith");
        map.put("age", "25");

        Map<String, String> map2 = new HashMap<>();
        map2.put(null, null);
        System.out.println(map2.isEmpty());

//        map.get("firstName");
//        System.out.println(map.getOrDefault("notExists", "John"));
//        System.out.println(map.getOrDefault("lastName", "John"));

//        map.replace("firstName", "Charlie");
//        map.replace("notExists_1", "value_1");
//        map.replace("lastName", "Brown");
//        map.replace("age", "26", "27");
//        map.replace("age", "25", "40");
//
//        map.putIfAbsent("firstName", "Daniel");

//        System.out.println(map.get("firstName"));

    }

}

package org.prog.session9;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("value_1");
        strings.add("value_3");
        Set<String> set = new HashSet<>();
        set.add("value_1");
        set.add("value_2");
        set.add("value_3");
        set.add("value_4");

        System.out.println(set.containsAll(strings));

    }
}

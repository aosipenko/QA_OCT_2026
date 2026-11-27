package org.prog.session9;

import java.util.HashMap;

public class FakeSet {

    private final HashMap<String,String> map;

    public FakeSet() {
        map = new HashMap<>();
    }

    public void put(String value){
        map.put(value,value);
    }
}

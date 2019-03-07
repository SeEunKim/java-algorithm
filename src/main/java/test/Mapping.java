package test;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    static Map<Integer, Month> map = new HashMap<>();

    public Mapping() {
        map.put(1, new January());
        map.put(2, new February());
    }

    public Month getMonth(int num) {
        return map.get(num);
    }
}

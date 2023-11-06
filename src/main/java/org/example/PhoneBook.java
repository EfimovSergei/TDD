package org.example;

import java.util.Map;

public class PhoneBook {
    static Map<String,Integer> MAP= null;
    public int size() {
        if (MAP!=null){
            return MAP.size();
        }
        return 0;
    }

    public int add(String name, int number) {
        if(MAP!=null){
            if (!MAP.containsKey(name)) {
                MAP.put(name,number);
            }
        }
        return size();
    }
}

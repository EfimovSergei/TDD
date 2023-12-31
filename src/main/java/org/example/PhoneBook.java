package org.example;

import java.util.*;

public class PhoneBook {
    static Map<String, Integer> MAP = null;

    public int size() {
        if (MAP != null) {
            return MAP.size();
        }
        return 0;
    }

    public int add(String name, int number) {
        if (MAP != null) {
            if (!MAP.containsKey(name)) {
                MAP.put(name, number);
            }
        } else {
            MAP = new HashMap<>();
            MAP.put(name, number);
        }
        return size();
    }

    public String findByNumber(int number) {

        for (Map.Entry entry : MAP.entrySet()) {
            if (entry.getValue().equals(number)) return entry.getKey().toString();
        }
        return null;
    }

    public int findByName(String name) {
        return MAP.get(name);
    }

    public List<String> printAllNames() {

        TreeMap<String, Integer> treeMap = new TreeMap<>(MAP);
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }
}

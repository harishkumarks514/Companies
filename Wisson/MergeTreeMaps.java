package Wisson;

import java.util.TreeMap;

public class MergeTreeMaps {

    public static void main(String[] args) {

        TreeMap<Integer, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put(1, 10);
        treeMap1.put(2, 20);
        treeMap1.put(3, 30);

        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put(2, 15);
        treeMap2.put(3, 25);
        treeMap2.put(4, 40);

        TreeMap<Integer, Integer> result = mergeTreeMaps(treeMap1, treeMap2);

        System.out.println("Merged TreeMap: " + result);
    }

    public static TreeMap<Integer, Integer> mergeTreeMaps(
            TreeMap<Integer, Integer> map1, TreeMap<Integer, Integer> map2) {

        TreeMap<Integer, Integer> result = new TreeMap<>();

        for (Integer key : map1.keySet()) {
            result.put(key, map1.get(key));
        }

        for (Integer key : map2.keySet()) {
            result.put(key, result.getOrDefault(key, 0) + map2.get(key));
        }

        return result;
    }
}
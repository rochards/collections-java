package br.rodrigo.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {

        Map<String, Integer> worldsChampions = new HashMap<>();
        worldsChampions.put("Brasil", 5);
        worldsChampions.put("Alemanha", 4);
        worldsChampions.put("Itália", 4);
        worldsChampions.put("Uruguai", 2);

        System.out.println("Original map: " + worldsChampions);
        System.out.println("França is in there?: " + worldsChampions.containsKey("França"));

        worldsChampions.remove("Alemanha");
        System.out.println("Modified map: " + worldsChampions);

        worldsChampions.put("Brasil", 6); //update
        System.out.println("Modified map: " + worldsChampions);

        System.out.println("How many times Brasil has won?: " + worldsChampions.get("Brasil"));

        System.out.println("Size: " + worldsChampions.size());

        System.out.println("Navigate through");
        for (Map.Entry<String, Integer> entry : worldsChampions.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        System.out.println("Navigate through keys");
        for (String keys : worldsChampions.keySet()) {
            System.out.println(keys);
        }

    }
}

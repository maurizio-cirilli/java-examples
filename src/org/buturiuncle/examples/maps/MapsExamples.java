package org.buturiuncle.examples.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class MapsExamples {

    public static void main(String[] args) {
        workWithMap();
    }

    public static Map<Integer, String> initMap() {
        Map<Integer, String> map = new HashMap<>();
        int N = 1000;
        for (int i = 0; i < N; i++) {
            map.put(i, i + "10");
        }
        return map;
    }

    private static void workWithMap() {
        Map<Integer, String> map = initMap();
        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
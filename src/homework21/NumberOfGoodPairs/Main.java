package homework21.NumberOfGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 3};
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        for (int i = 0; i < map.size(); i++) {
            for (int j = i + 1; j < map.size(); j++) {
                if (map.get(i) == map.get(j)) {
                    System.out.println("(" + i + " " + j + ")");
                    System.out.println("------");
                }
            }
        }
    }
}

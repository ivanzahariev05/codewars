package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

     int n = 0;
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : elements) {
            map.compute(i, (k, v) -> v == null ? 1 : v + 1);
            if (map.get(i) <= maxOccurrences) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
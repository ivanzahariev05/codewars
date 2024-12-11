package algorithms;

import java.util.*;


public class Solution {

    public static int[] largest(int n, int[] arr) {

        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(n)
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
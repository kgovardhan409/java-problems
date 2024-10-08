package org.example;

import java.util.Arrays;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] out = findMinMax(new int[]{1, 3, 5, 23, 52, 2, 7});
       Arrays.stream(out).forEach(System.out::println);
    }

    public static int[] findMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

}

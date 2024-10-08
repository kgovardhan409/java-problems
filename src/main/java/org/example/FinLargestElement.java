package org.example;

import java.util.Arrays;

public class FinLargestElement {
    public static void main(String[] args) {
        int result = findKthLargest(new int[]{1, 3, 5, 2, 5, 3}, 1); // finding 1st largest element in array
        System.out.println(result);
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}

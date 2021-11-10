package com.company.binarysearch;

public class Floor {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 13, 17, 21};
        int target = 20;
        System.out.println(floor(nums, target));
    }

    private static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return nums[end];
    }
}

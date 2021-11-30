package com.company.binarysearch;

public class TwoSum {
    /*
    Approach:
    Brute Force - 2 loop
    Optimised Approach - Two Pointers
    Even More Optimised Approach - Binary Search On Two Pointers

    Things need to have in your mind:

    1.
   */

//    2, 7, 11, 13       t -> 9


    static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            int sum = nums[start] + nums[end];
            if(sum == target) {
                return new int[]{start + 1, end + 1};
            } else if(sum < target) {
                int inSum = nums[mid] + nums[end];
                if(inSum == target) {
                    return new int[]{mid + 1, end + 1};
                }

                if(inSum < target) {
                    start = mid + 1;
                } else {
                    start++;
                }
            } else {
                int inSum = nums[start] + nums[mid];
                if(inSum == target) {
                    return new int[]{start + 1, mid + 1};
                }

                if(inSum > target) {
                    end = mid - 1;
                } else {
                    end--;
                }
            }
        }


        return new int[] {-1, -1};
    }
}

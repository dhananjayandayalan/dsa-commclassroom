package com.company.binarysearch;

public class SingleNumber {

    /*
    * Approach 1:
    * Using Linear Search
    *
    * Approach 2:
    * Just note the position of the second number of each number with pair. After the single number,
    * the index of the second number changes from odd to even
    *
    * That's the Intuition to apply binary search xD.
    * */

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            boolean isEven = mid % 2 == 0;
            if(isEven && nums[mid] == nums[mid + 1] || !isEven && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}

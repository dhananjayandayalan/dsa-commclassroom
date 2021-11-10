package com.company.binarysearch;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        if(result[0] != -1) {
            result[1] = search(nums, target, false);
            return result;
        } else {
            return result;
        }
    }

    static int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}

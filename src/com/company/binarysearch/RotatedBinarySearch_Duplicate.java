package com.company.binarysearch;

public class RotatedBinarySearch_Duplicate {

    static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length -1);
        }

        if(nums[pivot] == target) {
            return true;
        }

        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static boolean binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if(start < nums.length - 1 && nums[start] > nums[start + 1]) {
                    return start;
                }
                start += 1;

                if(end > 0 && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end -= 1;

            } else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

package com.company.binarysearch;

public class BSInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 14, 21, 37, 44, 55, 64, 72, 85, 99, 104, 117, 135, 159, 166};
        int target = 36;
        System.out.println(searchInfinite(arr, target));
    }


    private static int searchInfinite(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while(target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(nums, target, start, end);
    }


    private static int search(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}

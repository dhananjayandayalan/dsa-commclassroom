package com.company.binarysearch;

public class SplitArrayLargestNumber {
    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i : nums) {
            start = Math.max(i, start);
            end += i;
        }

        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int i : nums) {
                if(sum + i > mid) {
                    pieces += 1;
                    sum = i;
                } else {
                    sum += i;
                }
            }

            if(pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}

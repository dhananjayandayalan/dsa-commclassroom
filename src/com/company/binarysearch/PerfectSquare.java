package com.company.binarysearch;

public class PerfectSquare {
    static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long result = mid * mid;
            if(result == num) {
                return true;
            } else if(result < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}

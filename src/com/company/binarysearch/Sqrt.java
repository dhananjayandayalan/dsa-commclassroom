package com.company.binarysearch;

public class Sqrt {

    /**
     * Approach:
     *
     * 1. Searching for the Number within x/2 (Search Space).
     * 2. Search from 1 to x.
     * 3. Regular Binary Search.
     * T -> O(logn) S-> O(1)
     */

    static int mySqrt(int x) {
        long start = 1;
        long end = x;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long res = mid * mid;
            if(res == x) {
                return (int)mid;
            } else if(res < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int)end;
    }
}

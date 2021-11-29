package com.company.binarysearch;

public class isBad {
    /*
      Approach:

      1. Linear Search - Brute Force
      2. Binary Search:
      	1. if the mid-value is not a bad approach, reduce the search space from start to mid + 1
      	2. if the mid-value is a bad approach, it may be a possible answer, we need search even behind from the mid-value.

      T -> O(logN) S-> O(1)
     */

    // Dummy Function to Avoid Error in Intellij IDE
    static boolean isBadVersion(int x) {
        return true;
    }

    static int firstBadVersion(int n) {
        long result = -1;
        long start = 1;
        long end = n;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            boolean isBad = isBadVersion((int)mid);

            if(!isBad) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }

        return (int)result;
    }
}

package com.company.binarysearch;
import java.util.*;

/*
Approach 1:
Two Loop Method which is not efficient (O(N^2) Complexity)

Approach 2:
Using Binary Search & Hash Map (Which is implemented in code)

Time Complexity -> O(N(logN))
Space Complexity -> O(N) (Storing value in hashmap)
*/

public class RightInterval {
    private static int[] findRightInterval(int[][] intervals) {
        //! To store the Start value and it's index before sorting
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(int[] interval : intervals) {
            map.put(interval[0], i++);
        }

        //! Then sort the 2d array so that you can do the binary search
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        //! Store the result value
        int[] result = new int[intervals.length];

        // store the index value for the respected index before the array get sorted
        for(int[] interval : intervals) {
            // By using get method, you can get the index value of the start value.
            // search the whole intervals array with the end value.
            // Whether the searched value is available in the map, we'll store the respective index
            // else store -1
            result[map.get(interval[0])] = map.getOrDefault(search(intervals, interval[1]), -1);
        }

        return result;
    }

    private static Integer search(int[][] intervals, int target) {
        int start = 0;
        int end = intervals.length - 1;
        if(target > intervals[end][0]) {
            return null;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(intervals[mid][0] == target) {
                return intervals[mid][0];
            } else if(intervals[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return intervals[start][0];
    }
}

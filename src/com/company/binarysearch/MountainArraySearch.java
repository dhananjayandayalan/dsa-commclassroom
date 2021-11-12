package com.company.binarysearch;


import java.util.Arrays;

public class MountainArraySearch {
    static class MountainArray {
        private int[] array;

        public int[] getArray() {
            return array;
        }

        public void setArray(int[] array) {
            this.array = Arrays.copyOfRange(array, 0, array.length);
        }

        public int get(int index) {
            return array[index];
        }

        public int length() {
            return array.length;
        }

    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        int result = orderAgnosticBS(mountainArr, target, 0, peak);
        if(result == -1) {
            result = orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
        }

        return result;
    }

    private static int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
        boolean isAscending = arr.get(start) < arr.get(end);

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isAscending) {
                if(target == arr.get(mid)) {
                    return mid;
                } else if(target > arr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target == arr.get(mid)) {
                    return mid;
                } else if(target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    private static int findPeakIndex(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}

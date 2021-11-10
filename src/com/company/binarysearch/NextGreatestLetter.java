package com.company.binarysearch;

public class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int len = letters.length;
        int end = len - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return letters[start % len];
    }
}

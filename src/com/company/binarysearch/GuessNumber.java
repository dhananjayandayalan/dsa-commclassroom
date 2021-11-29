package com.company.binarysearch;

public class GuessNumber {

    //It's a Dummy Function to escape error in Intellij IDE
    static int guess(int x) {
        return x;
    }

    static int guessNumber(int n) {
        long start = 1;
        long end = n;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long pick = guess((int)mid);
            if(pick == 1) {
                start = mid + 1;
            } else if(pick == -1) {
                end = mid - 1;
            } else {
                return (int)mid;
            }
        }

        return (int)start;
    }
}

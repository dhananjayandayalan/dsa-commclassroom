package com.company.binarysearch;

public class ArrangingCoins {

    /*
    * the formula to achieve 1 + 2 + 3 + .... + n is n * (n + 1) / 2
    * */

    static int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long k = mid * (mid + 1) / 2;

            if(k == n) {
                return (int)mid;
            }

            if(k > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int)end;
    }
}

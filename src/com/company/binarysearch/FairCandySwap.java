package com.company.binarysearch;

import java.util.*;

public class FairCandySwap {
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = 0;
        int bob = 0;
        int[] ans = new int[2];
        Arrays.sort(bobSizes);
        for (int aliceSize : aliceSizes) {
            alice += aliceSize;
        }
        for (int bobSize : bobSizes) {
            bob += bobSize;
        }
        for (int aliceSize : aliceSizes) {
            int l = 0, r = bobSizes.length - 1;
            int x = aliceSize + (bob - alice) / 2;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (bobSizes[mid] == x) {
                    ans[0] = aliceSize;
                    ans[1] = bobSizes[mid];
                    return ans;
                } else if (bobSizes[mid] < x) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return ans;
    }
}

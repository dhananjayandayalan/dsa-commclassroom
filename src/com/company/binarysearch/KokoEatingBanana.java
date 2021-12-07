package com.company.binarysearch;

public class KokoEatingBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        for(int i : piles) {
            end = Math.max(i, end);
        }

        int ans = end;

        while(start < end) {
            int mid = start + (end - start) / 2;

            boolean finish = canFinish(piles, mid, h);
            if(finish) {
                ans = mid;
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private static boolean canFinish(int[] piles, int k, int hour) {
        int count = 0;
        for(int pile : piles) {
            int temp = 0;

            if(pile % k == 0) {
                temp = pile / k;
            } else {
                temp = (pile / k) + 1;
            }

            count += temp;
        }

        return count <= hour;
    }
}

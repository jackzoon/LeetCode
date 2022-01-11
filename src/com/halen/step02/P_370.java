package com.halen.step02;

import com.halen.util.Difference;

/**
 * 区间加法
 */
public class P_370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        Difference difference = new Difference(nums);
        for (int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int val = update[2];
            difference.increment(i, j, val);
        }
        return difference.result();
    }
}

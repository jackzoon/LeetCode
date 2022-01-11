package com.halen.util;

public class Difference {
    private int[] diff;

    // 构造差分数组
    public Difference(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < diff.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    // 给[i,j]增加val
    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}

package com.itszaif.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        towSumResult();
    }

    private static int[] towSumResult() {
        int[] nums = new int[]{2, 11, 12, 13, 7, 15};
        int[] result = new int[2];
        int target = 9;

        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int sum = num + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

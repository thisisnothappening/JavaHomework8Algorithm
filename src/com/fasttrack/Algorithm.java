package com.fasttrack;
/*
1) Given an unsorted integer array, find a pair with the given sum in it.
Ex input: nums = [8, 7, 2, 5, 3, 1], target = 10. output = (8,2) and (7,3)

2) Given an unsorted integer array, find triplets with the given sum in it.
*/
public class Algorithm {
    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};

        exercise1(nums);
        System.out.println();
        exercise2(nums);
    }

    public static void exercise1(int[] nums) {
        for (int nr1 = 0; nr1 < nums.length; nr1++) {
            for (int nr2 = nr1 + 1; nr2 < nums.length; nr2++) {
                if (nums[nr1] + nums[nr2] == 10) {
                    System.out.println("(" + nums[nr1] + "," + nums[nr2] + ")");
                }
            }
        }
    }

    public static void exercise2(int[] nums) {
        for (int nr1 = 0; nr1 < nums.length; nr1++) {
            for (int nr2 = nr1 + 1; nr2 < nums.length - nr1; nr2++) {
                for (int nr3 = nr2 + 1; nr3 < nums.length; nr3++) {
                    if (nums[nr1] + nums[nr2] + nums[nr3] == 10) {
                        System.out.println("(" + nums[nr1] + "," + nums[nr2] + "," + nums[nr3] + ")");
                    }
                }
            }
        }
    }
}
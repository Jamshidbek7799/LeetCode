package com.company;

public class Prob_01_Two_Sum {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int n[] =solution.twoSum(new int[]{2,7,11,15}, 9);

        for (int i = 0; i <n.length ; i++) {
            System.out.print(n[i]+" ");
        }
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target){
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                    int complement = target - nums[i];

                    if (nums[j] == complement){
                        return new int[] {i, j};
                    }
                }
            }
            throw new IllegalArgumentException("no match found");
        }
    }
}

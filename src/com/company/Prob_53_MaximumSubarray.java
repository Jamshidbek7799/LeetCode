package com.company;

public class Prob_53_MaximumSubarray {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int n= solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(n);
    }

    static class Solution{
        public int maxSubArray(int[] nums) {
            int maxSum = nums[0], currSum = nums[0];

            for(int i = 1 ; i < nums.length ; i++) {
                if(currSum >= 0) {
                    currSum += nums[i];
                } else {
                    currSum = nums[i];
                }

                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            return maxSum;
        }
    }
}

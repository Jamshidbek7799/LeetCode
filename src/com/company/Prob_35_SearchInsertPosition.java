package com.company;

public class Prob_35_SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution=new Solution();
       int n = solution.searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(n);
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int cnt=0;
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]==target)
                    cnt=i;
                else if (nums[i]!=target && nums[i]<target)
                    cnt=i+1;
            }
            return cnt;
        }
    }
}

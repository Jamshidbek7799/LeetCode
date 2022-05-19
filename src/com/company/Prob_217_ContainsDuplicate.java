package com.company;

import java.util.HashSet;
import java.util.Set;

public class Prob_217_ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution=new Solution();

        boolean a = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});

        System.out.println(a);

    }

    static class Solution{
        public boolean containsDuplicate(int[] nums){
            boolean b=true;
            Set<Integer> num=new HashSet<Integer>();

            for (int i = 0; i < nums.length ; i++) {
                num.add(nums[i]);
            }

            if (num.size()== nums.length)
                b=false;

            return b;
        }
    }
}

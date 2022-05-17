package com.company;

public class Prob_69_Sqrt {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int n = solution.mySqrt(8);
        System.out.println(n);
    }

    static class Solution{
        public int mySqrt(int x){
            return (int) Math.sqrt(x);
        }
    }
}

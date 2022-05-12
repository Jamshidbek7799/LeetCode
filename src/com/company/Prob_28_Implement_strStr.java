package com.company;

public class Prob_28_Implement_strStr {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int n=solution.strStr("aaa", "aaaa");
        System.out.println(n);
    }

    static class Solution{
        public int strStr(String haystack, String needle){
            return haystack.indexOf(needle);
        }
    }
}

package com.company;

import java.util.ArrayList;

public class Prob_14_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s=solution.longestCommonPrefix(new String[]{"f"});
        System.out.println(s);
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length==0) return "";

            String prefix =strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix)!=0){
                    prefix = prefix.substring(0, prefix.length()-1);
                }
            }
            return prefix;
        }
    }
}
package com.company;

public class Prob_58_LengthofLastWord {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int n = solution.lengthOfLastWord("luffy is still joyboy");
        System.out.println(n);
    }

    static class Solution{
        public int lengthOfLastWord(String s) {
            String[] a=s.split(" "); // remove space
            return a[a.length-1].length();
        }
    }
}

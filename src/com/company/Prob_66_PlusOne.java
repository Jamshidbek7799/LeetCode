package com.company;

public class Prob_66_PlusOne {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] n = solution.plusOne(new int[]{9,9});
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    static class Solution{
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            if(digits[n-1]<9){
                digits[n-1] += 1;
            }
            else{
                digits[n-1] = 0;
                for(int i = n-2; i >= 0; i--){
                    if(digits[i]==9){
                        digits[i] = 0;
                    }
                    else{
                        digits[i]+=1;
                        break;
                    }
                }
            }
            if(digits[0]==0){
                int[] ans = new int[n+1];
                ans[0] = 1;
                return ans;
            }
            return digits;
        }
    }
}

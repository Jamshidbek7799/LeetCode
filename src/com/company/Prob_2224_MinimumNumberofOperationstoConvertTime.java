package com.company;

public class Prob_2224_MinimumNumberofOperationstoConvertTime {
    public static void main(String[] args) {
        Solution solution=new Solution();
       int n= solution.convertTime("11:00", "11:18");
        System.out.println(n);
    }

    static class Solution{
        public int convertTime(String current, String correct) {
            String[] s1=current.split(":") ;
            String[] s2=correct.split(":") ;

            int cur= Integer.parseInt(s1[0])*60 + Integer.parseInt(s1[1]);
            int cor= Integer.parseInt(s2[0])*60 + Integer.parseInt(s2[1]);

            int summa=cor-cur; cur=0;

            if(summa==0)
                return cur;
            cur+=summa/60;
            summa=summa%60;
            if(summa==0)
                return cur;
            cur+=summa/15;
            summa%=15;
            if(summa==0)
                return cur;
            cur+=summa/5;
            summa%=5;
            if(summa==0)
                return cur;
            cur+=summa/1;
            summa%=1;

            return cur;
        }
    }
}

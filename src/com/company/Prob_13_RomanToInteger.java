package com.company;

public class Prob_13_RomanToInteger {
    public static void main(String[] args) {

        Solution solution=new Solution();
        int n = solution.romanToInt("MMMXLV");
        System.out.println(n);
    }

    static class Solution {
        public int romanToInt(String s) {
            int count=0,i;
            for(i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                    count=count+4;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                    count=count+9;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                    count=count+40;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                    count=count+90;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                    count=count+400;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                    count=count+900;
                    System.out.print(count+" ");
                    i++;
                }
                else if(s.charAt(i)=='I'){
                    count++;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='V'){
                    count=count+5;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='X'){
                    count=count+10;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='L'){
                    count=count+50;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='C'){
                    count=count+100;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='D'){
                    count=count+500;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='M'){
                    count=count+1000;
                    System.out.print(count+" ");
                }
            }
            if(i==s.length()-1){
                if(s.charAt(i)=='I'){
                    count++;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='V'){
                    count=count+5;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='X'){
                    count=count+10;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='L'){
                    count=count+50;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='C'){
                    count=count+100;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='D'){
                    count=count+500;
                    System.out.print(count+" ");
                }
                else if(s.charAt(i)=='M'){
                    count=count+1000;
                    System.out.print(count+" ");
                }
            }
            return count;
        }
    }

}
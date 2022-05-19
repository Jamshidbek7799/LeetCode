package com.company;

public class Prob_12_IntegertoRoman {
    public static void main(String[] args) {

        Solution solution=new Solution();
        String s= solution.romanToInt(1994);
        System.out.println(s);
    }

    static class Solution {
        public String romanToInt(int number) {
            String c ="";
            while(number != 0)
            {
                if (number >= 1000)
                {
                    c+="M";
                    number -= 1000;
                }
                else if (number >= 900)
                {
                    c+="CM";
                    number -= 900;
                }
                else if (number >= 500)
                {
                    c+="D";
                    number -= 500;
                }
                else if (number >= 400)
                {
                    c+="CD";
                    number -= 400;
                }

                else if (number >= 100)
                {
                    c+="C";
                    number -= 100;
                }
                else if (number >= 90)
                {
                    c+="XC";
                    number -= 90;
                }
                else if (number >= 50)
                {
                    c+="L";
                    number -= 50;
                }
                else if (number >= 40)
                {
                    c+="XL";
                    number -= 40;
                }
                else if (number >= 10)
                {
                    c+="X";
                    number -= 10;
                }
                else if (number >= 9)
                {
                    c+="IX";
                    number -= 9;
                }

                else if (number >= 5)
                {
                    c+="V";
                    number -= 5;
                }
                else if (number >= 4)
                {
                    c+="IV";
                    number -= 4;
                }
                else if (number >= 1)
                {
                    c+="I";
                    number -= 1;
                }
            }
            return c;
        }
    }

}
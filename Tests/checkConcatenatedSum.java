package com.hawa.practice.Tests;

/* @author steclezion@gmail.com */

/* The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated twice
and then summed, the result will be the original number. It turns out that 198 is the only number with this
property. However, the property can be generalized so that each digit is concatenated n times and then
summed. For example, 2997 = 222+999+999+777 and here each digit is concatenated three times. Write a
function named check ContenatedSum that tests if a number has this generalized property.
The signature of the function is
int checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of times to
concatenate each digit before summing.
The function returns 1 if n is equal to the sum of each of its digits contenated catlen times. Otherwise, it
returns 0. You may assume that n and catlen are greater than zero
Hint: Use integer and modulo 10 arithmetic to sequence through the digits of the argument. */

//
public class checkConcatenatedSum {

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(4, 1));
    }

    static String checkConcatenatedSum(int n, int catlen) {
        int tempNum = n;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            tempNum /= 10;
            for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
                sum += digit * i;  //System.out.print(sum + "   ");
            }
        }
        if (n == sum) return "Yes "+ n +" is concatenated "+catlen+" times and concatenated sum is "+ sum;
        return "No "+n+" is concatenated "+ catlen +" times and output is "+sum;
    }
}

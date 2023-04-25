package com.hawa.practice.Tests;


/** * Java program to find and print largest Adjacent Sum  of an integer number.
 @author steclezion@gmail.com */

/*Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
If you are writing in Java or C#, the function signature is
int largestAdjacentSum(int[ ] a)
If you are writing in C or C++, the function signature is
int largestAdjacentSum(int a[ ], int len) where len is the number of elements in a

 */


public class largestAdjacentSum {
    public static void main(String[] args) {
//        test(new int[] {1, 2, 3, 4}, 4);
//        test(new int[] {18, -12, 9, -10},4);
//        test(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10);
//        test(new int[] {1, 1, 2, 1, 2, 1, 1, 2, 1, 1}, 10);

        largestAdjacentSum(new int[] {1, 2, 3, 4}, 4);
        largestAdjacentSum(new int[] {18, -12, 9, -10},4);
        largestAdjacentSum(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10);
        largestAdjacentSum(new int[] {1, 1, 2, 1, 2, 1, 1, 2, 1, 1}, 10);

    }
    static void largestAdjacentSum(int[] a, int b ) {
        if (b < 2) System.out.println(0);
        int sum = 0;
        for (int i = 1; i < b; i++) {
            if (sum < a[i - 1] + a[i]) {
                sum = a[i] + a[i - 1];
            }
        }
   System.out.println(sum);
    }


//    static void test(int[] a, int e) {
//        if (largestAdjacentSum(a) == e) {
//            System.out.println("PASSED");
//        } else {
//            System.err.println(">>> FAILED");
//        }
//    }











}

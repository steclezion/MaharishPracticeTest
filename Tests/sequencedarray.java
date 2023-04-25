package com.hawa.practice.Tests;

/*
Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers
between m and n inclusive. Furthermore, the array must be in ascending order and contain only those
integers.

For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5
sequenced array because it is missing a 4.
The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the0 is out of range.
And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.


Write a method named isSequencedArray that returns 1 if its argument is an m-n sequenced array,
otherwise it returns 0.

If you are writing in Java or C# the function signature is
int isSequencedArray(int[ ] a, int m, int n)
If you are writing in C or C++ the function signature is
int isSequencedArray(int a[ ], int len, int m, int n) where len is the number of elements in the array a.
You may assume that m<=n



 */

public class sequencedarray {

    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 4, 4, 4, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 5, 5, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{0, 2, 2, 3, 3}, 2, 3));
        System.out.println(isSequencedArray(new int[]{1, 1, 3, 2, 2, 4}, 1, 4));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }

    static int isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;

        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 1; j <= a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }

                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }
}


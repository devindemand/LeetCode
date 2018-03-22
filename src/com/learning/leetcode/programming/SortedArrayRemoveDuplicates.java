package com.learning.leetcode.programming;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class SortedArrayRemoveDuplicates {

    public static void main(String args[]) {
        int[] a = {1, 1, 2};
        int size = removeduplicates(a);
        System.out.println(size);
    }

    private static int removeduplicates(int[] A) {
       // int j = 0;
        //while (i < a.length) {
    /*        if (i==a.length-1)
                a[j++]=a[i];
                break;
            if (a[i] == a[i + 1]) {
                a[j++] = a[a.length - 1];
            } else {
                a[j++] = a[i];
            }
        }*/

        if (A.length < 2)
            return A.length;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        return j + 1;

            /*for (int k = 0; k < a.length; k++) {
                System.out.println(a[k]);
            }*/

        }


    }

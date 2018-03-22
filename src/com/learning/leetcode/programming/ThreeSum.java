package com.learning.leetcode.programming;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeSum {

    public static void main(String args[]) {
        int A[] = {-1, 0, 1, 2, -1, -4};
        int sum = 0;
        int arr_size = A.length;

        new ThreeSum().find3Numbers(A, arr_size, sum);
    }

    boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + " ," + A[j]
                                + " ," + A[k]);
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

}

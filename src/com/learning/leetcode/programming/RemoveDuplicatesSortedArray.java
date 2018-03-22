package com.learning.leetcode.programming;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesSortedArray {

    public static void main(String args[]) {

        int p[] = {1, 1, 2};
        int newSize = removeDuplicates(p);
        System.out.println("The new size is:" + newSize);
    }

    /**
     * Method to remove duplicates
     *
     * @param p
     * @return
     */
    private static int removeDuplicates(int[] p) {
        int newLength = 0;
        int temp = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != p[i + i]) {
                p[temp++] = p[i];
            }
            p[temp++] = p[p.length - 1];
        }
        newLength = p.length;
        return newLength;
    }
}

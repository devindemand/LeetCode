package com.learning.leetcode.programming;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
//TODO Kapil , think if u can implement this using a recursive function
//For sure some of the methods can be re-used  for now i am coding to arrive at the solution
public class TwoSum {

    public static void main(String args[]) {
        int[] inputArray = new int[4];
        inputArray[0] = 0;
        inputArray[1] = 7;
        inputArray[2] = 11;
        inputArray[3] = 26;
        int inputSum = 26;
        _func2Sum(inputArray, inputSum);
    }

    private static void _func2Sum(int[] inputArray, int inputSum) {

        /**
         * check if input exists as an element in the array , then check if there ia any element with the value zero , if yes return the indices for the value 0 and the input number
         */
        if (isExists(inputArray, inputSum)) {
            int idxOf0 = -1;
            int index = getIndiceofInputSum(inputArray, inputSum);
            boolean is0Exists = checkifAnyIndiceZeroValue(inputArray);
            if (is0Exists) {
                idxOf0 = getIdxOf0(inputArray);
                System.out.println("Index of the elements amounting to the sum is:" + idxOf0 + "\t" + index);
            } else {
                //do nothing
            }
        } else {
            printIdx(inputArray, inputSum);
        }

    }

    /**
     * @param inputArray
     * @param inputSum
     */
    private static void printIdx(int[] inputArray, int inputSum) {

        for (int i = 0; i < inputArray.length; i++) {
            if (checkifDiffExistsAsElement(inputSum - inputArray[i], inputArray)) {
                System.out.println("The first idx that the element contributing to input sum exists @ the index:" + i);
                int oIdx = getOtherIndex(inputSum - inputArray[i], inputArray);
                System.out.println("The other idx that the element contributing to input sum exists @ the index:" + oIdx);
                break;
            } else {
                //do nothing
            }
        }

    }

    /**
     * Gets the index of the element
     *
     * @param input
     * @return
     */
    private static int getOtherIndex(int input, int[] inputArray) {
        int idx = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == input) {
                idx = i;
                break;
            } else {
                idx = -1;
            }
        }
        return idx;
    }

    /**
     * This method checks if  the difference exists as an element
     *
     * @param
     * @return
     */
    private static boolean checkifDiffExistsAsElement(int ipt, int[] inputArray) {
        boolean isExists = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ipt) {
                isExists = true;
                break;
            } else {
                isExists = false;
            }
        }

        return isExists;
    }

    private static int getIdxOf0(int[] inputArray) {

        int idxOf0 = -1;
        for (int i : inputArray) {
            if (inputArray[i] == 0) {
                idxOf0 = i;
                break;
            } else {
                idxOf0 = -1;
            }
        }
        return idxOf0;
    }

    /**
     * Checks if any element value within the inputArray has a value 0
     *
     * @param inputArray
     * @return
     */
    private static boolean checkifAnyIndiceZeroValue(int[] inputArray) {
        boolean is0Exists = false;
        for (int i : inputArray) {
            if (inputArray[i] == 0) {
                is0Exists = true;
                break;
            } else {
                is0Exists = false;
            }
        }
        return is0Exists;
    }

    /**
     * This element returns the index in the array which contains the sum element
     *
     * @param inputArray
     * @return
     */
    private static int getIndiceofInputSum(int[] inputArray, int inputSum) {
        int index = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == inputSum) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }

        return index;
    }

    /**
     * This method  checks if the input array contains the input sum as an element
     *
     * @param inputArray
     * @param inputSum
     * @return
     */
    private static boolean isExists(int[] inputArray, int inputSum) {
        boolean isThere = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == inputSum) {
                isThere = true;
                break;
            } else {
                isThere = false;
            }
        }

        return isThere;
    }
}

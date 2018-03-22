package com.learning.leetcode.programming;

/**
 * Converting a string to integer using an ATOI , ascii value of a string
 */
public class ATOI {
    public static void main(String args[]) {

        String inputString = "Kapil";
        getNumbericRepres(inputString);


    }

    /**
     *
     * @param inputString
     */
    private static void getNumbericRepres(String inputString) {
        System.out.println(Integer.parseInt(inputString,10));
    }
}

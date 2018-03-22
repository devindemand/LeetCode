package com.learning.leetcode.programming;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseAnInteger {


    public static void main(String args[]) {

        int inputInt = -1234;
        getReverse(inputInt);
    }

    /**
     * Method 1 is to convert the int to string and reverse the string and convert it back to int
     *
     * @param inputInt
     */
    private static void getReverse(int inputInt) {

        Integer intt = new Integer(inputInt);
        String inpStr = intt.toString();
        StringBuilder sb = new StringBuilder();
        for (int j = inpStr.length() - 1; j >= 0; j--) {
            sb.append(inpStr.charAt(j));
        }

        System.out.println("Returned String :" + sb.toString());
    }
}

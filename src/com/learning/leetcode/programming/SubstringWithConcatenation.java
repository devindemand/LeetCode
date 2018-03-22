package com.learning.leetcode.programming;

/**
 * Substring with Concatenation of All Words
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 * <p>
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 * <p>
 * You should return the indices: [0,9].
 * (order does not matter).
 */
//TODO not finished
public class SubstringWithConcatenation {
    static int tempIdx = 0;

    public static void main(String args[]) {

        String s = "barfoothefoobarman";
        String[] wrdLst = {"foo", "bar"};

        printIdx(s, wrdLst[0], wrdLst[1]);


    }

    private static void printIdx(String s, String s1, String s2) {
        int idxFw = -1;
        int idxSw = -1;
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            j = i + 3;
            if ((s.substring(i, j).equals(s1) || s.substring(i, j).equals(s2))) {
                idxFw = s.indexOf(s1);
                idxSw = s.indexOf(s2);
                if ((idxFw + 3 == idxSw) || (idxFw - 3 == idxSw) || (idxSw - 3 == idxFw) || (idxSw + 3 == idxFw)) {
                    int tmpIdx = 0;
                    if (idxFw > idxSw) {
                        tmpIdx = idxSw;
                        s = s.substring(idxFw + 3, s.length());
                        printIdx(s, s1, s2);


                    } else {
                        tmpIdx = idxFw;
                        s = s.substring(idxSw + 3, s.length());
                        printIdx(s, s1, s2);
                        //System.out.print(":" + idxFw);
                    }
                }


            }
            i = i + 3;
        }
    }
}

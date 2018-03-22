package com.learning.leetcode.programming;

//TODO learn about recursion and attempt this again
/**
 * Implement regular expression matching with support for '.' and '*'.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */
public class RegularExpressionMatching {

    public static void main(String args[]) {
        String inputStr = "aa";
        String matchStr = "a";
        boolean isMatch = check(inputStr, matchStr);

    }

    /**
     * Check if the matchStr matches the input str fully
     * @param inputStr
     * @param matchStr
     * @return
     */
    private static boolean check(String inputStr, String matchStr) {
        boolean isMatch=false;
        int lengthInpStrLength = inputStr.length();
        int lengthMatStrLength = matchStr.length();


        return isMatch;
    }
}

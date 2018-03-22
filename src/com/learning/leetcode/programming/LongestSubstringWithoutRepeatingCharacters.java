package com.learning.leetcode.programming;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * i could not solve this... do it in the mornings
 */
/*Given a string, find the length of the longest substring without repeating characters.
Examples:
       Given "abcabcbb", the answer is "abc", which the length is 3.
        Given "bbbbb", the answer is "b", with the length of 1.
        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
public class LongestSubstringWithoutRepeatingCharacters {

  /*  public static void main(String args[]) {

        String inputStr = "abcabcbb";
        int strLen = inputStr.length();
        StringBuilder sb = getLngstStr(inputStr, strLen);
        System.out.println("The longest string without non repeating characters is:" + sb.toString());
    }

    *//**
     * This method returns the longest string with non repeating characters
     *
     * @param inputStr
     * @param strLen
     * @return
     *//*
    // I think i should use a recursive method here
    private static StringBuilder getLngstStr(String inputStr, int strLen) {
        StringBuilder sb = new StringBuilder(20);
        StringBuilder sb1 = new StringBuilder(20);
        char prevChar = 0;
        for (int i=0;i<strLen;i++){
            if (inputStr.charAt(i)==prevChar){

            }else
            {
                String str = "";
                sb.append(inputStr.charAt(i));

                if(sb.toString().contains(inputStr.charAt(i))){
                    sb1.append(inputStr.charAt(i));
                }
            }
        }


        return sb;
    }*//*  public static void main(String args[]) {

        String inputStr = "abcabcbb";
        int strLen = inputStr.length();
        StringBuilder sb = getLngstStr(inputStr, strLen);
        System.out.println("The longest string without non repeating characters is:" + sb.toString());
    }

    *//**
     * This method returns the longest string with non repeating characters
     *
     * @param inputStr
     * @param strLen
     * @return
     *//*
    // I think i should use a recursive method here
    private static StringBuilder getLngstStr(String inputStr, int strLen) {
        StringBuilder sb = new StringBuilder(20);
        StringBuilder sb1 = new StringBuilder(20);
        char prevChar = 0;
        for (int i=0;i<strLen;i++){
            if (inputStr.charAt(i)==prevChar){

            }else
            {
                String str = "";
                sb.append(inputStr.charAt(i));

                if(sb.toString().contains(inputStr.charAt(i))){
                    sb1.append(inputStr.charAt(i));
                }
            }
        }


        return sb;
    }*/
}

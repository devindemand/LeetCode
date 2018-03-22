package com.learning.leetcode.programming;

public class LetterCombinationTelephone {

    public static void main(String args[]) {

        String inputStr = "79";
        printAllCombinations(inputStr);
    }

    /**
     * This method will print all the combinations
     *
     * @param inputStr
     */
    private static void printAllCombinations(String inputStr) {

        String a1[] = {};
        String a2[] = {};

        String s2 = "abc";
        String s3 = "def";
        String s4 = "ghi";
        String s5 = "jkl";
        String s6 = "mno";
        String s7 = "pqrs";
        String s8 = "tuv";
        String s9 = "wxyz";

        char firstN = inputStr.charAt(0);
        char secondN = inputStr.charAt(1);

        a1 = getArray(firstN);
        a2 = getArray(secondN);

        multiplya1a2(a1, a2);
    }

    private static void multiplya1a2(String[] a1, String[] a2) {
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                System.out.println(a1[i] + a2[j]);
            }
        }
    }

    static String[] getArray(char c) {

        String arr[] = {};

        switch (c) {
            case '2':
                arr = new String[]{"a", "b", "c"};
                break;
            case '3':
                arr = new String[]{"d", "e", "f"};
                break;
            case '4':
                arr = new String[]{"g", "h", "i"};
                break;
            case '5':
                arr = new String[]{"j", "k", "l"};
                break;
            case '6':
                arr = new String[]{"m", "n", "o"};
                break;
            case '7':
                arr = new String[]{"p", "q", "r", "s"};
                break;
            case '8':
                arr = new String[]{"t", "u", "v"};
                break;
            case '9':
                arr = new String[]{"x", "y", "z"};
                break;
        }

        return arr;
    }
}

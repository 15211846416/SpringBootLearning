package com.leetcode.递归;

class Solution {
    private static void helper(int index,char [] str){
        if (str == null || index >= str.length){
            return;
        }
    }

    public static void reverseString(char[] s) {
        helper(0,s);
    }

    public static void main(String[] args) {
        char [] str = {'1','2','3','4','5','6'};
        reverseString(str);

    }
}

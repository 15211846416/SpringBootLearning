package com.leetcode.simple;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 */
public class 回文数 {
    public static void main(String[] args) {
         new 回文数().isPalindrome(1000021);
    }
    public boolean isPalindrome(int x) {
        boolean flag = false;
        String s = String.valueOf(x);
        for (int i = 0 ;i < s.length()/2;i++){
            if (s.charAt(i) == s.charAt(s.length()-i-1)){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        //个位数为 回文数
        if (s.length() == 1)flag = true;
        System.out.println(flag);
        return flag;
    }

    //优化
    public boolean isPalindrome1(int x) {
        boolean flag = false;
        char[] c = String.valueOf(x).toCharArray();
        for (int i = 0 ;i < c.length/2;i++){
            if (c[i] == c[c.length-1-i]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        //个位数为 回文数
        if (c.length == 1)flag = true;
        System.out.println(flag);
        return flag;
    }
}

package com.leetcode.simple;

import java.util.HashMap;

public class 罗马数字转整数 {
    public static void main(String[] args) {
        new 罗马数字转整数().romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {
        HashMap<Character,Integer> dictMap = new HashMap<Character,Integer>();
        Integer sum = 0;
        dictMap.put('I',1);
        dictMap.put('V',5);
        dictMap.put('X',10);
        dictMap.put('L',50);
        dictMap.put('C',100);
        dictMap.put('D',500);
        dictMap.put('M',1000);
        for (int i =0 ;i < s.length();i++){
            if( s.length() != i+1 && dictMap.get(s.charAt(i)) < dictMap.get(s.charAt(i+1))){
                sum +=  dictMap.get(s.charAt(i+1))-dictMap.get(s.charAt(i));i++;
            }else {
                sum += dictMap.get(s.charAt(i));
//
            }
        }
        System.out.println(sum);
        return sum;
    }
}

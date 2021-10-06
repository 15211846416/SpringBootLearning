package com.leetcode.simple;

/**
 * @author Yi
 * @date 2020/7/31 18:11
 */
public class waysToStep {
    private static int count = 0;
    public static void main(String[] args) {

        System.out.println(waysToStep(4));
    }

    public static int waysToStep(int n) {
        int temp = n;
        for (int i = 1;i <= n/2;i++){
            if (i < temp){
                count++;
                temp -= i;
            }else {

            }
        }
        return temp;
    }

}

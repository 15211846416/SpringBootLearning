package com.leetcode.simple;

public class 最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(new 最长公共前缀().longestCommonPrefix(strs));;
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commstr = new StringBuilder();
        boolean flag = false;//不同为FALSE
        String s0 = strs[0];
       int count = 0;
       if(s0 != null )
        if(strs[0].equals("")){
            return "";
        }else if ( strs.length == 1){
            return s0;
        }
       for (int i = 1;i < strs.length;i++){
           if (s0.charAt(0) != strs[i].charAt(0)){
               return "";
           }
       }
      for (int  i = 0;i < 200;i++){
          for (int j = 1;j < strs.length-1;j++){
              if (s0.charAt(i) != '\0')
                  if (strs[j].charAt(i) == s0.charAt(i)){
                      count++;
                  }else {
                      break;
                  }
          }

      }
        System.out.println(s0.substring(0,count));
        return s0.substring(0,count);
    }
}

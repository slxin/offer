package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Solution {
    public static String exChange(String str) {
        StringBuffer sb = new StringBuffer();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String sb = new Solution().exChange("GGBBG");
        System.out.println(sb);
    }
}
package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/17.
 */
public class exChange {
    public static String exChange1(String str){
        StringBuffer sb = new StringBuffer();
        if(str!=null){
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }else if(Character.isLowerCase(c)){
                    sb.append(Character.toUpperCase(c));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String sb = new exChange().exChange1("AAA3");
        System.out.println(sb);

    }
}

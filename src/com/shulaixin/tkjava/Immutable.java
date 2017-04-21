package com.shulaixin.tkjava;

/**
 * Created by Administrator on 2017/3/18.
 */
public class Immutable {
    public static String upcase(String s){
        //return s.toUpperCase();
        return s.toLowerCase();
    }

    public static void main(String[] args){
        String q="ABC";
        String qq=upcase(q);
        System.out.println(qq);
    }
}

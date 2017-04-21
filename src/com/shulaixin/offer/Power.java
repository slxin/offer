package com.shulaixin.offer;

/**
 * 剑指offer系列之十一：数值的整数次方
 * 题目描述

 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 首先，我觉得这道题思路应该很简单，幂的情况无非是三种：正数、0和负数。
 当幂是0的时候，直接返回1；当幂是负数的时候，需要先把其转化为正数来处理，然后返回其倒数就可以了；
 当幂是正数的时候，按照正常的计算方法就可以。实际上这道题主要考察时代码的健壮性——就是对幂的情况的考虑是否周全。
 * Created by Administrator on 2017/3/27.
 */
public class Power {
    public static Double power(double base,int exponent){
        double result=base;
        if(exponent==0){
            return 1.0;
        }
        if(exponent==1){
            return base;
        }else{
            if(exponent>1){
                for(int i=1;i<exponent;i++){
                    base*=result;
                }
                return base;
            }else{
                int fexponent=-exponent;
                for(int i=1;i<fexponent;i++){
                    base*= result;
                }
                return 1/base;
            }
        }
    }
    public static void main(String[] args){
        double result1=new Power().power(0.5,-2);
        System.out.println(result1);
    }
}

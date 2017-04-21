package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/27.
 */
public class NumberOf1 {
    public static int numberof1(int n){
        int count=0;
        while(n!=0){
            ++count;
            n=n&(n-1);
        }
        return count;
    }
    public static void main(String[] args){
        int a=new NumberOf1().numberof1(-9);//负数以其正值的补码形式表达,int为4个字节，32位
        System.out.println(a);
    }
}

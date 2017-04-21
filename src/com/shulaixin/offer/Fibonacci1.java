package com.shulaixin.offer;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2017/3/26.
 */
public class Fibonacci1 {

    public static int find(int n){

        int preOne=1;
        int preTwo=0;
        int result=0;
        if(n==0){
            return preTwo;
        }
        if (n==1){
            return preOne;
        }
        for(int i=1;i<=n;i++){
            result=preOne+preTwo;
            preTwo=preOne;
            preOne=result;
        }
        return result;
    }

    public static void main(String[] args){
        int a=new Fibonacci1().find(5000);
        System.out.println(a);
    }
}

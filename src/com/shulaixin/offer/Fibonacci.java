package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/26.
 */
public class Fibonacci {

    public static int find(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else{
            return find(n - 1) + find(n - 2);
        }
    }
    public static void main(String[] args) {
        int a = new Fibonacci().find(5000);
        System.out.println(a);
    }
}


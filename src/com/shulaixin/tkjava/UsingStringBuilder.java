package com.shulaixin.tkjava;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

/**
 * Created by Administrator on 2017/3/18.
 */
public class UsingStringBuilder {
    public static Random rand=new Random(47);
    public String toString(){
        StringBuilder result=new StringBuilder("[");
        for(int i=0;i<25;i++){
            result.append(rand.nextInt(100));
            result.append(",");
        }
        result.delete(result.length()-1,result.length());
        result.append("]");
        return  result.toString();
    }
    public static void main(String[] args){
        UsingStringBuilder usb=new UsingStringBuilder();
        System.out.println(usb);
    }
}

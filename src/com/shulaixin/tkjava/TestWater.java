package com.shulaixin.tkjava;

/**
 * Created by Administrator on 2017/3/30.
 */
public class TestWater {
    public static void main(String[] args){
        String[] array={"a","a","b","c","a","c","a","a","b","a"};
        System.out.println(find(array));
    }
    public static String find(String [] array){
        int size=array.length;
        String result="c";
        int times=0;
        for(int i=0;i<size;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else{
                if(result==array[i]){
                    ++times;
                }else{
                    --times;
                }
            }
        }
        return result;
    }
}

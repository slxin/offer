package com.shulaixin.tkjava;
import java.util.*;


/**
 * Created by Administrator on 2017/3/18.
 */
public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion: " + super.toString() + "\n";
    }
    public static void main(String[] args){
        List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
        for(int i=0;i<10;i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}

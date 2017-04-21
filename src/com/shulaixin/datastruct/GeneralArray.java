package com.shulaixin.datastruct;

/**
 * Created by Administrator on 2017/3/30.
 */
public class GeneralArray {
    private int[] a;
    private int size;
    private int nEnum;

    public GeneralArray(int max){
        this.a=new int[max];
        this.size=max;
        this.nEnum=0;
    }
    public boolean find(int searchNum){
        int j;
        for(j=0;j<nEnum;j++){
            if(a[j]==searchNum){
                break;
            }
        }
        if(j==nEnum){
            return false;
        }else{
            return true;
        }
    }
    //向数组中插入一个数
    public boolean insert(int value){
        if(nEnum==size){
            System.out.println("数组已满！");
            return false;
        }else{
            a[nEnum]=value;
            nEnum++;
            return true;
        }
    }
}

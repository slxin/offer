package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/23.
 */
public class RoateMin {
    public static void main(String[] args) {
        int a[]={4,3,5,2,1};
        System.out.println(bgetmin(a));
    }

    //依次比较得到最小值
    public static int getmin(int a[]){
        if(a.length>0){
            int min=a[0];
            for(int i=1;i<a.length;i++){
                int temp=a[i];
                if(temp<min){
                    min=temp;
                }
            }
            return min;
        }
        return -1;
    }
    //借助二分查找的思路递归找到最小值
    public static int bgetmin(int [] a){
        if(a!=null&&a.length>0){
            int index1=0;
            int index2=a.length-1;
            int mid=index1;
            while(index1<=index2){
                mid=(index1+index2)/2;
                if(a[mid]==a[index2]&&a[index1]==a[index2]){
                    return getmin(a);
                }else if(a[mid]>a[index1]){
                    index1=mid;
                }else{
                    index2=mid;
                }

            }
            return a[mid];
        }else{
            return 0;
        }
    }
}

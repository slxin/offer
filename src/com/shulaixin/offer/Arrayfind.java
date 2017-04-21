package com.shulaixin.offer;

/**
 *  题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下的数序排列。
 *  请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 例如下面的二维数组就是每行、每列都递增排序。如果在这个数组中查找数字7，则返回true，
 如果要查找5，由于数组不含有该数字，则返回false
 Created by Administrator on 2017/3/26.
 */
public class Arrayfind {

    public static boolean find(int[][] array,int number){
        if(array==null){
            return false;
        }
        int column=array[0].length-1;
        int row=0;
        while(row<array.length&&column>=0) {
            if (array[row][column] == number) {
                return true;
            }
            if (array[row][column] > number) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] testarray=new int[4][4];
//        testarray[0][0]=1;
//        testarray[0][1]=2;
//        testarray[0][2]=8;
//        testarray[0][3]=9;
//        testarray[1][0]=2;
//        testarray[1][1]=4;
//        testarray[1][2]=9;
//        testarray[1][3]=12;
//        testarray[2][0]=4;
//        testarray[2][1]=7;
//        testarray[2][2]=10;
//        testarray[2][3]=13;
//        testarray[3][0]=6;
//        testarray[3][1]=8;
//        testarray[3][2]=11;
//        testarray[3][3]=15;
        testarray[0] = new int[]{1,2,8,9};
        testarray[1] = new int[]{2,4,9,12};
        testarray[2] = new int[]{4,7,10,13};
        testarray[3] = new int[]{6,8,11,15};

        boolean a=new Arrayfind().find(testarray,7);
        System.out.println(a);

        boolean b=new Arrayfind().find(testarray,5);
        System.out.println(b);

        System.out.println(find(testarray, 16));   // 要查找的数比数组中最大的数字还大
    }
}

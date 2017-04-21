package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/27.
 */
public class duplicate_Solution {
//    // Parameters:
//    //    numbers:     an array of integers
//    //    length:      the length of array numbers
//    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
//    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
//    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
//    // Return value:       true if the input is valid, and there are some duplications in the array number
//    //                     otherwise false
//    public static  boolean duplicate(int numbers[], int length, int[] duplication) {
//        if (duplication == null || length < 0) {
//            return false;
//        }
//        for (int i=0; numbers[i] < length; numbers[i]++) {
//            while (duplication[i] != numbers[i]) {
//                if (duplication[i] == duplication[numbers[i]]) {
//                    System.out.println(duplication[i]);
//                    return true;
//                } else {
//                    numbers[i] = duplication[i];
//                    duplication[i] = duplication[numbers[i]];
//                    duplication[numbers[i]] = numbers[i];
//                }
//            }
//
//        }
//    public static void main(String[] args){
//        int[] duplication={2,3,1,0,2,5,3};
//        System.out.println(duplicate_Solution.duplicate(duplication,7, duplication));
//    }

}

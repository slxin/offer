package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/27.
 */
public class FibonacciI {
        public static int JumpFloorI(int target) {
            if(target==0){
                return -1;
            }
            else if(target==1){
                return 1;
            }
            else{
                return JumpFloorI(target-1)*2;
            }
        }
        public static void main(String[] args){
            System.out.println(JumpFloorI(10));
        }
}

package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Test16 {
    static class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode mergelist=null;
        if(list1.val<list2.val){
            mergelist=list1;
            mergelist.next=Merge(list1.next,list2);
        }else{
            mergelist=list2;
            mergelist.next=Merge(list1,list2.next);
        }
        return mergelist;
    }
    public static void main(String[] args){
    }
}

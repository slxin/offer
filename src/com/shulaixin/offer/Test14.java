package com.shulaixin.offer;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 链表中倒数第k个结点
 * 题目描述
 输入一个链表，输出该链表中倒数第k个结点。
 * Created by Administrator on 2017/3/28.
 */
public class Test14 {
    static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0){
            return null;
        }
        ListNode pre=head;
        ListNode behind=null;
        for(int i=0;i<k-1;i++){
            if(pre.next!=null) {
                pre = pre.next;
            }else{
                return null;
            }
        }
        behind=head;
        while(pre.next!=null) {
            pre=pre.next;
            behind=behind.next;
        }
        return behind;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode a=new Test14().FindKthToTail(node1, 4);
        System.out.println(a);
    }
}

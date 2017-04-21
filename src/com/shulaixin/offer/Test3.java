package com.shulaixin.offer;

/**
 * 题目描述：从尾到头打印链表
 * Created by Administrator on 2017/3/28.
 */
public class Test3 {
    static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public static void printListInverselyUsingRecursion(ListNode root) {
        if(root!=null){
            if(root.next!=null){
                printListInverselyUsingRecursion(root.next);
            }
            System.out.println(root);
        }

    }
    public static void main(String[] args){
        ListNode root=new ListNode(1);
        ListNode root1=new ListNode(2);
        ListNode root2=new ListNode(3);
        ListNode root3=new ListNode(4);
        ListNode root4=new ListNode(5);

        root.next=root1;
        root1.next=root2;
        root2.next=root3;
        root3.next=root4;
//        ListNode root = new ListNode(0);
//        root.val = 1;
//        root.next = new ListNode(0);
//        root.next.val = 2;
//        root.next.next = new ListNode(0);
//        root.next.next.val = 3;
//        root.next.next.next = new ListNode(0);
//        root.next.next.next.val = 4;
//        root.next.next.next.next = new ListNode(0);
//        root.next.next.next.next.val = 5;
//        System.out.println();

        printListInverselyUsingRecursion(root);
        System.out.println();
    }
}

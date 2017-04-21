package com.shulaixin.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述：从尾到头打印链表
 * 用栈实现
 * Created by Administrator on 2017/3/28.
 */
public class Test3II {
    static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ArrayList<Integer> printListInverselyUsingRecursion(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<ListNode> stack = new Stack<ListNode>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            int val = stack.pop().val;
            System.out.print(val + " ");
        }
        return list;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        printListInverselyUsingRecursion(node1);
    }
}

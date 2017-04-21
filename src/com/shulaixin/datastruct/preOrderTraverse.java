package com.shulaixin.datastruct;

import javax.swing.tree.TreeNode;

/**
 * Created by Administrator on 2017/3/24.
 */
public class preOrderTraverse {
    static class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public void preOrderTraverse1(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrderTraverse1(node.left);
        preOrderTraverse1(node.right);
    }
    public static void main(String[] args){
        TreeNode  root =new TreeNode(8);
        TreeNode  node1 =new TreeNode(6);
        TreeNode  node2 =new TreeNode(10);
        TreeNode  node3 =new TreeNode(5);
        TreeNode  node4 =new TreeNode(7);
        TreeNode  node5 =new TreeNode(9);
        TreeNode  node6 =new TreeNode(11);
        TreeNode  node7 =new TreeNode(15);
        TreeNode  node8 =new TreeNode(24);
        TreeNode  node9 =new TreeNode(30);
        TreeNode  node10 =new TreeNode(28);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node3.left = node7;
        node7.right = node8;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node5.left = node9;
        node6.right = node10;

        new preOrderTraverse().preOrderTraverse1(root);
    }
}

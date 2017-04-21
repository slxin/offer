package com.shulaixin.datastruct;

/**
 * 二叉树遍历算法之二：中序遍历
 * Created by Administrator on 2017/3/29.
 */
public class inOrderTraverse {
    static class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public void inOrderTraverse1(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        inOrderTraverse1(treeNode.left);
        System.out.println(treeNode.val);
        inOrderTraverse1(treeNode.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);
        TreeNode node7 = new TreeNode(15);
        TreeNode node8 = new TreeNode(24);
        TreeNode node9 = new TreeNode(30);
        TreeNode node10 = new TreeNode(28);

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

        new inOrderTraverse().inOrderTraverse1(root);
    }
}

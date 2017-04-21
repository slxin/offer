package com.shulaixin.offer;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Test18 {
    static class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;

        public TreeNode(int val){
            this.val=val;
        }
    }
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }
    public static void main(String[] args){
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(6);
        TreeNode node3=new TreeNode(10);

        node1.left=node2;
        node1.right=node3;

        System.out.println();
    }
}

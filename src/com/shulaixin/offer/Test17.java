package com.shulaixin.offer;

/**
 * 剑指offer：树的子结构
 * 题目描述
 输入两颗二叉树A，B，判断B是不是A的子结构。
 * Created by Administrator on 2017/3/28.
 */
public class Test17 {
    static class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;

        public TreeNode(int val){
            this.val=val;
        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = DoesTree1HaveTree2(root1, root2);
            }
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
            return result;
        }

    private boolean DoesTree1HaveTree2(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        //两条语句先后顺序不能错
        if(root1==null) {
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return DoesTree1HaveTree2(root1.left,root2.left)&&DoesTree1HaveTree2(root1.right,root2.right);
    }

}

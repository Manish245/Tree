package com.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode node=new TreeNode();
        node.val=1;
        node.left=new TreeNode(3);
       // node.right=new TreeNode(4);
        node.left.right=new TreeNode(2);
        recoverTree(node);
    }


   static int temp=0;
    static TreeNode first=null;
    static TreeNode prev=null;

    public static void recoverTree(TreeNode root) {
        if(root==null)
        {
            return;
        }
        if(first==null)
            first=root;

        recoverTree(root.left);
        if(first.val>root.val)
        {
            prev=root;
            root.val=first.val;
        }


    }
}

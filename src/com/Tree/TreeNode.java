package com.Tree;

 public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public int height=0;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

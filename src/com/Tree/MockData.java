package com.Tree;

public class MockData {
    public static TreeNode createData(){
        TreeNode node=new TreeNode();
        node.val=1;
        node.left=new TreeNode(2,null,null);
        node.right=new TreeNode(3,null,null);
        node.left.left=new TreeNode(4,null,null);
        node.left.right=new TreeNode(5,null,null);
        node.right.left=new TreeNode(6,null,null);
        node.right.right= new TreeNode(7,null,null);

        node.left.left.left=new TreeNode(8,null,null);
       // node.left.left.right=new TreeNode(9,null,null);
       // node.left.right.left=new TreeNode(10,null,null);
        node.left.right.right=new TreeNode(11,null,null);

        node.right.left.left=new TreeNode(12,null,null);
        node.right.left.right=new TreeNode(13,null,null);
        node.right.right.left=new TreeNode(14,null,null);
        node.right.right.right=new TreeNode(15,null,null);
        return node;
    }

    public static TreeNode createBinarySearchTreeData(){
        TreeNode node=new TreeNode();
        node.val=100;
        node.left=new TreeNode(50,null,null);
        node.right=new TreeNode(150,null,null);
        node.left.left=new TreeNode(30,null,null);
        node.left.right=new TreeNode(80,null,null);
        node.right.left=new TreeNode(130,null,null);
        node.right.right= new TreeNode(200,null,null);

        node.left.left.left=new TreeNode(20,null,null);
        node.left.left.right=new TreeNode(40,null,null);
        node.left.right.left=new TreeNode(70,null,null);
        node.left.right.right=new TreeNode(90,null,null);

        node.right.left.left=new TreeNode(120,null,null);
        node.right.left.right=new TreeNode(140,null,null);

        return node;
    }

}

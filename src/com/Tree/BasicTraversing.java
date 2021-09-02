package com.Tree;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Queue;

public class BasicTraversing {

/*
 write program to count nodes
 */
    public static int countNode(TreeNode node)
    {
        int x,y;
        if(node!=null){
            x=countNode(node.left);
            y=countNode(node.right);
            return x+y+1;
        }
        else
            return 0;

    }
    /*
    Write a program to count nodes those are leaf node
     */
    public static int leafNodeCount(TreeNode node){
        if(node==null) return 0;
        int x,y;
        x=leafNodeCount(node.left);
        y=leafNodeCount(node.right);
        if(node.left==null && node.right==null)
            return x+y+1;
        else return x+y;
    }

    /*
      Write a program to count nodes those are having left and right node
     */
    public static int nonLeafNodeCount(TreeNode node){
         if(node==null)return 0;
        int x,y;
        x=nonLeafNodeCount(node.left);
        y=nonLeafNodeCount(node.right);
        if(node.left!=null && node.right!=null)
            return x+y+1;
        else return 0;
    }

    /*
    Write a program to print the nodes level by level.
     */
    public static void printNodeLevelBy(TreeNode node){
        if(node==null)return;
        System.out.println("----------Display node level by level----------");
        System.out.print(node.val+",");
       Queue<TreeNode> queue=new LinkedList<TreeNode>();
       queue.add(node.left);
       queue.add(node.right);

       while(!queue.isEmpty()){
           TreeNode childNode=queue.poll();
           if(childNode!=null){
               System.out.print(childNode.val+",");
               if(childNode.left!=null)
                   queue.add(childNode.left);
               if(childNode.right!=null)
                   queue.add(childNode.right);
           }
       }
        System.out.println();
        System.out.println("----------End----------");
    }

    /*
    Write a program to count nodes that are having degree(1)
     */
    public static int degree1NodeCount(TreeNode node){
        if(node==null) return 0;
        int x,y;
        x=degree1NodeCount(node.left);
        y=degree1NodeCount(node.right);
        if((node.left==null && node.right!=null) ||( node.left!=null && node.right==null))
            return x+y+1;
        else return x+y;
    }

/*
Write a program to find tree height.
 */
    public static int getTreeHeight(TreeNode node){
        if(node==null) return 0;
        int x,y;
        x=degree1NodeCount(node.left);
        y=degree1NodeCount(node.right);
        if(x>y)
            return x+1;
        else return y+1;
    }
    /*
    Print nodes level by level and start from the bottom
     */
public static void printNodeLevelByStartFromBottom(TreeNode node){
    if(node==null)return;
    System.out.println("----------Display node level by level start from bottom----------");
    Queue<TreeNode> queue=new LinkedList<TreeNode>();

}
}

package com.Tree;

import com.sun.source.tree.BreakTree;

public class BinarySearchTree {
    /*
    Time complaxity: O(logn)
    Space complaxity: O(logn)
     */
    public static boolean findKeyRecursive(TreeNode node,int key){

        if(node==null) return false;
        else if(node.val==key) return true;
        else if(node.val>key){
         return    findKeyRecursive(node.left,key);
        }
            else{
             return   findKeyRecursive(node.right,key);
        }
    }

    /*
    Time complaxity: O(logn)
    Space complaxity: constant
     */
    public static boolean findKeyUsingLoop(TreeNode node, int key){
        if(node==null) return false;
        else if(node.val==key) return true;
        while (node!=null){
            if(node.val==key) return true;
               if(node.val>key){
                  node=node.left;
            }
               else{
                   node=node.right;
               }
        }
        return false;
    }

    public static TreeNode insertNodeRecursive(TreeNode nodeObj, int key){
        if(nodeObj==null) nodeObj=new TreeNode(key,null,null);
        if(key==nodeObj.val)return null;
        TreeNode node=nodeObj,tell=null;
        while (node!=null){
            tell=node;
            if(key==node.val)break;
           else if(key<node.val){
                node=node.left;
            }
            else {
                node=node.right;
            }
        }
        System.out.println(tell.val);
        if(tell.val>key){
            tell.left=new TreeNode(key,null,null);
        }
        else{
            tell.right=new TreeNode(key,null,null);
        }
        return nodeObj;
    }
}

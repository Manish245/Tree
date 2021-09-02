package com.Tree;

public class Main {

    public static void main(String[] args) {
        //Node Count
        System.out.println("Total Count: "+BasicTraversing.countNode(MockData.createData()));
        System.out.println("Leaf node count: "+BasicTraversing.leafNodeCount(MockData.createData()));
        System.out.println("non leaf node count: "+BasicTraversing.nonLeafNodeCount(MockData.createData()));
        System.out.println("Degree(1) node count: "+BasicTraversing.degree1NodeCount(MockData.createData()));

        //Below traverse and display node level order
        BasicTraversing.printNodeLevelBy(MockData.createBinarySearchTreeData());

        System.out.println("Tree Height: "+BasicTraversing.getTreeHeight(MockData.createData()));

        System.out.println("----------------Binary Search Tree-------------------------");
        System.out.println("find key recursive: "+BinarySearchTree.findKeyRecursive(MockData.createBinarySearchTreeData(),80));
        System.out.println("find key by loop: "+BinarySearchTree.findKeyUsingLoop(MockData.createBinarySearchTreeData(),140));


        TreeNode nodes=BinarySearchTree.insertNodeRecursive(MockData.createBinarySearchTreeData(),95);
        nodes=BinarySearchTree.insertNodeRecursive(nodes,45);
        nodes=BinarySearchTree.insertNodeRecursive(nodes,10);
        nodes=BinarySearchTree.insertNodeRecursive(nodes,75);
        nodes=BinarySearchTree.insertNodeRecursive(nodes,205);
        BasicTraversing.printNodeLevelBy( nodes);


    }
}

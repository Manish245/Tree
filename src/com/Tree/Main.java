package com.Tree;

public class Main {

    public static void main(String[] args) {
        //Node Count
        System.out.println("Total Count: "+BasicTraversing.countNode(MockData.createData()));
        System.out.println("Leaf node count: "+BasicTraversing.leafNodeCount(MockData.createData()));
        System.out.println("non leaf node count: "+BasicTraversing.nonLeafNodeCount(MockData.createData()));
        System.out.println("Degree(1) node count: "+BasicTraversing.degree1NodeCount(MockData.createData()));

        //Below traverse and display node level order
       // BasicTraversing.printNodeLevelBy(MockData.createData());

        System.out.println("Tree Height: "+BasicTraversing.getTreeHeight(MockData.createData()));


    }
}

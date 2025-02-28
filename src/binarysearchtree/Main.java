package binarysearchtree;

import java.sql.SQLOutput;

public class Main {
    public static void main( String argv[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(5);


        System.out.println("BST "+ bst.contains(20));
    }


}

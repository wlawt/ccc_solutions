/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc_2019;

/**
 *
 * @author William Law
 */
public class BinaryTree {
    public static class Node {
        int key;
        Node left, right;
        
        public Node(int item) {
            int key = item;
            Node left = right = null;
        }
    }
    
    public static class Binary_Tree {
        Node root;
        
        Binary_Tree() {
            root = null;
        }
        
        void print_inorder(Node n) {
            if (n == null)
                return;
            
            print_inorder(n.left);
            
            System.out.println(n.key + " ");
            
            print_inorder(n.right);
        }
        
        void print_inorder() {
            print_inorder(root);
        }
        
        public static void BinaryTree(String[] args) {
            Binary_Tree tree = new Binary_Tree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("\nInorder traversal DFS ");
            tree.print_inorder();
                        
        }
    }
   
}

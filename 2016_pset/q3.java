package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

/**
 *
 * @author William Law
 */
public class Main {
    
    public static class Node {
        Node left;
        Node right;
        
        public Node(Node first, Node second) {
            this.left = first;
            this.right = second;
        }
        
        public ArrayList<Node> get_children() {
            ArrayList<Node> children = new ArrayList<>();
            
            if(this.left != null) 
                children.add(left);
            
            if(this.right != null) 
                children.add(right);
            
            return children;
        }
        
        public boolean remove(Node n) {
            return false;
        }
    }
    
    public static class BFS {
        Node start;
        Node goal;
        
        public BFS(Node start, Node goal) {
            this.start = start;
            this.goal = goal;
        }
        
        public boolean compute() {
            if(this.start.equals(this.goal)) {
                System.out.println(this.start);
                return true;
            }
            
            Queue<Node> queue = new LinkedList<>();
            ArrayList<Node> explored = new ArrayList<>();
            
            queue.add(start);
            explored.add(this.start);
            
            while(!queue.isEmpty()) {
                Node current = queue.remove();
                
                if(current.equals(this.goal))
                    return true;
                else {
                    if(current.get_children().isEmpty()) {
                        return false;
                    } else {
                        queue.addAll(current.get_children());
                    }
                }
                
                explored.add(current);
            }
            
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] n_input = input.split("\\s+");
        int N = Integer.parseInt(n_input[0]);
        int M = Integer.parseInt(n_input[1]);
        
        ArrayList<Integer> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String n = in.nextLine();
            String[] nn = n.split("\\s+");
            nodes.add(Integer.parseInt(nn[0]));
            
        }
        
    }
}

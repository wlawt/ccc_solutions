/* 
    Breadth first search 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static class Node {
        Node left;
        Node right; 
        public String some_value;
        public Node(String some_value, Node first, Node second) {
            this.left = first;
            this.right = second;
            this.some_value = some_value;
        }

        public ArrayList<Node> get_children() {
            ArrayList<Node> children = new ArrayList<>();

            if (this.left != null) 
                children.add(this.left)
            
            if (this.right != null) 
                children.add(this.right)

            return children
        }

        public boolean remove(Node n) {
            return false;
        }
    }

    public static class bfs {
        Node start;
        Node goal;

        public BFS(Node start, Node goal) {
            this.start = start;
            this.goal = goal;
        }

        public boolean compute() {
            if(this.start == goal) {
                System.out.println("matched!");
                return true;
            }

            Queue<Node> queue = new LinkedList<>();
            ArrayList<Node> explored = new ArrayList<>();

            queue.add(this.start);
            explored.add(start);

            while(!queue.isEmpty()) {
                Node current = queue.remove();

                if (current == goal) {
                    return true;
                } else {
                    if (current.get_children().isEmpty()) {
                        return false;
                    } else {
                        queue.addAll(current.get_children());
                    }
                }

                explored.add(current.get_children())
            }

            return false;
        }
    }

    public static void BFS(String[] args) {
        Node station_1 = new Node("1 westminster", null, null);
        Node station_2 = new Node("2 waterloo", station_1, null);
        Node station_3 = new Node("3 toronto", station_1, station_2);
        Node station_4 = new Node("4 london", station_2, station_3);
        Node station_5 = new Node("5 brampton", station_4, station_3);
        Node station_6 = new Node("6 ottawa", station_5, station_4);

        BFS bfs = new BFS(station_6, station_1);

        if (bfs.compute()) {
            System.out.println("Path found");
        }
    }
}
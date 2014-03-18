package com.company;


import java.util.*;

public class UndirectedGraph {

    private List<UndirectedNode> vertices = new ArrayList<UndirectedNode>();


    public UndirectedGraph(ArrayList<UndirectedNode> vertices) {
        this.vertices = vertices;
    }

    public void addVertex(UndirectedNode vertex) {
        if (!this.vertices.contains(vertex)) {
            this.vertices.add(vertex);
        }
    }

    public void dfs(UndirectedNode root) {
        Stack<UndirectedNode> stack = new Stack<UndirectedNode>();
        stack.push(root);
        root.visited = true;
        while (!stack.isEmpty()) {
            UndirectedNode node = stack.pop();
            for (UndirectedNode nodes : node.edgeNodes) {
                if (!nodes.visited) {
                    System.out.println(nodes.data);
                    nodes.visited = true;
                    dfs(nodes);
                    stack.push(nodes);
                }
            }
        }

    }
    public void bfs(UndirectedNode root) {
        Queue<UndirectedNode> queue = new LinkedList<UndirectedNode>();
        queue.add(root);
        root.visited = true;
        while (!queue.isEmpty()) {
            UndirectedNode curNode = queue.poll();
            System.out.println(curNode.data + " ");
            for (UndirectedNode n : curNode.edgeNodes) {
                if (!n.visited) {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }

    }
    public void printGraph() {
        for (int i = 0; i < this.vertices.size(); i++) {
            UndirectedNode vertex = this.vertices.get(i);
            String edges = "";
            for (int j = 0; j < vertex.edgeNodes.size(); j++) {
                edges += vertex.edgeNodes.get(j).data + ", ";
            }
            System.out.println("Vertex " + vertex.data + " connects with: " + edges);
        }
    }

}

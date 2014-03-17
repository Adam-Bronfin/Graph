package com.company;


import java.util.*;

public class Graph {
    private List<DataNode> vertices = new ArrayList<DataNode>();


    public Graph(ArrayList<DataNode> vertices) {
        this.vertices = vertices;
    }

    public void addVertex(DataNode vertex) {
        if (!this.vertices.contains(vertex)) {
            this.vertices.add(vertex);
        }
    }

    public void dfs(DataNode root) {
        Stack<DataNode> stack = new Stack<DataNode>();
        stack.push(root);
        root.visited = true;
        while (!stack.isEmpty()) {
            DataNode node = stack.pop();
            for (DataNode nodes : node.edgeNodes) {
                if (!nodes.visited) {
                    System.out.println(nodes.data);
                    nodes.visited = true;
                    dfs(nodes);
                    stack.push(nodes);
                }
            }
        }

    }
    public void bfs(DataNode root) {
        Queue<DataNode> queue = new LinkedList<DataNode>();
        queue.add(root);
        root.visited = true;
        while (!queue.isEmpty()) {
            DataNode curNode = queue.poll();
            System.out.println(curNode.data + " ");
            for (DataNode n : curNode.edgeNodes) {
                if (!n.visited) {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }

    }
    public void printGraph() {
        for (int i = 0; i < this.vertices.size(); i++) {
            DataNode vertex = this.vertices.get(i);
            String edges = "";
            for (int j = 0; j < vertex.edgeNodes.size(); j++) {
                edges += vertex.edgeNodes.get(j).data + ", ";
            }
            System.out.println("Vertex " + vertex.data + " connects with: " + edges);
        }
    }


}

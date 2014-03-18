package com.company;


import java.util.*;

public class DirectedGraph {
    private List<DirectedNode> vertices = new ArrayList<DirectedNode>();


    public DirectedGraph(ArrayList<DirectedNode> vertices) {
        this.vertices = vertices;
    }

    public void addVertex(DirectedNode vertex) {
        if (!this.vertices.contains(vertex)) {
            this.vertices.add(vertex);
        }
    }
    //works for any DAG, ie directed, acyclic directedGraph
    public Stack<DirectedNode> topologicalSort(DirectedNode root) {
        //uses dfs, and then places each visited node onto a stack. This stack when emptied, comprises of
        //the only or first found permutation of possible topological sorts
        Stack<DirectedNode> visitedNodes = new Stack<DirectedNode>();
        Stack<DirectedNode> topologicalNodes = new Stack<DirectedNode>();

        visitedNodes.push(root);
        root.visited = true;
        while (!visitedNodes.isEmpty()) {
            DirectedNode curNode = visitedNodes.pop();
            topologicalNodes.push(curNode);
            for (DirectedNode node : curNode.edgeNodes) {
                if (!node.visited) {
                    node.visited = true;
                    dfs(node);
                    visitedNodes.push(node);
                }
            }
        }
        return topologicalNodes;
    }


    public void dfs(DirectedNode root) {
        Stack<DirectedNode> stack = new Stack<DirectedNode>();
        stack.push(root);
        root.visited = true;
        while (!stack.isEmpty()) {
            DirectedNode node = stack.pop();
            for (DirectedNode nodes : node.edgeNodes) {
                if (!nodes.visited) {
                    nodes.visited = true;
                    dfs(nodes);
                    stack.push(nodes);
                }
            }
        }

    }
    public void bfs(DirectedNode root) {
        Queue<DirectedNode> queue = new LinkedList<DirectedNode>();
        queue.add(root);
        root.visited = true;
        while (!queue.isEmpty()) {
            DirectedNode curNode = queue.poll();
            System.out.println(curNode.data + " ");
            for (DirectedNode n : curNode.edgeNodes) {
                if (!n.visited) {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }

    }
    public void printGraph() {
        for (int i = 0; i < this.vertices.size(); i++) {
            DirectedNode vertex = this.vertices.get(i);
            String edges = "";
            for (int j = 0; j < vertex.edgeNodes.size(); j++) {
                edges += vertex.edgeNodes.get(j).data + ", ";
            }
            System.out.println("Vertex " + vertex.data + " connects with: " + edges);
        }
    }


}

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        UndirectedNode a = new UndirectedNode(1);
        UndirectedNode b = new UndirectedNode(2);
        UndirectedNode c = new UndirectedNode(3);
        UndirectedNode d = new UndirectedNode(4);
        UndirectedNode e = new UndirectedNode(5);
//        UndirectedNode d = new UndirectedNode(10);
//        UndirectedNode e = new UndirectedNode(8);
//        UndirectedNode g = new UndirectedNode(6);
        ArrayList<UndirectedNode> nodes = new ArrayList<UndirectedNode>();
//        UndirectedNode f = new UndirectedNode(3);
        nodes.add(a);
        nodes.add(b);
        nodes.add(c);
        nodes.add(d);
        nodes.add(e);
        a.addEdgeNode(b);
        c.addEdgeNode(a);
        c.addEdgeNode(d);
        c.addEdgeNode(e);
//        nodes.add(d);
//        nodes.add(e);
//        nodes.add(f);
//        nodes.add(g);
//        a.addEdgeNode(b);
//        a.addEdgeNode(c);
//        a.addEdgeNode(f);
//        a.addEdgeNode(e);
//        b.addEdgeNode(g);
//        b.addEdgeNode(a);
//        b.addEdgeNode(c);
//        c.addEdgeNode(g);
//        c.addEdgeNode(a);
//        c.addEdgeNode(e);
//        c.addEdgeNode(f);
//        d.addEdgeNode(b);
//        d.addEdgeNode(a);
//        d.addEdgeNode(g);
//        e.addEdgeNode(f);
//        f.addEdgeNode(b);
//        g.addEdgeNode(e);



        UndirectedGraph directedGraph = new UndirectedGraph(nodes);
        directedGraph.dfs(a);
        //directedGraph.printGraph();

    }
}

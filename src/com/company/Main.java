package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        DataNode a = new DataNode(1);
        DataNode b = new DataNode(2);
        DataNode c = new DataNode(3);
        DataNode d = new DataNode(4);
        DataNode e = new DataNode(5);
//        DataNode d = new DataNode(10);
//        DataNode e = new DataNode(8);
//        DataNode f = new DataNode(3);
//        DataNode g = new DataNode(6);
        ArrayList<DataNode> nodes = new ArrayList<DataNode>();
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



        Graph graph = new Graph(nodes);
        graph.dfs(a);
        //graph.printGraph();

    }
}

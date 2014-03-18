package com.company;

import java.util.LinkedList;
import java.util.List;

public class UndirectedNode {
    public Integer data;
    public boolean visited;
    public List<UndirectedNode> edgeNodes;


    public UndirectedNode(Integer Data) {
        this.data = Data;
        this.edgeNodes = new LinkedList<UndirectedNode>();
    }

    public void addEdgeNode(final UndirectedNode node) {
        this.edgeNodes.add(node);
        node.edgeNodes.add(this);
    }

}

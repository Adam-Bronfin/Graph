package com.company;

import java.util.LinkedList;
import java.util.List;

public class DirectedNode {
    public Integer data;
    public boolean visited;
    public List<DirectedNode> edgeNodes;


    public DirectedNode(Integer Data) {
        this.data = Data;
        this.edgeNodes = new LinkedList<DirectedNode>();
    }

    public void addEdgeNode(final DirectedNode node) {
        this.edgeNodes.add(node);
    }
}

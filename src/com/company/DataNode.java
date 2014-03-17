package com.company;

import java.util.LinkedList;
import java.util.List;

public class DataNode {
    public Integer data;
    public boolean visited;
    public List<DataNode> edgeNodes;


    public DataNode(Integer Data) {
        this.data = Data;
        this.edgeNodes = new LinkedList<DataNode>();
    }

    public void addEdgeNode(final DataNode node) {
        this.edgeNodes.add(node);
        node.edgeNodes.add(this);
    }

}

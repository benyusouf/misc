package com.abdulify.algos.Common;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private List<Vertex> adjencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjencyList = new ArrayList<Vertex>();
    }

    @Override
    public String toString(){
        return this.name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public List<Vertex> getAdjencyList() {
        return adjencyList;
    }

    public void addNeighbor(Vertex vertex) {
        this.adjencyList.add(vertex);
    }

    
    
}

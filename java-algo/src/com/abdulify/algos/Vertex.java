package com.abdulify.algos;
import java.util.List;
import java.util.ArrayList;

public class Vertex {
    private String name;
    private List<Vertex> adjencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjencyList = new ArrayList<Vertex>();
    }
    public void addNeighbor(Vertex neighbor){
        adjencyList.add(neighbor);
    }
    public void showNeigbors(){
        for(Vertex v : adjencyList)
            System.out.println(v);
    }
    
    @Override
    public String toString(){
        return name;
    }
}

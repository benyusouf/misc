package com.abdulify.algos.BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.abdulify.algos.Common.Vertex;

public class BreadthFirstSearch {
    public void traverse(Vertex root){

        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex);
            for(Vertex v: actualVertex.getAdjencyList()){
                if(v.isVisited()) continue;
                v.setVisited(true);
                queue.add(v);
            }
        }
    }
}

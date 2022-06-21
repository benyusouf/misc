package com.abdulify.algos;

import com.abdulify.algos.BFS.BreadthFirstSearch;
import com.abdulify.algos.Common.Vertex;

public class Main {
    public static int[][] adjencyMatrix = {
        {0, 2, 4, 0},
        {0, 0, 0, 3},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };
    public static void main(String[] args){
        // Adjecency matrix
        // find all edges
        // for(int i = 0; i < adjencyMatrix.length; i++){
        //     for(int j = i; j < adjencyMatrix.length; j++){
        //         if(adjencyMatrix[i][j] != 0)
        //             System.out.println("Edges with weight: " + adjencyMatrix[i][j]);
        //     }
        // }


        // // Adjecency list
        // Vertex a = new Vertex("A");
        // Vertex b = new Vertex("B");
        // Vertex c = new Vertex("C");
        // Vertex d = new Vertex("D");

        // // add edges
        // a.addNeighbor(b);
        // a.addNeighbor(c);
        // b.addNeighbor(d);

        // // print all neighbors
        // a.showNeigbors();
        // b.showNeigbors();
        // c.showNeigbors();
        // d.showNeigbors();

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);

        b.addNeighbor(a);
        b.addNeighbor(c);
        b.addNeighbor(d);

        c.addNeighbor(b);

        d.addNeighbor(b);
        d.addNeighbor(e);

        f.addNeighbor(a);

        g.addNeighbor(a);
        g.addNeighbor(h);

        h.addNeighbor(g);

        bfs.traverse(a);
    }
}

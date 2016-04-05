/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphImpl;

import graph.Edge;
import graph.UndirectedEdge;
import graph.Vertex;

public class TestGraphImpl {
     public static void main(String[] args) {

    

    // Create an 3-vertex graph.
    System.out.println("Creating a graph with 3 vertices");
    AdjMatric graph = new AdjMatric(3, false);
    double v1Coord[] = {0.3, 0.0};
    double v2Coord[] = {1.0, 1.2};
    double v3Coord[] = {2.0, -2.0};
    Vertex v1 = new Vertex(v1Coord);
    System.out.println("Adding Vertex v1 with the given coordinates :  ( " + v1.getCoordinates()[0] + " , "+v1.getCoordinates()[1] + " ) ");
    Vertex v2 = new Vertex(v2Coord);
    Vertex v3 = new Vertex(v3Coord);
    UndirectedEdge e1 = new UndirectedEdge(v1, v2);
    UndirectedEdge e2 = new UndirectedEdge(v2, v3);
    System.out.println("Adding Edge e1 ( v1, v2 ) was successfully done  :  " + graph.addEdgeToGraph(v1, v2, (Edge)e1));
    System.out.println("Adding Edge e2 ( v2, v3 ) was successfully done  :  " + graph.addEdgeToGraph(v2, v3, (Edge)e2));
    Edge[][] adjacencyMatrix = graph.getAdjacencyMatrix();
    System.out.println("Checking if e1 and e2 are adjacent ... :  " + graph.isAdjacent( (Edge)e1, (Edge)e2 ) );
    System.out.println("\nThe graph has\n" + graph);
   
}
}

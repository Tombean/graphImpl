/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphImpl;

import graph.Edge;
import graph.UndirectedEdge;
import graph.DirectedEdge;
import graph.Vertex;

public class TestGraphImpl {
     public static void main(String[] args) {

    

    // Create an 3-vertex graph.
    System.out.println("Creating a graph with 5 vertices maximum");
    AdjMatric graph = new AdjMatric(5, false);
    double v1Coord[] = {0.3, 0.0};
    double v2Coord[] = {1.0, 1.2};
    double v3Coord[] = {2.0, -2.0};
    Vertex v1 = new Vertex(v1Coord);
    System.out.println("Adding Vertex v1 with the given coordinates :  ( " + v1.getCoordinates()[0] + " , "+v1.getCoordinates()[1] + " ) ");
    Vertex v2 = new Vertex(v2Coord);
    System.out.println("Adding Vertex v2 with the given coordinates :  ( " + v2.getCoordinates()[0] + " , "+v2.getCoordinates()[1] + " ) ");
    Vertex v3 = new Vertex(v3Coord);
    System.out.println("Adding Vertex v3 with the given coordinates :  ( " + v3.getCoordinates()[0] + " , "+v3.getCoordinates()[1] + " ) ");
    UndirectedEdge e1 = new UndirectedEdge(v1, v2);
    UndirectedEdge e2 = new UndirectedEdge(v2, v3);
    System.out.println("Adding Edge e1 ( v1, v2 ) ..... e1 was successfully created  :  " + graph.addEdgeToGraph(v1, v2, (Edge)e1));
    System.out.println("Adding Edge e2 ( v2, v3 ) ..... e2 was successfully created  :  " + graph.addEdgeToGraph(v2, v3, (Edge)e2));
    System.out.println("Existence of an Edge bewteen ( v2, v3 ) :  " + graph.hasEdge(v2, v3) );
    System.out.println("Existence of an Edge bewteen ( v1, v3 ) :  " + graph.hasEdge(v1, v3) );
    System.out.println("Checking if e1 and e2 are adjacent ...... Adjacency :  " + graph.isAdjacent( e1, e2 ) );
    Vertex[] neighbours = graph.getNeighbours(v2);
    System.out.println("Neighbours of v2 are : ");
    for ( int i = 0; i < neighbours.length ; i++){ System.out.print(neighbours[i].getCoordinates()[0] + " , " + neighbours[i].getCoordinates()[1] + " // "); }
    
    System.out.println("\nThe graph has\n" + graph);
    
   
}
}

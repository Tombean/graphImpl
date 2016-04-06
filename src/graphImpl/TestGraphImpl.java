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
    int numberMaximumOfVertices = 5;
    System.out.println("Creating a graph with "+ numberMaximumOfVertices+" vertices maximum");
    AdjMatric graph = new AdjMatric(numberMaximumOfVertices, false);
    String nomV1 = "A";
    String nomV2 = "B";
    String nomV3 = "C";
    Vertex v1 = new Vertex(nomV1);
    System.out.println("Adding Vertex v1 with the given coordinates :  ( " + v1.getCoordinates() + " ) ");
    Vertex v2 = new Vertex(nomV2);
    System.out.println("Adding Vertex v2 with the given coordinates :  ( " + v2.getCoordinates() + " ) ");
    Vertex v3 = new Vertex(nomV3);
    System.out.println("Adding Vertex v3 with the given coordinates :  ( " + v3.getCoordinates() + " ) ");
    UndirectedEdge e1 = new UndirectedEdge(v1, v2);
    UndirectedEdge e2 = new UndirectedEdge(v2, v3);
    System.out.println("Adding Edge e1 ( v1, v2 ) ..... e1 was successfully created  :  " + graph.addEdgeToGraph(v1, v2, (Edge)e1));
    System.out.println("Adding Edge e2 ( v2, v3 ) ..... e2 was successfully created  :  " + graph.addEdgeToGraph(v2, v3, (Edge)e2));
    System.out.println("Existence of an Edge bewteen ( v2, v3 ) :  " + graph.hasEdge(v2, v3) );
    System.out.println("Existence of an Edge bewteen ( v1, v3 ) :  " + graph.hasEdge(v1, v3) );
    System.out.println("Checking if e1 and e2 are adjacent ...... Adjacency :  " + graph.isAdjacent( e1, e2 ) );
    Vertex[] neighbours = graph.getNeighbours(v2);
    System.out.println("Neighbours of "+v2.getCoordinates() +" are : ");
    for ( int i = 0; i < neighbours.length ; i++){ System.out.print(neighbours[i].getClass().getSimpleName() +" ( " + neighbours[i].getCoordinates() + " ) // "); }
    
    System.out.println("\nThe graph is called : " + graph.toString());
    
   
}
}

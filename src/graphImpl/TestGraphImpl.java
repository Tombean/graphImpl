/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

public class TestGraphImpl {
     public static void main(String[] args) {

    

    // Create an 3-vertex graph.
    System.out.println("Creating a graph with 3 vertices");
    AdjMatrixGraph graph = new AdjMatrixGraph(3);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    
    System.out.println("\nThe graph has\n" + graph);
   
}
}

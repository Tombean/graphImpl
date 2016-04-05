/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

public  class AdjMatrixGraph implements Graph {
    /**
   *  adjMatrix references the adjacency matrix of the graph.
   *  vertices is the number of vertices in the graph.
   *  edges is the number of edges in the graph.
   *
   */
    private boolean[][] adjMatrix;
    private int vertices;
    private int edges;
    
   /**
   *  Constructs a graph with n vertices and no edges.
   */
  public AdjMatrixGraph(int n) {
    vertices = n;
    edges = 0;
    adjMatrix = new boolean[n][n];
    for (int i = 0; i < vertices; i++ ) {
      for (int j = 0; j < vertices; j++ ) {
	adjMatrix[i][j] = false;
      }
    }
  }

/**
   *  Returns true if v is a valid vertex number; false otherwise.
   *  @param v the vertex.
   *  @return boolean indicating existence of vertex number v.
   */
  public boolean validVertex(int v) {
    return (v >= 0) && (v < vertices);
  }
/**
   *  Creates the edge (sourceVertex, targetVertex).  If the edge did not already
   *    exists, increments the edge count.
   *  @param origin the origin vertex.
   *  @param end the destination vertex.
   */
  public void addEdge(int origin, int end) {
    if (validVertex(origin) && validVertex(end)) {
      if (!adjMatrix[origin][end]) {
	adjMatrix[origin][end] = true;
        edges++;
      }
    }    
  }
  /**
   *  Returns true if edge (sourceVertex, targetVertex) exists; false otherwise.
   *  @param origin the origin vertex.
   *  @param end the destination vertex.
   *  @return boolean indicating the presence of edge (origin, destination).
   */
  public boolean hasEdge(int origin, int end) {
    if (validVertex(origin) && validVertex(end)) {
      return adjMatrix[origin][end];
    } else {
      return false;
    }
  }
  
  /**
   *  Deletes the edge (origin, end).  If the edge existed, decrements
   *    the edge count.
   *  @param origin the origin vertex.
   *  @param end the destination vertex.
   */
  public void removeEdge(int origin, int end) {
    if (validVertex(origin) && validVertex(end)) {
      if (adjMatrix[origin][end]) {
	adjMatrix[origin][end] = false;
	edges--;
      }
    }        
  }
  
  /**
   *  Returns a String representing the adjacency matrix, including the number
   *    of vertices and edges.
   *  @return a String representing the adjacency matrix.
   */
  public String toString() {
    int i, j;
    String s = vertices + " vertices and " + edges + " edges\n";
    for (i = 0; i < vertices; i++) {
      for (j = 0; j < vertices - 1; j++) {
	s = s + (adjMatrix[i][j] ? "t" : ".")  + " ";
      }
      s = s + (adjMatrix[i][j] ? "t" : ".")  + "\n";
    }
    return s;
  }

    @Override
    public Edge addEdge(Vertex sourceVertex, Vertex targetVertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addEdgeToGraph(Vertex sourceVertex, Vertex targetVertex, Edge edge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addVertexToGraph(Vertex vertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsEdge(Edge edge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsVertex(Vertex vertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edge[] getAllEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vertex[] getAllVertex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edge[] isInEdges(Vertex vertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edge getEdge(Vertex sourceVertex, Vertex targetVertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDirected(Edge edge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeEdge(Edge edge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeVertex(Vertex vertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAllVertices(Vertex[] vertices) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAllEdges(Edge[] edges) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAdjacent(Edge A, Edge B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
  
}

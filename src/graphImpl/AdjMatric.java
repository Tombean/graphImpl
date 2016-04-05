package graphImpl;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

public class AdjMatric implements Graph {

	/**
	   *  adjMatrix references the adjacency matrix of the graph.
	   *  vertices is the number of vertices in the graph.
	   *  edges is the number of edges in the graph.
	   *
	   */
	    private Edge[][] adjMatrix;
	    private int vertices;
	    private Vertex vertexList[];
	    private int edges;
	    boolean directed;
	    
	   /**
	   *  Constructs a graph with n vertices and no edges.
	   */
	  public AdjMatric(int n, boolean directed) {
		this.directed =  directed;
	    vertices = n;
	    edges = 0;
	    adjMatrix = new Edge[n][n];
	    vertexList = new Vertex[n];
	  }

	/**
	   *  Returns true if v is a valid vertex number; false otherwise.
	   *  @param v the vertex.
	   *  @return boolean indicating existence of vertex number v.
	   */
	  @Override
	  public boolean validVertex(Vertex v) {
	    return (getIndiceOfVertex(v) >= 0) && (getIndiceOfVertex(v) < vertices);
	  }
	
	  
	  public int getIndiceOfVertex( Vertex v){
		  int ind = vertexList.length + 1;
		  for ( int i = 0; i < vertexList.length; i++ ){
			  if (v.equals(vertexList[i])){ ind = i;}
		  }
		  return ind;
	  }
	  /**
	   *  Returns true if edge (sourceVertex, targetVertex) exists; false otherwise.
	   *  @param origin the origin vertex.
	   *  @param end the destination vertex.
	   *  @return boolean indicating the presence of edge (origin, destination).
	   */
	  @Override
	  public boolean hasEdge(Vertex origin, Vertex end) {
		  if (validVertex(origin) && validVertex(end)) {
			  if(directed){ return ( adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] != null ) ; }
			  else { 
				  return ( adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] != null 
						  && adjMatrix[getIndiceOfVertex(end)][getIndiceOfVertex(origin)] != null ) ; 
				  }
			  }
	  		else { return false;}
	  }
	
	  
	  /**
	   *  Deletes the edge (origin, end).  If the edge existed, decrements
	   *    the edge count.
	   *  @param origin the origin vertex.
	   *  @param end the destination vertex.
	   */
	  @Override
	  public void removeEdge(Vertex origin, Vertex end) {
	    if (validVertex(origin) && validVertex(end)) {
	      if ( !hasEdge( origin, end )  ) {
	    	  adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] = null;
	    	  if (!directed && !hasEdge( origin, end )){
	    		  adjMatrix[getIndiceOfVertex(end)][getIndiceOfVertex(origin)] = null; 
	    		  adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] = null;
	    	  }
	      }
	    }        
	  }
	
	  /**
	   *  Creates the edge (sourceVertex, targetVertex).  If the edge did not already
	   *    exists, increments the edge count.
	   *  @param origin the origin vertex.
	   *  @param end the destination vertex.
	   *  @param edge to add.
	   */
	@Override
	public boolean addEdgeToGraph(Vertex origin, Vertex end, Edge edge) {
		if (validVertex(origin) && validVertex(end)) {
		    	adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] = edge;
		    	if (!directed){adjMatrix[getIndiceOfVertex(end)][getIndiceOfVertex(origin)] = edge; }
		        edges++;
		        return true;
		}		     
		else {return false; }
	}

	@Override
	public boolean addVertexToGraph(Vertex arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsEdge(Edge arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Edge getEdge(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isAdjacent(Edge arg0, Edge arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDirected(Edge arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeVertex(Vertex arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sontLies(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		return false;
	}



}

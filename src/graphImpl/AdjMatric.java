package graphImpl;

import graph.DirectedEdge;
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
	   *  Constructs a graph with n vertices and no edges, directed or not.
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
	

	  
	  public boolean containsVertex( Vertex v ){
		  boolean present = false;
		  for ( int i = 0; i< vertices ; i ++){
			  if( vertexList[i] == v){ present = true; }
		  }
		  return present;
	  }
	  
	  /** Returns the indice of a vertex
	   * @param v the vertex
	   */
	  public int getIndiceOfVertex( Vertex v){
		  int ind = vertexList.length + 1;
		  for ( int i = 0; i < vertexList.length; i++ ){
			  if (v.equals(vertexList[i])){ ind = i;}
		  }
		  return ind;
	  }
	  /**
	   *  Returns true if edge (sourceVertex, targetVertex) exists; false otherwise.
	   *  @param origin the origin of a vertex.
	   *  @param end the end of a vertex.
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
	   *  Deletes the edge (origin, end).
	   *  @param origin the origin  vertex.
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
		if (! (containsVertex(origin) ) ){ 
			System.out.println("New Vertex added : "+addVertexToGraph( origin ) );
		}
		if (! (containsVertex(end) ) ){ 
			System.out.println("New Vertex added : "+addVertexToGraph( end ) );
		}
		if (validVertex(origin) && validVertex(end)) {
		    	adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)] = edge;
		    	if (!directed){adjMatrix[getIndiceOfVertex(end)][getIndiceOfVertex(origin)] = edge; }
		        edges++;
		        return true;
		}		     
		else {
			return false; }
	}

	 /**
	 * Adds the specified vertex to this graph if not already present.
	 * @param v a vertex.
	 * @return boolean indicating if the vertex has successfully added to the graph.
	 */
	@Override
	public boolean addVertexToGraph(Vertex v) {
		boolean added = false;
		int i = 0;
		do{
			if ( vertexList[i] ==  null) { 
				vertexList[i] = v;
				added = true;
			}
			i++;
		}while( i<=vertices && added == false);
		return added;
	}
	
	/**
	 * Returns true if this graph contains the specified edge.
	 * @param e an edge
	 * @return boolean
	 */
	@Override
	public boolean containsEdge(Edge e) {
		return ( hasEdge( e.getCoordinates()[0], e.getCoordinates()[1]) );
	}


	/**
	 * Returns an edge connecting source vertex to target vertex.
	 * @param origin the origin vertex.
	 * @param end the end vertex.
	 * @return Edge
	 */
	@Override
	public Edge getEdge(Vertex origin, Vertex end) {
		return adjMatrix[getIndiceOfVertex(origin)][getIndiceOfVertex(end)];
	}

	/**
	 * Checks if two edges are adjacent
	 * @param A an edge
	 * @param B an edge
	 * @return returns true if the two edges are adjacent
	 */
	@Override
	public boolean isAdjacent(Edge A, Edge B) {
		if (!A.equals(B)){
			if (directed && (( ( (Edge) A ).getCoordinates()[0] ==  ( (Edge) B).getCoordinates()[1] ) 
					|| ((Edge)A).getCoordinates()[1] ==  ( (Edge) B).getCoordinates()[0] )) { return true;}
			if (!directed && ( A.getCoordinates()[0] == B.getCoordinates()[1] 
					|| A.getCoordinates()[1] == B.getCoordinates()[0]
					|| A.getCoordinates()[0] == B.getCoordinates()[0] 
					|| A.getCoordinates()[1] == B.getCoordinates()[1])) { return true;}
		}
		return false;
	}

	/**
	 * Indicates if an edge is directed or undirected
	 * @param e an edge
	 * @return true if directed, false if not
	 */
	@Override
	public boolean isDirected(Edge e) { 
		return ( e instanceof DirectedEdge);
	}

	/**
	 * Removes the specified vertex from the graph.
	 * @param v a vertex
	 * @return true if the vertex has been removed with no issue
	 */
	@Override
	public boolean removeVertex(Vertex v) {
		boolean deleted = false;
		if ( validVertex(v) ){	
			int i = 0;
			do{
				if ( vertexList[i] ==  v) { 
					for (int j = 0; j< vertices; j ++){
						adjMatrix[getIndiceOfVertex(v)][j] = null;
						adjMatrix[j][getIndiceOfVertex(v)] = null;
					}
					vertexList[i] = null;
					deleted = true;
				}
			}while( i<vertices && deleted == false);
			vertices--;
		}
		return deleted;
	}

	@Override
	public boolean sontLies(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Vertex[] getAllVertices(){
		return this.vertexList;
	}
	
	public Edge[][] getAdjacencyMatrix(){
		return this.adjMatrix;
	}



}

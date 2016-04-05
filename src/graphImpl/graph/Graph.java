package graphImpl.graph;

public interface Graph {
   
     /**
	 * Adds the specified edge to this graph, going from the origin to the end of the vertex.
	 * @param start
	 * @param end
	 * @param edge
	 * @return boolean to see if it has been succesfully uploaded
	 */
   
    public boolean addEdge(Vertex start, Vertex end, Edge edge);
     /**
	 * Adds the specified vertex to the graph
	 * @param vertex
	 * @return boolean to see if it has been succesfully uploaded
	 */
    
    public boolean addVertex(Vertex vertex);
    /**
     * checks if the edge is directed or undirected
     * @param edge
     * @returns edge
     */
    
    public boolean whatType( Edge edge);
    /**
     * returns the edge making the connection start to end
     * @param start
     * @param end
     * @returns edge
     */
    
    public Edge getEdge(Vertex start, Vertex end);
 } 
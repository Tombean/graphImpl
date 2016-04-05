package graph;

public abstract class Edge {
    protected Vertex[] vertex;
    /**
     * returns the vertex made up by 2 points of an edge
     * @return a vertex 
     */
    public Vertex[] getCoordinates(){
        return this.vertex;
    }

}
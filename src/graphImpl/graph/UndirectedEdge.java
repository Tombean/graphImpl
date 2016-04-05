package graph;

public class UndirectedEdge extends Edge{

    private Vertex[] vertex;
	//we have initialized the first element of the array vertex[0] as the origin (start) and the vertex[1] the target (end)
        public UndirectedEdge(Vertex start, Vertex end){
            vertex = new Vertex[2];
            this.vertex[0]=start;
            this.vertex[1]=end;
	}

}
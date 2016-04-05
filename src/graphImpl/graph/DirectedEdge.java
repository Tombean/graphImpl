package graphImpl.graph;

public class DirectedEdge extends Edge{
	
	//we have declared an array of sommets from where we have set vertex[0] the origin and vertex[1] the direction

	
	public DirectedEdge( Vertex origin,Vertex sense){
		this.vertex = new Vertex[2];
		this.vertex[0]=origin;
		this.vertex[1]=sense;
	}
        
        //return the element of the origin
	public Vertex getOrigin() {
		return this.vertex[0];
		
	}
	
	public Vertex getEnd() {
		return this.vertex[1];
		
	}
        public void setOrigin(Vertex o){
            this.vertex[0]=o;
        }
	
}
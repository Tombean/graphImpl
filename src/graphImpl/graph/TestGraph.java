package graphImpl.graph;

public class TestGraph {
	
	public static void main(String args[]) {
		double point1[] = {2.1 , 2.1 };
		double point2[] = {1.0 , 1.0 };
		Vertex one =  new Vertex( point1 );
		Vertex two =  new Vertex( point2 );
		UndirectedEdge unEdge = new UndirectedEdge( one, two);
        DirectedEdge edge= new DirectedEdge( one, two);
		System.out.println("here we have the graph.enjoy!");
	}
}
package graphImpl.graph;

public class Vertex{
    protected double[] coordinates;
    
    //creat a vertex
    public Vertex(double[] coordinates){
        this.coordinates= coordinates;
    }
    /**
     * returns an array with the coordinates of an array
     * @return the array
     */
     public double[] getCoordinates(){
        return this.coordinates;
 }  
}
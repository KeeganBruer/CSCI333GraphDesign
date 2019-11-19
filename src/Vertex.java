import java.util.ArrayList;
/**
 * Vertex that acts as a single vertex in a graph.
 * Vertex class works with both directional and non-directional graphs with a slight tweak.
 * If non-directional, use addNeighbor on both vertices that are being linked together. 
 * If directional, use addNeighbor only on the starting Vertex.
 * 
 * Class: 333 | Project 7 | 11/18/2019
 */
public class Vertex {
	enum Stage 
	{ 
	    WHITE, GREY, BLACK; 
	}
	private ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
	private int label, distance, key, dTime, fTime;
	private Stage stage;
	private Vertex parent;

	public Vertex(int l) {
		label = l;
		stage = Stage.WHITE;
		distance = 0;
	}
	
	/**
	 * Adds a new neighbor to the current Vertex, connected by an edge. AddNeighbor implies
	 * directionality from this Vertex to the other. 
	 * @param n Vertex to add
	 * @return true if able to be added, false if already exists 
	 */
	public boolean addNeighbor(Vertex n) {
		return true;
	}
	
	/**
	 * @return current list of neighbors
	 */
	public ArrayList<Vertex> getNeighbors() {
		return neighbors;
		//note: could also do (ArrayList<Vertex>) neighbors.clone(); for proper encapsulation at the price of
		//time and a casting warning by the IDE
	}
	
	/**
	 * Sets the current stage of the vertex. This records whether the Vertex has been visited
	 * before GREY or if it has been searched BLACK. Should be advanced on both visit and search.
	 */
	public void setStage(Stage s) {
		this.stage = s;
	}
	
	/**
	 * Resets the stage counter to unvisited so that the graph may have repeat searches.
	 */
	public void resetStage() {
		stage = Stage.WHITE;
	}
	
	/**
	 * @return integer label of the Vertex, used for identification and graph-building
	 */
	public int getLabel() {
		return label;
	}
	
	/**
	 * @return stage as WHITE, GREY, BLACK
	 */
	public Stage getStage() {
		return stage;
	}
	
	public void setDistance(int newDist) {
		distance = newDist;	
	}
	
	public int getDistance() {
		return distance;	
	}
	
	public void setParent(Vertex p) {
		this.parent = p;
	}
	
	public Vertex getParent() {
		return this.parent;
	}
	
	public void setDTime(int d) {
		this.dTime = d;
	}
	
	public int getDTime() {
		return this.dTime;
	}
	
	public void setFTime(int f) {
		this.fTime = f;
	}
	
	public int getFTime() {
		return this.fTime;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return this.key;
	}
}

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
	private int label;
	private Stage stage;
	private int distance;

	public Vertex(int l) {
		label = l;
		stage = Stage.WHITE;
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
	 * Adds one to the stage counter of the Vertex. This records whether the Vertex has been visited
	 * before GREY or if it has been searched BLACK. Should be advanced on both visit and search.
	 */
	public void advanceStage() {
		switch (stage) {
			case WHITE:
				stage = Stage.GREY;
				break;
			case GREY:
				stage = Stage.BLACK;
			default:
				break;
		}
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
}

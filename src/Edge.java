
/**
 * Edge object that contains the weight of an edge and the start and end vertexs.
 * 
 * Class: 333 | Project 7 | 11/18/2019
 */
public class Edge {
	private Vertex start, end; //references
	private int weight;
	public Edge(int weight) {
		this.weight = weight;
	}
	public Edge(Vertex start, Vertex end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	/*
	 * Sets the Weight of the edge
	 * @param w - the new weight of the edge. 
	 */
	public void setWeight(int w) {
		this.weight = w;
	}
	
	/*
	 * Returns the current weight of the edge
	 */
	public int getWeight() {
		return this.weight;
	}
	/*
	 * Sets the start vertex of the edge
	 * @param s - the new start vertex of the edge. 
	 */
	public void setStart(Vertex s) {
		this.start = s;
	}
	
	/*
	 * Returns the current start vertex of the edge
	 */
	public Vertex getStart() {
		return this.start;
	}
	/*
	 * Sets the end vertex of the edge
	 * @param e - the new start vertex of the edge. 
	 */
	public void setEnd(Vertex e) {
		this.end = e;
	}
	
	/*
	 * Returns the current end vertex of the edge
	 */
	public Vertex getEnd() {
		return this.end;
	}
}
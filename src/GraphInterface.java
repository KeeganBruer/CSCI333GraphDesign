/**
 * 
 * 
 * Class: 333 | Project 6 | 11/18/2019
 */

public interface GraphInterface {
	
	/**
	 * Performs a breadth-first search starting at the node specified, printing nodes as they're visited.
	 * @param startingNode
	 */
	void BFS(int startingNode);
	/**
	 * Inserts vertex with specified int value as a label
	 * @param vertex int label
	 * @return true if inserted, false if already exists
	 */
	boolean insertVertex(int vertex);
	/**
	 * Inserts edge from start vertex to end vertex
	 * @param start int label of vertex to begin the edge
	 * @param end int label of vertex to end the edge
	 * @return true if successfully inserted, false if missing vertices or if an edge already exists between the two vertices?
	 */
	boolean insertDirectedEdge(int start, int end);
	boolean insertUndirectedEdge(int vertex1, int vertex2);
	/**
	 * Prints graph as array.
	 */
	void printGraphArray();
}

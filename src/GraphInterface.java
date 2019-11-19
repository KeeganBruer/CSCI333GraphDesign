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
	 * Performs a deapth-first search starting at the node specified, printing nodes as they're visited.
	 * @param startingNode
	 */
	void DFS(int startingNode);
	/**
	 * Performs a Prim's search starting at the node specified, printing nodes as they're visited.
	 * @param startingNode
	 */
	void MST(int startingNode);
	/**
	 * Inserts vertex with specified int value as a label
	 * @param vertex int label
	 * @return true if inserted, false if already exists
	 */
	boolean insertVertex(int vertex);
	/**
	 * Inserts vertex with specified int value as a label
	 * @param vertex int label
	 * @return true if inserted, false if already exists
	 */
	boolean deleteVertex(int vertex);
	/**
	 * Inserts edge from start vertex to end vertex by adding the end as a neighbor to start but NOT adding start as a neighbor to end.
	 * @param start int label of vertex to begin the edge
	 * @param end int label of vertex to end the edge
	 * @return true if successfully inserted, false if missing vertices or if an edge already exists between the two vertices?
	 */
	boolean insertDirectedEdge(int start, int end);
	/**
	 * Inserts edge from start vertex to end vertex by adding the end as a neighbor to start but NOT adding start as a neighbor to end.
	 * It also adds an edge with a weight.
	 * @param start int label of vertex to begin the edge
	 * @param end int label of vertex to end the edge
	 * @param weight int weight of edge
	 * @return true if successfully inserted, false if missing vertices or if an edge already exists between the two vertices?
	 */
	boolean insertDirectedWeightedEdge(int start, int end, int weight);
	/**
	 * Inserts edge from start vertex to end vertex by adding the end as a neighbor to start but AND adding vertex2 as a neighbor to vertex1.
	 * It also adds an edge with a weight.
	 * @param vertex1 int label of the first vertex
	 * @param vertex2 int label of the second vertex
	 * @param weight int weight of edge
	 * @return true if successfully inserted, false if missing vertices or if an edge already exists between the two vertices?
	 */
	boolean insertUndirectedWeightedEdge(int vertex1, int vertex2, int weight);
	/**
	 * Inserts edge from start vertex to end vertex by adding the vertex1 as a neighbor to vertex2 AND adding vertex2 as a neighbor to vertex1.
	 * @param vertex1 int label of the first vertex
	 * @param vertex2 int label of the second vertex
	 * @return true if successfully inserted, false if missing vertices or if an edge already exists between the two vertices?
	 */
	boolean insertUndirectedEdge(int vertex1, int vertex2);
	
	/**
	 * Prints graph as array.
	 */
	void printGraphArray();
	
	/*
	 * An alternative form of printing then printGraphArray.
	 * Prints out the path from vertex start to vertex end.
	 */
	void printPath(int start, int end);
}

import java.util.ArrayList;

/**
 * 
 * 
 * Class: 333 | Project 6 | 11/18/2019
 */

public class Graph implements GraphInterface {
	
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	
	public Graph() {
		//
	}

	@Override
	public void BFS(int startingNode) {
		//TODO stub		
	}

	@Override
	public boolean insertVertex(int vertex) {
		// TODO stub
		return false;
	}

	@Override
	public boolean insertDirectedEdge(int start, int end) {
		// TODO stub
		return false;
	}

	@Override
	public boolean insertUndirectedEdge(int vertex1, int vertex2) {
		return insertDirectedEdge(vertex1, vertex2) && insertDirectedEdge(vertex2, vertex1);
	}

	@Override
	public void printGraphArray() {
		// TODO stub
		
	}
	
}
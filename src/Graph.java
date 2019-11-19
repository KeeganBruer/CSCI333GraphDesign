import java.util.ArrayList;

/**
 * 
 * 
 * Class: 333 | Project 6 | 11/18/2019
 */

public class Graph implements GraphInterface {
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	ArrayList<Edge> edges = new ArrayList<Edge>();
	@Override
	public void BFS(int startingNode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DFS(int startingNode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MST(int startingNode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertVertex(int vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVertex(int vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertDirectedEdge(int start, int end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertDirectedWeightedEdge(int start, int end, int weight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUndirectedWeightedEdge(int vertex1, int vertex2, int weight) {
		return insertDirectedWeightedEdge(vertex1, vertex2, weight) && insertDirectedWeightedEdge(vertex2, vertex1, weight);
	}

	@Override
	public boolean insertUndirectedEdge(int vertex1, int vertex2) {
		return insertDirectedEdge(vertex1, vertex2) && insertDirectedEdge(vertex2, vertex1);
	}

	@Override
	public void printGraphArray() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPath(int start, int end) {
		// TODO Auto-generated method stub
		
	}

	
}

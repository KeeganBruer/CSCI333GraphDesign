import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 
 * 
 * Class: 333 | Project 6 | 11/18/2019
 */

public class Graph implements GraphInterface {
	
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	Queue<Vertex> bfsQueue = new LinkedList<>();

	public Graph() {
		//
	}

	@Override
	public void BFS(int startingNode) {
		/*
		Vertex v = null;
		for each vertex u in G except for s
		   u.color = WHITE
		   u.d =  // infinite distance, for now. replaced later with a real distance
		   u.p = NULL
		s.color = GRAY
		s.d = 0 // s is distance 0 from itself
		s.p = NULL // s is the root of the breadth-first tree
		let Q be a new and empty queue
		ENQUEUE(Q, s) // put vertex s into the queue: the first vertex to be visited
		while Q is not empty
		   u = DEQUEUE(Q) // remove a vertex u to visit, from Q
		   u.color = BLACK
		   for each vertex v adjacent to u
		      if v.color == WHITE // gray or black neighbors are left alone
		         v.color = GRAY
		         v.d = u.d + 1 // v (the child of u) is 1 farther from s than u
		         v.p = u // v is added to the breadth-first tree as a child of u
		         ENQUEUE(Q, v) // put v in the queue of vertices to visit later
	
		 */
		Vertex v = null;
		for (Vertex u : vertices) {
			u.setStage(Stage.WHITE);
			u.setDistance(Integer.MAX_VALUE);
			u.set
		}
	}
	
	@Override
	public void DFS(int startingNode) {
		//TODO stub		
	}
	
	@Override
	public void MST(int startingNode) {
		//TODO stub		
	}

	@Override
	public boolean insertVertex(int vertex) {
		Vertex v = new Vertex(vertex);
		vertices.add(v);
		return true;
	}
	
	@Override
	public boolean deleteVertex(int vertex) {
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getLabel() == vertex) {
				vertices.remove(i);
				i -= 1;
			} else {
				vertices.get(i).removeNeighbor(vertex);
			}
		}
		return true;
	}

	@Override
	public boolean insertDirectedEdge(int start, int end) {
		Vertex endV = null;
		Vertex startV = null;
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getLabel() == end) {
				endV = vertices.get(i);
			}
			if (vertices.get(i).getLabel() == start) {
				startV = vertices.get(i);
			}
		}
		startV.addNeighbor(endV);
		return true;
	}

	@Override
	public boolean insertUndirectedEdge(int vertex1, int vertex2) {
		return insertDirectedEdge(vertex1, vertex2) && insertDirectedEdge(vertex2, vertex1);
	}

	@Override
	public void printGraphArray() {
		for (int i = 0; i < vertices.size(); i++) {
			Vertex v = vertices.get(i);
			System.out.print(v.getLabel() + " ");
			for (int n = 0; n < v.getNeighbors().size(); n++) {
				System.out.print(v.getNeighbors().get(n).getLabel() + " ");
			}
			System.out.println("");
		}
		
	}
	
	private Vertex getVertex(int vertex) {
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getLabel() == vertex) {
				return vertices.get(i);
			}
		}
		return null;
	}
	
}

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
		Vertex s = null;
		for (Vertex u : vertices) {
			if (u.getLabel() != startingNode) {
				u.setStage(Stage.WHITE);
				u.setDistance(Integer.MAX_VALUE);
				u.setParent(null);
			}else {
				s = u;
			}
		}
		s.setStage(Stage.GREY);
		s.setDistance(0);
		s.setParent(null);
		bfsQueue.add(s);
		while (!bfsQueue.isEmpty()) {
			Vertex u = bfsQueue.remove();
			u.setStage(Stage.BLACK);
			for (Vertex v : u.getNeighbors()) {
				if (v.getStage() == Stage.WHITE) {
					v.setStage(Stage.GREY);
					v.setDistance(u.getDistance() + 1);
					v.setParent(u);
					bfsQueue.add(v);
				}
			}
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
	
	public void printShortestPath(int s, int v) {
		System.out.print("Shortest Path from " + s + " to " + v + ": ");
		printShortestPathHelper(s, v);
	}
	private void printShortestPathHelper(int s, int v) {
		Vertex sV = getVertex(s);
		Vertex vV = getVertex(v);
		if (sV.getLabel() == vV.getLabel()) {
			System.out.print(sV.getLabel()+ " ");
		} else if (vV.getParent() == null) {
			System.out.println("No Path Exists");
		} else {
			printShortestPathHelper(s, vV.getParent().getLabel());
			System.out.print(vV.getLabel() + " ");
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

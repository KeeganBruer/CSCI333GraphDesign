import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * 
 * 
 * Class: 333 | Project 6 | 11/18/2019
 */

public class Graph implements GraphInterface {
	
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	int time = 0;

	public Graph() {
		//
		}

	@Override
	public void BFS(int startingNode) {
		Queue<Vertex> bfsQueue = new LinkedList<>();
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
		for (Vertex u : vertices) {
			u.setStage(Stage.WHITE);
			u.setParent(null);
		}
		this.time = 0;
		for (Vertex u : vertices) {
			if (u.getStage() == Stage.WHITE) {
				DFSVisit(u);
			}
		}
	}
	
	private void DFSVisit(Vertex u) {
		this.time++;
		u.setDTime(time); // u is now being visited. first timestamp
		u.setStage(Stage.GREY);
		for (Vertex v : u.getNeighbors()) {
		   if (v.getStage() == Stage.WHITE) { // only visit white neighbors u of v
		      v.setParent(u); // u is now the parent of v in the tree
		      DFSVisit(v); // recursion: immediately visit newly found v
		   }
		}
		u.setStage(Stage.BLACK); // loop done. all neighbors of u visited. backtrack.
		this.time++;
		u.setFTime(time); // u is finished. last timestamp
	}
	
	@Override
	public void MST(int startingNode) {
		Vertex r = getVertex(startingNode);
		for (Vertex u : vertices) {
			u.setKey(Integer.MAX_VALUE);
			u.setParent(null);
		}
		PriorityQueue<Vertex> pQueue = new PriorityQueue<Vertex>(vertices);
		while (!pQueue.isEmpty()) {
			Vertex u = pQueue.poll();
			for (Vertex v : u.getNeighbors()) {
				int weightUtoV = 0;
				if (pQueue.contains(v) && weightUtoV < v.getKey()) {
					v.setParent(u);
					v.setKey(weightUtoV);
				}
			}
		}
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
	
	public void printPath(int s, int v) {
		System.out.print("Path from " + s + " to " + v + ": ");
		printPathHelper(s, v);
	}
	private void printPathHelper(int s, int v) {
		Vertex sV = getVertex(s);
		Vertex vV = getVertex(v);
		if (sV.getLabel() == vV.getLabel()) {
			System.out.print(sV.getLabel()+ " ");
		} else if (vV.getParent() == null) {
			System.out.println("No Path Exists");
		} else {
			printPathHelper(s, vV.getParent().getLabel());
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


public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.insertVertex(0);
		graph.insertVertex(1);
		graph.insertVertex(2);
		graph.insertVertex(3);
		graph.insertVertex(4);
		graph.insertVertex(5);
		graph.insertUndirectedEdge(0, 1);
		graph.insertUndirectedEdge(2, 1);
		graph.insertUndirectedEdge(2, 3);
		graph.insertUndirectedEdge(0, 3);
		graph.insertUndirectedEdge(3, 4);
		graph.insertUndirectedEdge(4, 5);
		graph.insertUndirectedEdge(1, 5);
		graph.printGraphArray();
		graph.BFS(0);
		graph.printShortestPath(0, 5);
	}
}

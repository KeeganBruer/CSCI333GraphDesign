
public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.insertVertex(0);
		graph.insertVertex(1);
		graph.insertVertex(2);
		graph.insertVertex(3);
		graph.insertUndirectedEdge(0, 1);
		graph.insertUndirectedEdge(2, 1);
		graph.insertUndirectedEdge(2, 3);
		graph.insertUndirectedEdge(0, 3);
		graph.deleteVertex(2);
		graph.printGraphArray();
	}
}

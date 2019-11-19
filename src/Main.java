
public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.insertVertex(0);
		graph.insertVertex(1);
		graph.insertVertex(2);
		graph.insertVertex(3);
		graph.insertVertex(4);
		graph.insertVertex(5);
		graph.insertUndirectedWeightedEdge(0, 1, 3);
		graph.insertUndirectedWeightedEdge(2, 1, 0);
		graph.insertUndirectedWeightedEdge(2, 3, 4);
		graph.insertUndirectedWeightedEdge(0, 3, 9);
		graph.insertUndirectedWeightedEdge(3, 4, 3);
		graph.insertUndirectedWeightedEdge(4, 5, 7);
		graph.insertUndirectedWeightedEdge(1, 5, 2);
		graph.printGraphArray();
		graph.MST(0);
		graph.printPath(0, 5);
	}
}

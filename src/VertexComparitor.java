import java.util.Comparator;

public class VertexComparitor  implements Comparator<Vertex> {
	public int compare(Vertex one, Vertex two) 
	{
		int o = one.getKey();
		int t = two.getKey();
		System.out.println(o + " " + t);
		return o-t;
	}
}

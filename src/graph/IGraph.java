package graph;
import java.util.Set;
public interface IGraph<T extends Comparable<T>> {
	public void insertNode(Node<T> u);
	public void deleteNode(Node<T> u);
	public void insertEdge(Node<T> u, Node<T> v, Integer peso);
	public void deleteEdge(Edge<T> uv);
	public Set<Node<T>> adj(Node<T> u);
	public Set<Node<T>> V();
	// utility: stampa nodi e liste di adiacenza
	public void print();
}

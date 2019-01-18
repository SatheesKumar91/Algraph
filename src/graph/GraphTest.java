package graph;
public class GraphTest {

	public static void main(String[] args) {
		Graph<String> g1 = new Graph<String>();
		
		Node<String> a = new Node<String>("A", 1., 2.);
		Node<String> b = new Node<String>("B", 3., 4.);
		Node<String> c = new Node<String>("C", 5., 6.);
		Node<String> d = new Node<String>("D", 7., 8.);
		Node<String> e = new Node<String>("E", 9., 10.);
		Node<String> f = new Node<String>("F", 11., 12.);
		Node<String> g = new Node<String>("G", 13., 14.);
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		g1.insertNode(d);
		g1.insertNode(e);
		g1.insertNode(f);
		g1.insertNode(g);
		
		g1.insertEdge(a, b, 1);
		g1.insertEdge(a, c, 2);
		g1.insertEdge(b, e, 3);
		g1.insertEdge(b, g, 4);
		g1.insertEdge(d, g, 5);
		g1.insertEdge(e, d, 6);
		g1.insertEdge(g, c, 7);
		g1.insertEdge(c, f, 8);
		
		//arco che rompe il vincolo 2-colorabile
		g1.insertEdge(b, c, 9);
		
		g1.print();
	}

}


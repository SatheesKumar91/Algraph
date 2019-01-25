package graph;

import java.util.Set;
import java.util.TreeSet;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Graph<T extends Comparable<T>> implements IGraph<T> {

	// campi

	private TreeSet<Node<T>> nodi;
	private TreeSet<Edge<T>> archi;
	private Integer numNodi;

	// costruttore

	public Graph() {
		this.nodi = new TreeSet<Node<T>>();
		this.archi = new TreeSet<Edge<T>>();
		this.numNodi = 0;
	}
	//getters
	
	public Integer getNumNodi() {
		return this.numNodi;
	}

	// metodi

	@Override
	public void insertNode(Node<T> u) {
		if(!this.nodi.contains(u)) {
			this.nodi.add(u);
			this.numNodi++;
			u.setID(numNodi);
		}
	}

	@Override
	public void deleteNode(Node<T> u) {
		if(this.nodi.contains(u)) {
			for(Edge<T> uv: this.archi)
				if(uv.connectEdgeNode(u))	//se nell'arco uv connette il nodo v a un altro nodo
					this.deleteEdge(uv);	//allora elimina l'arco uv
			this.nodi.remove(u);
			this.numNodi--;
		}
			
	}

	@Override
	public void insertEdge(Node<T> u, Node<T> v, Integer peso) {
		if(this.nodi.contains(u) && this.nodi.contains(v)) {
			Edge<T> uv = new Edge<T>(u, v, peso);
			this.archi.add(uv);
		}
	}

	@Override
	public void deleteEdge(Edge<T> uv) {
		this.archi.remove(uv);
	}

	@Override
	public TreeSet<Node<T>> adj(Node<T> u) {//ritorna insieme di adiacenza del nodo u
		//ritorna null se U non esiste
		TreeSet<Node<T>> adiacenti = new TreeSet<Node<T>>();
		if(this.nodi.contains(u))
			for(Edge<T> uv: this.archi)
				if(uv.connectEdgeNode(u)) 
					adiacenti.add(uv.otherNode(u));
		else
			adiacenti = null;
		return adiacenti;
	}

	@Override
	public Set<Node<T>> V() {
		return this.nodi;
	}

	public Set<Edge<T>> E() {
		return this.archi;
	}

	@Override
	public void print() {
		System.out.println(" G = V unione E");
		System.out.print(" V = { ");
		for (Node<T> node : nodi) {
			System.out.print(node + ", ");
		}
		System.out.print(" }\n E = { ");
		for (Edge<T> edge : archi) {
			System.out.print(edge + ", ");
		}
		System.out.println(" } ");
	}

	public Pane draw(Double raggio, Double height, Double width) {
		Graphica<T> dg = new Graphica<T>();
		dg.calcCoordNode(this, height/2, width/2);
		Pane console = new Pane();
		console = dg.disegna(this, raggio, Color.WHITE, Color.BLACK);
		return console;
	}
}

package graph;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{

//controllare che sia uguale anche in ./Graphica.java
public final Double DEFAULT = -100.;

	//campi

	private T name;
	private Integer id;	//se id = 0 il nodo non è stato ancora aggiunto al grafo
	private Double x;
	private Double y;

	// costruttori

	public Node(T name){
		this.name = name;
		//controllare che sia uguale anche in ./Graphica.java
		this.x = -100.;
		this.y = -100.;
		this.id = 0;
	}

	public Node(T name, Double x, Double y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.id = 0;
	}

	// setters

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void setXsetY(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	// getters

	public T getElement(){
		return this.name;
	}

	public Double getX() {
		return this.x;
	}


	public Double getY() {
		return this.y;
	}

	public Integer getID() {
		return this.id;
	}

	// altro

	@Override
	public int compareTo(Node<T> o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return ( this.name.toString() + " (" + this.x + ", " + this.y + ")" );
	}
}

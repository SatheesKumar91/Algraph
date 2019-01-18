package graph;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{

	//campi

	private T element;
	private Double x;
	private Double y;

	// costruttori

	public Node(T e){
		this.element = e;
	}

	public Node(T e, Double x, Double y) {
		this.element = e;
		this.x = x;
		this.y = y;
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

	// getters

	public T getElement(){
		return this.element;
	}

	public Double getX() {
		return x;
	}


	public Double getY() {
		return y;
	}

	// altro

	@Override
	public int compareTo(Node<T> o) {
		return this.element.compareTo(o.element);
	}

	@Override
	public String toString() {
		return ( this.element.toString() + " (" + this.x + ", " + this.y + ")" );
	}
}

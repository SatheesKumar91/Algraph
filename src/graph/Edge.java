package graph;

public class Edge<T extends Comparable<T>> implements Comparable<Edge<T>> {

	// campi

	private Integer peso;
	private Node<T> u;
	private Node<T> v;

	// costruttori

	public Edge(Node<T> u, Node<T> v, Integer peso) {
		this.peso = peso;
		this.u = u;
		this.v = v;
	}

	public Edge(Node<T> u, Node<T> v, Integer peso, Double x1, Double y1, Double x2, Double y2) {
		this.u = u;
		this.v = v;
		this.u.setXsetY(x1, y1);
		this.v.setXsetY(x2, y2);
	}

	// setters

	public void setWeight(Integer peso) {
		this.peso = peso;
	}

	public void setNodeU(Node<T> u) {
		this.u = u;
	}

	public void setNodeV(Node<T> v) {
		this.v = v;
	}

	public void setUX(Double x1) {
		this.u.setX(x1);
	}

	public void setUY(Double y1) {
		this.u.setY(y1);
	}

	public void setVX(Double x2) {
		this.v.setX(x2);
	}

	public void setVY(Double y2) {
		this.v.setY(y2);
	}

	public void setNodeUXY(Double x1, Double y1) {
		this.u.setXsetY(x1, y1);
	}

	public void setNodeVXY(Double x2, Double y2) {
		this.v.setXsetY(x2, y2);
	}

	public void setAllXY(Double x1, Double y1, Double x2, Double y2) {
		this.u.setXsetY(x1, y1);
		this.v.setXsetY(x2, y2);
	}
	
	// getters

	public Integer getWeight() {
		return peso;
	}

	public Node<T> getNodeU() {
		return u;
	}

	public Node<T> getNodeV() {
		return v;
	}

	public Double getUX() {
		return this.u.getX();
	}

	public Double getUY() {
		return this.u.getY();
	}

	public Double getVX() {
		return this.v.getX();
	}

	public Double getVY() {
		return this.v.getY();
	}

	// altri

	public Boolean connectEdgeNode(Node<T> u) {
		//restituisce true se questo arco collega il nodo u a un altro nodo
		return (this.v.equals(u) || this.u.equals(u));
	}

	public Node<T> otherNode(Node<T> u) {
		//restitusce l'altro nodo nell'arco uv
		if(this.v.equals(u))
			return this.u;
		else if(this.u.equals(u))
			return this.v;
		else
			return null;
	}
	
	@Override
	public String toString(){
		return ( "[" + this.u + " <-" + this.peso + "-> " + this.v + "]" );
	}
	
	@Override
	public int compareTo(Edge<T> o) {
		if(this.peso.equals(o.peso)) {
			if(this.u.equals(o.u)) {
				if(this.v.equals(o.v)) {	//o = uv
					 return 0;
				} else
					return this.v.compareTo(o.v);
			} else if(this.u.equals(o.v)) {
				if(this.v.equals(o.u)) {	//o = vu
					 return 0;
				} else
					return this.v.compareTo(o.u);
			} else 
				return this.u.compareTo(o.u);
		} else
			return this.peso.compareTo(o.peso);
	}
}

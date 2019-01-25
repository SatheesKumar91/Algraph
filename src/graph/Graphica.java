package graph;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//per rendere il testo centrato e il cerchio nella giusta posizione
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Translate; 


public class Graphica<T extends Comparable<T>> {
	//funzione che calcola le coordinate dei nodi se non sono state già settate o modificate
	public void calcCoordNode(Graph<T> graph, Double centerX, Double centerY) {
		Double n = Math.PI *2/ graph.getNumNodi();
		Double raggio = (Math.min(centerX, centerY))*2/3;
		//System.out.print("centerX = "+centerX+", centerY = "+centerY+", raggio = "+raggio);
		for (Node<T> node : graph.V()) {
			//se le coordinate sono quelle di Default
			if((node.getX() == 0.) && (node.getY() == 0.)) {
				//calcola nuove coordinate per il nodo
				node.setX( centerX + raggio * Math.cos( n * node.getID() ) );
				node.setY( centerY - raggio * Math.sin( n * node.getID() ) );
				//Math.cos( Math.PI/3 ), Math.sin( Math.PI/3 )
			}
			/*			
			System.out.print(node.getID() + "\t");
			System.out.print(node.getElement() + " = (\t");
			System.out.print(node.getX() + ",\t");
			System.out.println(node.getY() + ")");
			*/
		}
	}
	// funzione richiamata all'interno di graph
	public Pane disegna(Graph<T> graph, Double raggio, Color c1, Color c2) {
		Double font = raggio*3/2;	//se il font è troppo grande rispetto al raggio abbiamo un problema con il centro dello stackpane che non coincide con il centro del cerchio
		Pane console = new Pane();
		for (Edge<T> edge : graph.E()) {
			//per ogni arco inserisci una linea e un testo per i pesi
			Line line = new Line(edge.getUX(), edge.getUY(), edge.getVX(), edge.getVY());
			Text textEdge = new Text(""+edge.getWeight());
			textEdge.setX((edge.getNodeU().getX()+edge.getNodeV().getX())/2);
			textEdge.setY((edge.getNodeU().getY()+edge.getNodeV().getY())/2);
			textEdge.setFont(new Font(font/2));
			console.getChildren().addAll(line, textEdge);
		}
		
		for (Node<T> node : graph.V()) {
			//creo uno stackpane per il centro del testo
			StackPane stackPane = new StackPane();
			//per ogni nodo inserisci un cerchio ...
			Circle circle = new Circle();
			circle.setRadius(raggio);
			circle.setFill(c1);
			circle.setStroke(c2);
			circle.setStrokeWidth(1.);
			// ... e un testo per i nomi dei nodi
			Text textNode = new Text(""+node.getElement());
			//textNode.setX(node.getX());
			//textNode.setY(node.getY());
			textNode.setFont(new Font(font));
			//gestisco lo stackpane
			stackPane.getChildren().addAll(circle, textNode);
			//traslazione (ricordiamoci il centro della traslazione è il centro dello stackpane che dovrebbe essere anche il centro del raggio)
			stackPane.setTranslateX(node.getX() - raggio);
			stackPane.setTranslateY(node.getY() - raggio);
			//aggiungo alla console che verrà restituita
		   	console.getChildren().addAll(stackPane);
		}
		return console;
	}
}

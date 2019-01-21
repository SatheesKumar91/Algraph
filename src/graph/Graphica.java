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
	// funzione richiamata all'interno di graph
	public Pane disegna(Graph<T> graph, Double raggio, Color c1, Color c2) {
		Double font = raggio*2;
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
			//traslazione
			stackPane.setTranslateX(node.getX() - raggio);
			stackPane.setTranslateY(node.getY() - raggio);
			//aggiungo un cerchio al centro per fare il test
			Circle centroTest = new Circle(node.getX(), node.getY(), 5.);
			centroTest.setFill(Color.BLUE);
			//aggiungo alla console che verrà restituita
		   	console.getChildren().addAll(stackPane);
			//aggiungo il cerchio di test
			console.getChildren().addAll(centroTest);
		}
		return console;
	}
}

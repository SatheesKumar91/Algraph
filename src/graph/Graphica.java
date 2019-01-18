package graph;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Graphica<T extends Comparable<T>> {
	
	public Pane disegna(Graph<T> graph, Double raggio, Paint c1, Paint c2) {
		Double font = raggio*2;
		Pane console = new Pane();
		for (Edge<T> edge : graph.E()) {
			Line lineToAdd = new Line(edge.getUX(), edge.getUY(), edge.getVX(), edge.getVY());
			Text textEdge = new Text(""+edge.getWeight());
			textEdge.setX((edge.getNodeU().getX()+edge.getNodeV().getX())/2);
			textEdge.setY((edge.getNodeU().getY()+edge.getNodeV().getY())/2);
			textEdge.setFont(new Font(font/2));
			console.getChildren().addAll(lineToAdd, textEdge);
		}
		
		for (Node<T> node : graph.V()) {
			Circle circleToAdd = new Circle(node.getX(), node.getY(), raggio);
			circleToAdd.setFill(c1);
			circleToAdd.setStroke(c2);
			circleToAdd.setStrokeWidth(1.);
			
			Text textNode = new Text(""+node.getElement());
			textNode.setX(node.getX()); //- raggio * a/b
			textNode.setY(node.getY()); //+ raggio * c/d
			textNode.setFont(new Font(font));
			//textNode.setStyle("-fx-alignment: CENTER-LEFT;");
			
		   	console.getChildren().addAll(circleToAdd, textNode);
		}
		return console;
	}

}

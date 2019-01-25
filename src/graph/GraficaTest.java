package graph;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GraficaTest extends Application {
	
	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Graph<String> g1 = new Graph<String>();
		
		Node<String> a = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		Node<String> c = new Node<String>("C");
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		
		g1.insertEdge(a, b, 1);
		g1.insertEdge(a, c, 2);
		g1.insertEdge(b, c, 3);
		
		Double Height = 500.;
		Double Width = 500.;
		Pane console = new Pane();
		console = g1.draw(50., Height, Width);
		Scene scene = new Scene(console);
		primaryStage.setTitle("Welcome to FX!");
		primaryStage.setHeight(Height);
		primaryStage.setWidth(Width);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

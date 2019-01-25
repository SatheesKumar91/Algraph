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
		
		Node<String> a = new Node<String>("A", 100., 100.);
		Node<String> b = new Node<String>("B");
		Node<String> c = new Node<String>("C");
		Node<String> d = new Node<String>("D");
		Node<String> e = new Node<String>("E");
		Node<String> f = new Node<String>("F");
		Node<String> g = new Node<String>("G");
		Node<String> h = new Node<String>("H");
		
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		g1.insertNode(d);
		g1.insertNode(e);
		g1.insertNode(f);
		g1.insertNode(g);
		g1.insertNode(h);
		
		g1.insertEdge(a, b, 1);
		g1.insertEdge(a, c, 2);
		g1.insertEdge(b, c, 3);
		
		Double Width = 1000.;
		Double Height = 700.;
		Pane console = new Pane();
		console = g1.draw(40., Width, Height);
		Scene scene = new Scene(console);
		primaryStage.setTitle("Welcome to FX!");
		primaryStage.setHeight(Height);
		primaryStage.setWidth(Width);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

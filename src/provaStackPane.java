import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//per rendere il testo centrato e il cerchio nella giusta posizione
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Translate; 

//questo file serve per testare piccole parti di codice prima di inserirle nel progetto
//di conseguenza se viene eliminato non è una grande perdita, ma per fare altri test va riscritto

public class provaStackPane extends Application {

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane console = new Pane();
		//creo uno stackpane per il centro del testo
		StackPane stackPane = new StackPane();
		Double raggio = 80.;
		Double font = raggio*2/3;
		Double x = 300. - raggio;
		Double y = 200. - raggio;
		//per ogni nodo inserisci un cerchio ...
		Circle circle = new Circle();
		circle.setRadius(raggio);
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(1.);
		// ... e un testo per i nomi dei nodi
		Text textNode = new Text("Nodo");
		textNode.setFont(new Font(font));
		//gestisco lo stackpane
		stackPane.getChildren().addAll(circle, textNode);
		//traslazione
		stackPane.setTranslateX(x);
		stackPane.setTranslateY(y);
		System.out.println("x = "+x+" Translated x = "+stackPane.getTranslateX());
		System.out.println("y = "+y+" Translated y = "+stackPane.getTranslateY());
		//aggiungo alla console che verrà restituita
	   	console.getChildren().addAll(stackPane);
		Scene scene = new Scene(console);
		primaryStage.setTitle("Welcome to FX!");
		primaryStage.setHeight(400.);
		primaryStage.setWidth(400.);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

//questo file serve per testare piccole parti di codice prima di inserirle nel progetto
//di conseguenza se viene eliminato non è una grande perdita, ma per fare altri test va riscritto

public class prova extends Application {

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane console = new Pane();
		Scene scene = new Scene(console);
		primaryStage.setTitle("Welcome to FX!");
		primaryStage.setHeight(Height);
		primaryStage.setWidth(Width);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

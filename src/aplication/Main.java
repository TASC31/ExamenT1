package aplication;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

private AnchorPane rootLayout;

public Stage primaryStage;


@Override
	public void start(Stage primaryStage) {
		try {
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My Git Hub Profile");
			this.primaryStage.setX(500);
			this.primaryStage.setY(400);

			initRootLayout();
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
		}


	public void initRootLayout() {
		try {
// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

	Scene scene = new Scene(rootLayout, 500,400);
	scene.getStylesheets().add(
			getClass().getResource("application.css").toExternalForm());
	scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
           Font.loadFont(getClass().getResourceAsStream("assets/PoiretOne-Regular.ttf"), 20);
           
           primaryStage.setWidth(500);
           primaryStage.setHeight(400);
           
           primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

/**
* @param args launching 
*/

	public static void main(String[] args) {
		launch(args);
}
}
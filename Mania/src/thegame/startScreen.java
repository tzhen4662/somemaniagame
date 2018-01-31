package thegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class startScreen extends Application
{	
		public static void main(String[] args){
			Application.launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception 
		{
			Button button = new Button();
			button.setText("'Start'");
			Button button2 = new Button();
			button2.setText("'Highscores'");
			Button button3 = new Button();
			button3.setText("'Controls'");
			
			button.setMaxSize(500, 70);
			button2.setMaxSize(500, 70);
			button3.setMaxSize(500, 70);
			
			Pane root = new Pane();
		    root.getChildren().add(button);
		    root.getChildren().add(button2);
		    root.getChildren().add(button3);
			button.setLayoutX(450);
			button.setLayoutY(400);
			button2.setLayoutX(450);
			button2.setLayoutY(450);
			button3.setLayoutX(450);
			button3.setLayoutY(500);
		    Scene scene = new Scene(root, 1000, 1000);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		    
		    /*scene.getStylesheets().add("CSS");
		    stage.show();*/
		}
}

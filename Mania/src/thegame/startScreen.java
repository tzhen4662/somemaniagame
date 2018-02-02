package thegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class startScreen extends Application
{	
		public static void main(String[] args){
			Application.launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception
		{
			Label Title = new Label();
			Title.setText("Game Title");
			Title.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em; -fx-text-fill: #0000CC; -fx-border-width: 2; -fx-border-color: #99CCFF");
			Button button = new Button();
			button.setText("'Start'");
			button.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 1.5em");
			Button button2 = new Button();
			button2.setText("'Highscores'");
			button2.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEFA; -fx-font-size: 1.5em");
			Button button3 = new Button();
			button3.setText("'Controls'");
			button3.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEEB; -fx-font-size: 1.5em");
			
			/*button.setMaxSize(500, 70);
			button2.setMaxSize(500, 70);
			button3.setMaxSize(500, 70);*/
			
			button.setOnAction(value ->  {
	        	System.out.println("Starting ");
			});
			button2.setOnAction(value ->  {
	        	System.out.println("No Highscores ");
			});
			button3.setOnAction(value ->  {
	        	System.out.println("Controls ");
			});
	       
			Pane root = new Pane();
			root.getChildren().add(Title);
		    root.getChildren().add(button);
		    root.getChildren().add(button2);
		    root.getChildren().add(button3);
		    Title.setLayoutX(200);
			Title.setLayoutY(110);
			button.setLayoutX(250);
			button.setLayoutY(200);
			button2.setLayoutX(225);
			button2.setLayoutY(250);
			button3.setLayoutX(235);
			button3.setLayoutY(300);
		    Scene scene = new Scene(root, 525, 550);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		    
		    /*scene.getStylesheets().add("CSS");
		    stage.show();*/
		}
}

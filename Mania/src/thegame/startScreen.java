package thegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
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
			Title.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em;	-fx-padding: 8 8 8 8; -fx-text-fill: #0000CC; -fx-border-width: 2; -fx-border-radius: 30; -fx-background-color: transparent; -fx-border-color: #99CCFF");
			Button button = new Button();
			button.setText("Start");
			button.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 20px; -fx-text-fill: white;");
			Button button2 = new Button();
			button2.setText("Highscores");
			button2.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEEB; -fx-font-size: 20px; -fx-text-fill: white;");
			Button button3 = new Button();
			button3.setText("Controls");
			button3.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEFA; -fx-font-size: 20px; -fx-text-fill: white;");
			
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
		    Title.setLayoutX(210);
			Title.setLayoutY(140);
			button.setLayoutX(270);
			button.setLayoutY(250);
			button2.setLayoutX(240);
			button2.setLayoutY(310);
			button3.setLayoutX(255);
			button3.setLayoutY(370);
		    Scene scene = new Scene(root, 600, 600);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		    
		    /*scene.getStylesheets().add("CSS");
		    stage.show();*/
		}
}

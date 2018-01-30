package thegame;

import javafx.application.Application;

import java.awt.Button;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;

public class startScreen 
{
	public class GameCode extends Application
	{
		Label lb_text;
		Button btn_click;
		
		public static void main(String[] args){
			launch(args);
		}
		
		@Override
		public void start(Stage primaryStage) throws Exception 
		{
			lb_text = new Label("Start");
			btn_click = new Button("SButton");
			
			btn_click.setOnAction(new EventHandler<ActionEvent>{}
			{
				@Override
				public void handle(ActionEvent arg0) 
				{
					lb_text.setText("Some Text");
				}
			};
			/*Text Start = new Text();
			Button Start = new Button("Start");
	    
			Text HScore = new Text();
			Button HScore = new Button("HScore");
	    
	    
			Text Controls = new Text();
			Button Controls = new Button("Controls");*/
		}
	    VBox root = new VBox();
	    root.getChildren().addAll(lb_text, btn_click);
	    
	    Scene scene = new Scene(root, 500, 500);
	    stage.setScene(scene);
	    
	    scene.getStylesheets().add("CSS");
	    
	    stage.show();
	 }
}

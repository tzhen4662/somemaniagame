package thegame;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class fallingNotes extends Application{

	Text status = new Text();
	
	@Override
	public void start(Stage stage) throws Exception {
		Circle circle = new Circle();
		circle.setCenterX(100.0);
		circle.setCenterY(100.0);
		circle.setRadius(50.0);
		
		Line line = new Line();
		line.setStartX(0.0);
		line.setStartY(-400.0);
		line.setEndX(0.0);
		line.setEndY(600.0);
		
		PathTransition transition = new PathTransition();
		transition.setNode(circle);
		transition.setDuration(Duration.seconds(6));
		transition.setPath(line);
		transition.setCycleCount(transition.INDEFINITE);
		transition.play();
		
		StackPane root = new StackPane();
		root.getChildren().add(status);
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
	}
	
	private void displayPosition(MouseEvent event)
	{
		status.setText("X = " + event.getX() + "    Y = " + event.getY());
	}
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

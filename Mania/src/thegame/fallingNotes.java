package thegame;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class fallingNotes extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Circle circle = new Circle();
		circle.setCenterX(100.0);
		circle.setCenterY(100.0);
		circle.setRadius(50.0);
		
		PathTransition transition = new PathTransition();
		transition.setNode(circle);
		transition.setDuration(Duration.seconds(6));
		transition.setPath(value);
		
		StackPane root = new StackPane();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
        Application.launch(args);    
    }
}

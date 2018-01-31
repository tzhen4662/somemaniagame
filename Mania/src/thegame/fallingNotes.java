package thegame;

import java.util.Random;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class fallingNotes extends Application{

	Random r = new Random();
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Circle circle1 = new Circle();
		circle1.setCenterX(100.0);
		circle1.setCenterY(100.0);
		circle1.setRadius(50.0);
		
		Circle circle2 = new Circle();
		circle2.setCenterX(100.0);
		circle2.setCenterY(100.0);
		circle2.setRadius(50.0);
		
		Circle circle3 = new Circle();
		circle3.setCenterX(100.0);
		circle3.setCenterY(100.0);
		circle3.setRadius(50.0);
		
		Circle circle4 = new Circle();
		circle4.setCenterX(100.0);
		circle4.setCenterY(100.0);
		circle4.setRadius(50.0);
		
		Circle circle5 = new Circle();
		circle5.setCenterX(100.0);
		circle5.setCenterY(100.0);
		circle5.setRadius(50.0);
		
		Line line1 = new Line();
		line1.setStartX(-100.0);
		line1.setStartY(-400.0);
		line1.setEndX(-100.0);
		line1.setEndY(600.0);
		
		Line line2 = new Line();
		line2.setStartX(0.0);
		line2.setStartY(-400.0);
		line2.setEndX(0.0);
		line2.setEndY(600.0);
		
		Line line3 = new Line();
		line3.setStartX(100.0);
		line3.setStartY(-400.0);
		line3.setEndX(100.0);
		line3.setEndY(600.0);
		
		Line line4 = new Line();
		line4.setStartX(200.0);
		line4.setStartY(-400.0);
		line4.setEndX(200.0);
		line4.setEndY(600.0);
		
		Line line5 = new Line();
		line5.setStartX(300.0);
		line5.setStartY(-400.0);
		line5.setEndX(300.0);
		line5.setEndY(600.0);
		
		for (int i = 0; i < 10; i++)
		{
			double n = r.nextDouble() + 2;
			double n2 = r.nextDouble() + 2;
			double n3 = r.nextDouble() + 2;
			double n4 = r.nextDouble() + 2;
			double n5 = r.nextDouble() + 2;
			
			PathTransition transition1 = new PathTransition();
			transition1.setNode(circle1);
			transition1.setDuration(Duration.seconds(n));
			transition1.setPath(line1);
			transition1.setCycleCount(transition1.INDEFINITE ); //transition1.INDEFINITE 
			transition1.play();
		
			PathTransition transition2 = new PathTransition();
			transition2.setNode(circle2);
			transition2.setDuration(Duration.seconds(n2));
			transition2.setPath(line2);
			transition2.setCycleCount(transition1.INDEFINITE );
			transition2.play();
		
			PathTransition transition3 = new PathTransition();
			transition3.setNode(circle3);
			transition3.setDuration(Duration.seconds(n3));
			transition3.setPath(line3);
			transition3.setCycleCount(transition1.INDEFINITE );
			transition3.play();
		
			PathTransition transition4 = new PathTransition();
			transition4.setNode(circle4);
			transition4.setDuration(Duration.seconds(n4));
			transition4.setPath(line4);
			transition4.setCycleCount(transition1.INDEFINITE );
			transition4.play();
		
			PathTransition transition5 = new PathTransition();
			transition5.setNode(circle5);
			transition5.setDuration(Duration.seconds(n5));
			transition5.setPath(line5);
			transition5.setCycleCount(transition1.INDEFINITE );
			transition5.play();
		}
		
		StackPane root = new StackPane();
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(circle3);
        root.getChildren().add(circle4);
        root.getChildren().add(circle5);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
	}
	
	
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

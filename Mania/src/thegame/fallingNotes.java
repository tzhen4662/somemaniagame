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
		
		double n = r.nextDouble() + 2;
			
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
			
		PathTransition transition1 = new PathTransition();
		transition1.setNode(circle1);
		transition1.setDuration(Duration.seconds(n));
		transition1.setPath(line1);
		transition1.setCycleCount(1); //transition1.INDEFINITE 
		transition1.play();
		
		PathTransition transition2 = new PathTransition();
		transition2.setNode(circle2);
		transition2.setDuration(Duration.seconds(n));
		transition2.setPath(line2);
		transition2.setCycleCount(1);
		transition2.play();
		
		PathTransition transition3 = new PathTransition();
		transition3.setNode(circle3);
		transition3.setDuration(Duration.seconds(n));
		transition3.setPath(line3);
		transition3.setCycleCount(1);
		transition3.play();
		
		PathTransition transition4 = new PathTransition();
		transition4.setNode(circle4);
		transition4.setDuration(Duration.seconds(n));
		transition4.setPath(line4);
		transition4.setCycleCount(1);
		transition4.play();
		
		PathTransition transition5 = new PathTransition();
		transition5.setNode(circle5);
		transition5.setDuration(Duration.seconds(n));
		transition5.setPath(line5);
		transition5.setCycleCount(1);
		transition5.play();
		
		//These are the clicker circles at the bottom
		Circle clickCircle1 = new Circle();
		clickCircle1.setCenterX(0.0);
		clickCircle1.setCenterY(600.0);
		clickCircle1.setRadius(50.0);
		
		Circle clickCircle2 = new Circle();
		clickCircle2.setCenterX(100.0);
		clickCircle2.setCenterY(600.0);
		clickCircle2.setRadius(50.0);
		
		Circle clickCircle3 = new Circle();
		clickCircle3.setCenterX(200.0);
		clickCircle3.setCenterY(600.0);
		clickCircle3.setRadius(50.0);

		
		Circle clickCircle4 = new Circle();
		clickCircle4.setCenterX(300.0);
		clickCircle4.setCenterY(600.0);
		clickCircle4.setRadius(50.0);
		
		Circle clickCircle5 = new Circle();
		clickCircle5.setCenterX(400.0);
		clickCircle5.setCenterY(600.0);
		clickCircle5.setRadius(50.0);
		
		StackPane root = new StackPane();
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(circle3);
        root.getChildren().add(circle4);
        root.getChildren().add(circle5);
        root.getChildren().add(clickCircle1);
        //root.getChildren().add(clickCircle2);
       // root.getChildren().add(clickCircle3);
        //root.getChildren().add(clickCircle4);
       // root.getChildren().add(clickCircle5);
        Scene scene = new Scene(root, 1000, 1000);
        stage.setScene(scene);
        stage.show();
	}
	
	
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

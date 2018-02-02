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
	Circle circle1 = new Circle();
	Circle circle2 = new Circle();
	Circle circle3 = new Circle();
	Circle circle4 = new Circle();
	Circle circle5 = new Circle();
	Circle clickCircle1 = new Circle();
	Circle clickCircle2 = new Circle();
	Circle clickCircle3 = new Circle();
	Circle clickCircle4 = new Circle();
	Circle clickCircle5 = new Circle();
	Line line1 = new Line();
	Line line2 = new Line();
	Line line3 = new Line();
	Line line4 = new Line();
	Line line5 = new Line();
	PathTransition transition1 = new PathTransition();
	PathTransition transition2 = new PathTransition();
	PathTransition transition3 = new PathTransition();
	PathTransition transition4 = new PathTransition();
	PathTransition transition5 = new PathTransition();
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		double n1 = r.nextDouble() + 2;
		double n2 = r.nextDouble() + 2;
		double n3 = r.nextDouble() + 2;
		double n4 = r.nextDouble() + 2;
		double n5 = r.nextDouble() + 2;
			
		circle1.setCenterX(100.0);
		circle1.setCenterY(100.0);
		circle1.setRadius(50.0);
		
		circle2.setCenterX(100.0);
		circle2.setCenterY(100.0);
		circle2.setRadius(50.0);
		
		circle3.setCenterX(100.0);
		circle3.setCenterY(100.0);
		circle3.setRadius(50.0);
		
		circle4.setCenterX(100.0);
		circle4.setCenterY(100.0);
		circle4.setRadius(50.0);
		
		circle5.setCenterX(100.0);
		circle5.setCenterY(100.0);
		circle5.setRadius(50.0);
		
		line1.setStartX(-100.0);
		line1.setStartY(-400.0);
		line1.setEndX(-100.0);
		line1.setEndY(600.0);
		
		line2.setStartX(0.0);
		line2.setStartY(-400.0);
		line2.setEndX(0.0);
		line2.setEndY(600.0);
		
		line3.setStartX(100.0);
		line3.setStartY(-400.0);
		line3.setEndX(100.0);
		line3.setEndY(600.0);
		
		line4.setStartX(200.0);
		line4.setStartY(-400.0);
		line4.setEndX(200.0);
		line4.setEndY(600.0);
		
		line5.setStartX(300.0);
		line5.setStartY(-400.0);
		line5.setEndX(300.0);
		line5.setEndY(600.0);
			
		transition1.setNode(circle1);
		transition1.setDuration(Duration.seconds(n1));
		transition1.setPath(line1);
		transition1.setCycleCount(transition1.INDEFINITE); //transition1.INDEFINITE 
		transition1.play();
		
		transition2.setNode(circle2);
		transition2.setDuration(Duration.seconds(n2));
		transition2.setPath(line2);
		transition2.setCycleCount(transition1.INDEFINITE);
		transition2.play();
		
		transition3.setNode(circle3);
		transition3.setDuration(Duration.seconds(n3));
		transition3.setPath(line3);
		transition3.setCycleCount(transition1.INDEFINITE);
		transition3.play();
		
		transition4.setNode(circle4);
		transition4.setDuration(Duration.seconds(n4));
		transition4.setPath(line4);
		transition4.setCycleCount(transition1.INDEFINITE);
		transition4.play();
		
		transition5.setNode(circle5);
		transition5.setDuration(Duration.seconds(n5));
		transition5.setPath(line5);
		transition5.setCycleCount(transition1.INDEFINITE);
		transition5.play();
		
		//These are the clicker circles at the bottom
		clickCircle1.setCenterX(5000000000000.0);
		clickCircle1.setCenterY(5000000000000.0);
		clickCircle1.setRadius(50.0);
		
		clickCircle2.setCenterX(100.0);
		clickCircle2.setCenterY(600.0);
		clickCircle2.setRadius(50.0);
		
		clickCircle3.setCenterX(200.0);
		clickCircle3.setCenterY(600.0);
		clickCircle3.setRadius(50.0);

		
		clickCircle4.setCenterX(300.0);
		clickCircle4.setCenterY(600.0);
		clickCircle4.setRadius(50.0);
		
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
        //root.getChildren().add(clickCircle3);
        //root.getChildren().add(clickCircle4);
        //root.getChildren().add(clickCircle5);
        Scene scene = new Scene(root, 1000, 1000);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
	}
	
	/*public static void keyStroke()
	{
		if 
	}*/
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

package thegame;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class fallingNotes extends Application{

	private Random r = new Random();
	double rand = Math.random() + 1;
	
	private Circle circle1 = new Circle(100, 0, 20);
	private Circle circle2 = new Circle(200, 0, 20);
	private Circle circle3 = new Circle(300, 0, 20);
	private Circle circle4 = new Circle(400, 0, 20);
	private Circle circle5 = new Circle(500, 0, 20);
	private Circle clickCircle1 = new Circle(100, 590, 20);
	private Circle clickCircle2 = new Circle(200, 590, 20);
	private Circle clickCircle3 = new Circle(300, 590, 20);
	private Circle clickCircle4 = new Circle(400, 590, 20);
	private Circle clickCircle5 = new Circle(500, 590, 20);
	
	TranslateTransition transition1 = new TranslateTransition(Duration.seconds(2), circle1);
	TranslateTransition transition2 = new TranslateTransition(Duration.seconds(2), circle2);
	TranslateTransition transition3 = new TranslateTransition(Duration.seconds(2), circle3);
	TranslateTransition transition4 = new TranslateTransition(Duration.seconds(2), circle4);
	TranslateTransition transition5 = new TranslateTransition(Duration.seconds(2), circle5);
	
	PauseTransition pt1 = new PauseTransition(Duration.seconds(rand1));
	
	SequentialTransition seq1 = new SequentialTransition (circle1, pt1, transition1);
	SequentialTransition seq2 = new SequentialTransition (circle2, pt2, transition2);
	SequentialTransition seq3 = new SequentialTransition (circle3, pt3, transition3);
	SequentialTransition seq4 = new SequentialTransition (circle4, pt4, transition4);
	SequentialTransition seq5 = new SequentialTransition (circle5, pt5, transition5);
	
	private int score = 0;
	Text scenetitle = new Text("Score");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
	    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    
		circle1.setRadius(20.0);
		circle2.setRadius(20.0);
		circle3.setRadius(20.0);
		circle4.setRadius(20.0);
		circle5.setRadius(20.0);
		
		transition1.setByY(590);
		transition1.setCycleCount(2);
		
		transition2.setByY(590);
		transition2.setCycleCount(2);

		transition3.setByY(590);
		transition3.setCycleCount(2);

		transition4.setByY(590);
		transition4.setCycleCount(2);

		transition5.setByY(590);
		transition5.setCycleCount(2);
		
		seq1.play();
		seq2.play();
		seq3.play();
		seq4.play();
		seq5.play();
		
		scenetitle.setLayoutX(300);
		scenetitle.setLayoutY(300);
		
		Pane root = new Pane();
		root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
		root.getChildren().add(scenetitle);
        root.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
        Scene scene = new Scene(root, 600, 600);
        stage.setResizable(false);
        stage.setTitle("REEEEEEEEEEE");
        stage.setScene(scene);
        stage.show();
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.SPACE){
                	if (circle3.getCenterY() >= 560)
                	{
                		scenetitle.setText("" + score + "");   
                		score = score + 100;
                	}
                	score = score + 0;
                }          
                if(event.getCode() == KeyCode.D) {
                	if (circle1.getCenterY() >= 560)
                	{
                		scenetitle.setText("" + score + "");   
                		score = score + 100;
                	}
                }
                if(event.getCode() == KeyCode.F) {
                	if (circle2.getCenterY() >= 560)
                	{
                		scenetitle.setText("" + score + "");   
                		score = score + 100;
                	}
                }
                if(event.getCode() == KeyCode.J) {
                	if (circle4.getCenterY() >= 560)
                	{
                		scenetitle.setText("" + score + "");   
                		score = score + 100;
                	}
                }
                if(event.getCode() == KeyCode.K) {      
                	if (circle5.getCenterY() >= 560)
                	{
                		scenetitle.setText("" + score + "");   
                		score = score + 100;
                	}
                }
            }
        });
	}
	
	
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

package thegame;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
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
	private Circle circle1 = new Circle();
	private Circle circle2 = new Circle();
	private Circle circle3 = new Circle();
	private Circle circle4 = new Circle();
	private Circle circle5 = new Circle();
	private Circle clickCircle1 = new Circle(100, 590, 20);
	private Circle clickCircle2 = new Circle(200, 590, 20);
	private Circle clickCircle3 = new Circle(300, 590, 20);
	private Circle clickCircle4 = new Circle(400, 590, 20);
	private Circle clickCircle5 = new Circle(500, 590, 20);
	/*
	private Line line1 = new Line();
	private Line line2 = new Line();
	private Line line3 = new Line();
	private Line line4 = new Line();
	private Line line5 = new Line();
	private PathTransition transition1 = new PathTransition();
	private PathTransition transition2 = new PathTransition();
	private PathTransition transition3 = new PathTransition();
	private PathTransition transition4 = new PathTransition();
	private PathTransition transition5 = new PathTransition();
	*/
	private int score = 0;
	Text scenetitle = new Text("Score");
	long timeStep = System.nanoTime() + 10000000000L;
	private String[] xValues = {"100","200","300","400","500"};
	private int x = 0;
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
	    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    
		circle1.setRadius(20.0);
		circle2.setRadius(20.0);
		circle3.setRadius(20.0);
		circle4.setRadius(20.0);
		circle5.setRadius(20.0);
		
		/*
		line1.setStartX(100.0);
		line1.setStartY(-400.0);
		line1.setEndX(100.0);
		line1.setEndY(590.0);
		
		line2.setStartX(200.0);
		line2.setStartY(-400.0);
		line2.setEndX(200.0);
		line2.setEndY(590.0);
		
		line3.setStartX(300.0);
		line3.setStartY(-400.0);
		line3.setEndX(300.0);
		line3.setEndY(590.0);
		
		line4.setStartX(400.0);
		line4.setStartY(-400.0);
		line4.setEndX(400.0);
		line4.setEndY(590.0);
		
		line5.setStartX(500.0);
		line5.setStartY(-400.0);
		line5.setEndX(500.0);
		line5.setEndY(590.0);
			
		transition1.setNode(circle1);
		transition1.setDuration(Duration.seconds(n1));
		transition1.setPath(line1);
		transition1.setCycleCount(5); //transition1.INDEFINITE 
		transition1.play();
		
		transition2.setNode(circle2);
		transition2.setDuration(Duration.seconds(n2));
		transition2.setPath(line2);
		transition2.setCycleCount(5);
		transition2.play();
		
		transition3.setNode(circle3);
		transition3.setDuration(Duration.seconds(n3));
		transition3.setPath(line3);
		transition3.setCycleCount(5);
		transition3.play();
		
		transition4.setNode(circle4);
		transition4.setDuration(Duration.seconds(n4));
		transition4.setPath(line4);
		transition4.setCycleCount(5);
		transition4.play();
		
		transition5.setNode(circle5);
		transition5.setDuration(Duration.seconds(n5));
		transition5.setPath(line5);
		transition5.setCycleCount(5);
		transition5.play();
		*/
		
		new AnimationTimer() {
	        public void handle(long now) {   
	        	int y = 0;
	          for (int i = 0; i < xValues.length; i++)
		      {
		        	x = Integer.parseInt(xValues[i]);
		      }
	          Circle fallingCircle = new Circle(x, 0, 20);
	          while (now > timeStep)
	          {
	        	  fallingCircle.setCenterY(y = y + 100);
	          }
	        }
	    }.start();
	    
		
		scenetitle.setLayoutX(300);
		scenetitle.setLayoutY(300);
		
		Pane root = new Pane();
		//root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
		root.getChildren().add(scenetitle);
        //root.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
        Scene scene = new Scene(root, 600, 600);
        stage.setResizable(false);
        stage.setTitle("REEEEEEEEEEE");
        stage.setScene(scene);
        stage.show();
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.SPACE){
                	scenetitle.setText("" + score + "");
                	score++;
                }          
                if(event.getCode() == KeyCode.D) {
                	scenetitle.setText("" + score + "");
                	score++;
                }
                if(event.getCode() == KeyCode.F) {
                	scenetitle.setText("" + score + "");
                	score++;
                }
                if(event.getCode() == KeyCode.J) {
                	scenetitle.setText("" + score + "");
                	score++;
                }
                if(event.getCode() == KeyCode.K) {      
                	scenetitle.setText("" + score + "");
                	score++;
                }
            }
        });
	}
	
	
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}

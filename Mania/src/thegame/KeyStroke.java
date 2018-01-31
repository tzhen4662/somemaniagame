package thegame;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class KeyStroke extends Application {
	 int count =0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        Button button = new Button("Press M");
        pane.setCenter(button);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        button.setOnKeyPressed(new EventHandler<KeyEvent>() {
        	
        	
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    System.out.println("Enter Pressed");
                }
                if(event.getCode() == KeyCode.D) {
                	//count++;
                	System.out.println("D");
                }
                if(event.getCode() == KeyCode.F) {
                	System.out.println("F");
                }
                if(event.getCode() == KeyCode.J) {
                	System.out.println("J");
                }
                if(event.getCode() == KeyCode.K) {
                	System.out.println("K");
                }
            }
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
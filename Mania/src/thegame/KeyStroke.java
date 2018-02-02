package thegame;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyStroke extends Application {
	 int count = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        Button button = new Button("Press M");
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        pane.setTop(scenetitle);
        //button.setText("" + count);
        pane.setCenter(button);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        button.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.SPACE){
                  button.setText("Space");
                  count++;
                  scenetitle.setText("" + count);
                }          
                if(event.getCode() == KeyCode.D) {
                	button.setText("D");
                	count++;
                	scenetitle.setText("" + count);
                }
                if(event.getCode() == KeyCode.F) {
                	button.setText("F");
                	count++;
                	scenetitle.setText("" + count);
                }
                if(event.getCode() == KeyCode.J) {
                	button.setText("J");
                	count++;
                	scenetitle.setText("" + count);
                }
                if(event.getCode() == KeyCode.K) {      
                	button.setText("K");
                	count++;
                	scenetitle.setText("" + count);
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
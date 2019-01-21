import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class Gui extends Application {
	
	boolean collide = false;
	Clip clip;
	
	  public void start(Stage primaryStage) {
		  // Create a scene and place a button in the scene
		
	       Pane pane = new Pane();
		    
	       Button button1 = new Button("Sound 1");
	       Button button2 = new Button("Sound 2");
	       Button button3 = new Button("Sound 3");
	       Button button4 = new Button("Sound 4");
	       Button button5 = new Button("Sound 5");
	       Button button6 = new Button("Sound 6");
	       
	       button1.setLayoutX(0);
	       button1.setLayoutY(150);
	       button2.setLayoutX(200);
	       button2.setLayoutY(150);
	       button3.setLayoutX(400);
	       button3.setLayoutY(150);
	       button4.setLayoutX(600);
	       button4.setLayoutY(150);
	       button5.setLayoutX(800);
	       button5.setLayoutY(150);
	       button6.setLayoutX(1000);
	       button6.setLayoutY(150);
	    
	       button1.setMinWidth(150);
	       button1.setMinHeight(150);
	       button2.setMinWidth(150);
	       button2.setMinHeight(150);
	       button3.setMinWidth(150);
	       button3.setMinHeight(150);
	       button4.setMinWidth(150);
	       button4.setMinHeight(150);
	       button5.setMinWidth(150);
	       button5.setMinHeight(150);
	       button6.setMinWidth(150);
	       button6.setMinHeight(150);

	        pane.getChildren().add(button1);
	        pane.getChildren().add(button2);
	        pane.getChildren().add(button3);
	        pane.getChildren().add(button4);
	        pane.getChildren().add(button5);
	        pane.getChildren().add(button6);
	     
	        
	        Scene scene = new Scene(pane,1150,400);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Ractangle");
	        primaryStage.show();
	        
	        button1.setOnAction(e -> handle("/Sound/Hello.wav"));
	        button2.setOnAction(e -> handle("/Sound/Bye.wav"));
	        button3.setOnAction(e -> handle("/Sound/Yes.wav"));
	        button4.setOnAction(e -> handle("/Sound/Laugh.wav"));
	        button5.setOnAction(e -> handle("/Sound/Good Morning.wav"));
	        button6.setOnAction(e -> handle("/Sound/Clap.wav"));
	        
		 }
	  

	  public void handle(String s) {	
			if(this.collide == true) this.clip.stop();
			try {
				AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(s));
				this.clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
				this.collide = true;
					}
			catch(Exception e) {		
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args); 
	}

}

package thegame;

import javafx.application.Application;
import javafx.scene.shape.Circle;

public class Player {
	
	public Circle[] hitboxes()
	{
		int circX = -100;
		int circY = 600;
		Circle[] ree = new Circle[4];
		 for (int i = 0; i < 4; i++)
		 {
			 ree[i] = new Circle(circX, circY, 20);
			 circX = circX + 100;
		 }
		 return ree;
	}
}

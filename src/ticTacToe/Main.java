package ticTacToe;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Tic Tac Toe");
		
		//top row
		HBox top = new HBox();
		top.setPadding(new Insets(0, 0, 0, 110));
		Button bTL = new Button(); 
		MyButton btnTopLeft = new MyButton(bTL, 0, 0);
		Button bTC = new Button();
		MyButton btnTopCenter = new MyButton(bTC, 0, 1);
		Button bTR = new Button();
		MyButton btnTopRight = new MyButton(bTR, 0, 2);
		top.getChildren().addAll(bTL, bTC, bTR);
		
		//middle row
		HBox middle = new HBox();
		middle.setPadding(new Insets(0, 0, 0, 110));
		Button bML = new Button(); 
		MyButton btnMiddleLeft = new MyButton(bML, 1, 0);
		Button bMC = new Button();
		MyButton btnMiddleCenter = new MyButton(bMC, 1, 1);
		Button bMR = new Button();
		MyButton btnMiddleRight = new MyButton(bMR, 1, 2);
		middle.getChildren().addAll(bML, bMC, bMR);
		
		//bottom row
		HBox bottom = new HBox();
		bottom.setPadding(new Insets(0, 0, 0, 110));
		Button bBL = new Button(); 
		MyButton btnBottomLeft = new MyButton(bBL, 2, 0);
		Button bBC = new Button();
		MyButton btnBottomCenter = new MyButton(bBC, 2, 1);
		Button bBR = new Button();
		MyButton btnBottomRight = new MyButton(bBR, 2, 2);
		bottom.getChildren().addAll(bBL, bBC, bBR);
		
		//adding buttons to an ArrayList
		ArrayList<MyButton> buttons = new ArrayList<>();
		buttons.add(btnBottomCenter);
		buttons.add(btnBottomLeft);
		buttons.add(btnBottomRight);
		buttons.add(btnMiddleRight);
		buttons.add(btnMiddleCenter);
		buttons.add(btnMiddleLeft);
		buttons.add(btnTopCenter);
		buttons.add(btnTopLeft);
		buttons.add(btnTopRight);
		
		//setting the size of buttons
		for(MyButton b : buttons){
			b.button.setPrefSize(100, 100);
		}
		
		//matrix of current x and o positions
		Matrix matrix = new Matrix();
		
		//current player - x is 0 and o is 1
		Player currentPlayer = new Player(0);
		
		//setOnAction for each button - what happens when you click on it
		for(MyButton b : buttons){
			b.button.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					b.click(currentPlayer, matrix);
				}
			});
		}
		
		VBox main = new VBox();
		main.setPadding(new Insets(10, 10, 10, 10));
		main.getChildren().addAll(top, middle, bottom);
		
		Scene scene = new Scene(main, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


}

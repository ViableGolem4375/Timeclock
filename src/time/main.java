package time;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main extends Application {
	
	public Scene homeScene;
	public Scene EditScene;
	HomePage home;
	EditPage edit;

	@Override
	public void start (Stage primaryStage) {
		home = new HomePage(primaryStage);
		homeScene = home.getScene();
		edit = new EditPage();
		EditScene = edit.getScene();
		primaryStage.setFullScreen(false);
		primaryStage.setFullScreenExitHint("");
		primaryStage.setScene(homeScene);
		primaryStage.setTitle("Time Clock");
		primaryStage.show();
		
		EventHandlerClass.editButtonPress(primaryStage, EditScene, edit);
		EventHandlerClass.exitButtonPress(primaryStage, homeScene, home);

	}
	
	
	public static void main(String[] args) {
		launch();

	}
}
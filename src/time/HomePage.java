package time;

import java.awt.FontFormatException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import java.io.IOException;
import java.io.InputStream;

public class HomePage extends main {
	Label title;
	Label week1;
	Label week2;
	Label time;
	Label time2;
	Label time3;
	Label time4;
	Label time5;
	Label time6;
	Label time7;
	Label time8;
	Label time9;
	Label time10;
	Label time11;
	Label time12;
	Label time13;
	Label time14;
	String values;
	static CustomButton editB;
	CustomButton closeB;
	CustomButton reloadB;
	//InputStream fontstream = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/resources/fonts/Audiowide-Regular.ttf");
	//Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 35);
	//Font font2 = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 20);
	Font font = Font.font("Consolas", 35);
	Font font2 = Font.font("Consolas", 20);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";
	
	InputStream fstream = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock.txt");
	InputStream fstream2 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock2.txt");
	InputStream fstream3 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock3.txt");
	InputStream fstream4 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock4.txt");
	InputStream fstream5 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock5.txt");
	InputStream fstream6 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock6.txt");
	InputStream fstream7 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock7.txt");
	InputStream fstream8 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock8.txt");
	InputStream fstream9 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock9.txt");
	InputStream fstream10 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock10.txt");
	InputStream fstream11 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock11.txt");
	InputStream fstream12 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock12.txt");
	InputStream fstream13 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock13.txt");
	InputStream fstream14 = this.getClass().getResourceAsStream("D:/JavaProjectsEclipse2023/Timeclock/timeclock14.txt");
		
	public HomePage(Stage primaryStage) {
		buildTitle();
		buildtime();
		buildtime2();
		buildtime3();
		buildtime4();
		buildtime5();
		buildtime6();
		buildtime7();
		buildtime8();
		buildtime9();
		buildtime10();
		buildtime11();
		buildtime12();
		buildtime13();
		buildtime14();
		buildEditButton();
		buildCloseButton();
		buildReloadButton();
		display();
		display2();
		display3();
		display4();
		display5();
		display6();
		display7();
		display8();
		display9();
		display10();
		display11();
		display12();
		display13();
		display14();
		closeButtonPress(primaryStage);
		reloadButtonPress(primaryStage);
	}
	
	private void buildTitle() {
		this.title = new Label("Time Clock");
		this.title.setFont(font);
		this.title.setTextFill(Color.YELLOW);
	}
	
	private void buildtime() {
		this.time = new Label("");
		this.time.setFont(font2);
		this.time.setTextFill(Color.YELLOW);
	}
	
	private void buildtime2() {
		this.time2 = new Label("");
		this.time2.setFont(font2);
		this.time2.setTextFill(Color.YELLOW);
	}
	
	private void buildtime3() {
		this.time3 = new Label("");
		this.time3.setFont(font2);
		this.time3.setTextFill(Color.YELLOW);
	}
	
	private void buildtime4() {
		this.time4 = new Label("");
		this.time4.setFont(font2);
		this.time4.setTextFill(Color.YELLOW);
	}
	
	private void buildtime5() {
		this.time5 = new Label("");
		this.time5.setFont(font2);
		this.time5.setTextFill(Color.YELLOW);
	}
	
	private void buildtime6() {
		this.time6 = new Label("");
		this.time6.setFont(font2);
		this.time6.setTextFill(Color.YELLOW);
	}
	
	private void buildtime7() {
		this.time7 = new Label("");
		this.time7.setFont(font2);
		this.time7.setTextFill(Color.YELLOW);
	}
	
	private void buildtime8() {
		this.time8 = new Label("");
		this.time8.setFont(font2);
		this.time8.setTextFill(Color.YELLOW);
	}
	
	private void buildtime9() {
		this.time9 = new Label("");
		this.time9.setFont(font2);
		this.time9.setTextFill(Color.YELLOW);
	}
	
	private void buildtime10() {
		this.time10 = new Label("");
		this.time10.setFont(font2);
		this.time10.setTextFill(Color.YELLOW);
	}
	
	private void buildtime11() {
		this.time11 = new Label("");
		this.time11.setFont(font2);
		this.time11.setTextFill(Color.YELLOW);
	}
	
	private void buildtime12() {
		this.time12 = new Label("");
		this.time12.setFont(font2);
		this.time12.setTextFill(Color.YELLOW);
	}
	
	private void buildtime13() {
		this.time13 = new Label("");
		this.time13.setFont(font2);
		this.time13.setTextFill(Color.YELLOW);
	}
	
	private void buildtime14() {
		this.time14 = new Label("");
		this.time14.setFont(font2);
		this.time14.setTextFill(Color.YELLOW);
	}
	
	private void buildEditButton() {
		ButtonStyle editButton = new ButtonStyle();
		editButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		editButton.setFontColor(Color.YELLOW);
		editButton.setFontSize(15);
		editB = CustomButton.customStaticButton("Edit Time Clock", editButton);
	}
	
	private void buildCloseButton() {
		ButtonStyle closeButton = new ButtonStyle();
		closeButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		closeButton.setFontColor(Color.YELLOW);
		closeButton.setFontSize(15);
		closeB = CustomButton.customStaticButton("Exit Program", closeButton);
	}
	
	private void buildReloadButton() {
		ButtonStyle reloadButton = new ButtonStyle();
		reloadButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		reloadButton.setFontColor(Color.YELLOW);
		reloadButton.setFontSize(15);
		reloadB = CustomButton.customStaticButton("Fix Broken Text Fields", reloadButton);
	}
	
	public Scene getScene() {
		Scene homeScreen = new Scene(buildUserSpace(), 1000, 900);
		return homeScreen;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, title, time, time2, time3, time4, time5, time6, time7, time8, time9, time10, time11, time12, time13, time14, editB, reloadB, closeB);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
	private void reloadButtonPress(Stage primaryStage) {
		reloadB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aeo) {
				primaryStage.close();
				Platform.runLater( () -> {
					try {
						new main().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			}
		});
	}
	
	private void closeButtonPress(Stage primaryStage) {
		closeB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aeo) {
				primaryStage.close();
			}
		});
	}
	
	private void display() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time.setText("Sunday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display2() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock2.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time2.setText("Monday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display3() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock3.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time3.setText("Tuesday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display4() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock4.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time4.setText("Wednesday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display5() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock5.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time5.setText("Thursday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display6() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock6.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time6.setText("Friday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display7() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock7.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time7.setText("Saturday Week 1: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display8() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock8.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time8.setText("Sunday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display9() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock9.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time9.setText("Monday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display10() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock10.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time10.setText("Tuesday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display11() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock11.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time11.setText("Wednesday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display12() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock12.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time12.setText("Thursday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display13() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock13.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time13.setText("Friday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void display14() {
		try {
		File userFile = new File("D:/JavaProjectsEclipse2023/Timeclock/timeclock14.txt");
		Scanner scanner;
		scanner = new Scanner(userFile);
		String line = null;
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			values = line;
			list.add(values);
		}
		
		time14.setText("Saturday Week 2: " + line);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void confirmButtonPress() {
		editB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent aei) {
					if (aei.getSource() == editB) {
						display();
					}
				}

		});

	}
}

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
import java.io.PrintWriter;

public class EditPage extends main {
	Label title;
	static Label success;
	static Label success2;
	static CustomButton exitB;
	CustomButton confirmB;
	CustomButton deleteB;
	UserField data;
	UserField data2;
	UserField data3;
	UserField data4;
	UserField data5;
	UserField data6;
	UserField data7;
	UserField data8;
	UserField data9;
	UserField data10;
	UserField data11;
	UserField data12;
	UserField data13;
	UserField data14;
	//Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 35);
	//Font font2 = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 20);
	Font font = Font.font("Consolas", 35);
	Font font2 = Font.font("Consolas", 20);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";
	private TextFieldStyle dataFieldStyle = new TextFieldStyle("#FBCE3A","C9595F", "#E0D0B8");
	
	public EditPage() {
		buildTitle();
		data = new UserField("Enter Time For Sunday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data2 = new UserField("Enter Time For Monday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data3 = new UserField("Enter Time For Tuesday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data4 = new UserField("Enter Time For Wednesday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data5 = new UserField("Enter Time For Thursday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data6 = new UserField("Enter Time For Friday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data7 = new UserField("Enter Time For Saturday Week 1 Here: ", "#E0D0B8", dataFieldStyle);
		data8 = new UserField("Enter Time For Sunday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data9 = new UserField("Enter Time For Monday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data10 = new UserField("Enter Time For Tuesday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data11 = new UserField("Enter Time For Wednesday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data12 = new UserField("Enter Time For Thursday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data13 = new UserField("Enter Time For Friday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		data14 = new UserField("Enter Time For Saturday Week 2 Here: ", "#E0D0B8", dataFieldStyle);
		buildConfirmButton();
		buildDeleteButton();
		buildExitButton();
		confirmButtonPress();
		deleteButtonPress();
		buildSuccess();
		buildSuccess2();
	}
	
	private void buildTitle() {
		this.title = new Label("Edit Time Clock");
		this.title.setFont(font);
		this.title.setTextFill(Color.YELLOW);
	}
	private void buildSuccess() {
		this.success = new Label("");
		this.success.setFont(font2);
		this.success.setTextFill(Color.YELLOW);
	}
	
	private void buildSuccess2() {
		this.success2 = new Label("");
		this.success2.setFont(font2);
		this.success2.setTextFill(Color.YELLOW);
	}
	
	private void buildConfirmButton() {
		ButtonStyle confirmButton = new ButtonStyle();
		confirmButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		confirmButton.setFontColor(Color.YELLOW);
		confirmButton.setFontSize(15);
		confirmB = CustomButton.customStaticButton("Enter", confirmButton);
	}
	
	private void buildDeleteButton() {
		ButtonStyle deleteButton = new ButtonStyle();
		deleteButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		deleteButton.setFontColor(Color.YELLOW);
		deleteButton.setFontSize(15);
		deleteB = CustomButton.customStaticButton("Delete Time Clock Contents", deleteButton);
	}
	
	private void buildExitButton() {
		ButtonStyle exitButton = new ButtonStyle();
		exitButton.setBackground("linear-gradient(to bottom right, #cc00cc 40%, #000000 100%)");
		exitButton.setFontColor(Color.YELLOW);
		exitButton.setFontSize(15);
		exitB = CustomButton.customStaticButton("Exit", exitButton);
	}
	
	public Scene getScene() {
		Scene editScreen = new Scene(buildUserSpace(), 1000, 900);
		return editScreen;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, title, data, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14, confirmB, deleteB, exitB, success, success2);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
	public void confirmButtonPress() {
		confirmB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent aei) {
					String dataEntry = data.getText();
					String dataEntry2 = data2.getText();
					String dataEntry3 = data3.getText();
					String dataEntry4 = data4.getText();
					String dataEntry5 = data5.getText();
					String dataEntry6 = data6.getText();
					String dataEntry7 = data7.getText();
					String dataEntry8 = data8.getText();
					String dataEntry9 = data9.getText();
					String dataEntry10 = data10.getText();
					String dataEntry11 = data11.getText();
					String dataEntry12 = data12.getText();
					String dataEntry13 = data13.getText();
					String dataEntry14 = data14.getText();
					File userFile = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock.txt");
					File userFile2 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock2.txt");
					File userFile3 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock3.txt");
					File userFile4 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock4.txt");
					File userFile5 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock5.txt");
					File userFile6 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock6.txt");
					File userFile7 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock7.txt");
					File userFile8 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock8.txt");
					File userFile9 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock9.txt");
					File userFile10 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock10.txt");
					File userFile11 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock11.txt");
					File userFile12 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock12.txt");
					File userFile13 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock13.txt");
					File userFile14 = new File ("D:/JavaProjectsEclipse2023/Timeclock/timeclock14.txt");
					try {
						userFile.createNewFile();
						userFile2.createNewFile();
						userFile3.createNewFile();
						userFile4.createNewFile();
						userFile5.createNewFile();
						userFile6.createNewFile();
						userFile7.createNewFile();
						userFile8.createNewFile();
						userFile9.createNewFile();
						userFile10.createNewFile();
						userFile11.createNewFile();
						userFile12.createNewFile();
						userFile13.createNewFile();
						userFile14.createNewFile();
						if (userFile.createNewFile() && userFile2.createNewFile() && userFile3.createNewFile() && userFile4.createNewFile() && userFile5.createNewFile() && userFile6.createNewFile() && userFile7.createNewFile() && userFile8.createNewFile() && userFile9.createNewFile() && userFile10.createNewFile() && userFile11.createNewFile() && userFile12.createNewFile() && userFile13.createNewFile() && userFile14.createNewFile()) {
							System.out.println("work");
						}
						BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true));
						BufferedWriter writer2 = new BufferedWriter(new FileWriter(userFile2, true));
						BufferedWriter writer3 = new BufferedWriter(new FileWriter(userFile3, true));
						BufferedWriter writer4 = new BufferedWriter(new FileWriter(userFile4, true));
						BufferedWriter writer5 = new BufferedWriter(new FileWriter(userFile5, true));
						BufferedWriter writer6 = new BufferedWriter(new FileWriter(userFile6, true));
						BufferedWriter writer7 = new BufferedWriter(new FileWriter(userFile7, true));
						BufferedWriter writer8 = new BufferedWriter(new FileWriter(userFile8, true));
						BufferedWriter writer9 = new BufferedWriter(new FileWriter(userFile9, true));
						BufferedWriter writer10 = new BufferedWriter(new FileWriter(userFile10, true));
						BufferedWriter writer11 = new BufferedWriter(new FileWriter(userFile11, true));
						BufferedWriter writer12 = new BufferedWriter(new FileWriter(userFile12, true));
						BufferedWriter writer13 = new BufferedWriter(new FileWriter(userFile13, true));
						BufferedWriter writer14 = new BufferedWriter(new FileWriter(userFile14, true));
						if (aei.getSource() == confirmB) {
							if(dataEntry != "") {
								writer.write(dataEntry);
								writer.write(System.getProperty("line.separator"));
								writer.close();
							}
							
							if(dataEntry2 != "") {
								writer2.write(dataEntry2);
								writer2.write(System.getProperty("line.separator"));
								writer2.close();
							}
							
							if(dataEntry3 != "") {
								writer3.write(dataEntry3);
								writer3.write(System.getProperty("line.separator"));
								writer3.close();
							}
							
							if(dataEntry4 != "") {
								writer4.write(dataEntry4);
								writer4.write(System.getProperty("line.separator"));
								writer4.close();
							}
							
							if(dataEntry5 != "") {
								writer5.write(dataEntry5);
								writer5.write(System.getProperty("line.separator"));
								writer5.close();
							}
							
							if(dataEntry6 != "") {
								writer6.write(dataEntry6);
								writer6.write(System.getProperty("line.separator"));
								writer6.close();
							}
							
							if(dataEntry7 != "") {
								writer7.write(dataEntry7);
								writer7.write(System.getProperty("line.separator"));
								writer7.close();
							}
							
							if(dataEntry8 != "") {
								writer8.write(dataEntry8);
								writer8.write(System.getProperty("line.separator"));
								writer8.close();
							}
							
							if(dataEntry9 != "") {
								writer9.write(dataEntry9);
								writer9.write(System.getProperty("line.separator"));
								writer9.close();
							}
							
							if(dataEntry10 != "") {
								writer10.write(dataEntry10);
								writer10.write(System.getProperty("line.separator"));
								writer10.close();
							}
							
							if(dataEntry11 != "") {
								writer11.write(dataEntry11);
								writer11.write(System.getProperty("line.separator"));
								writer11.close();
							}
							
							if(dataEntry12 != "") {
								writer12.write(dataEntry12);
								writer12.write(System.getProperty("line.separator"));
								writer12.close();
							}
							
							if(dataEntry13 != "") {
								writer13.write(dataEntry13);
								writer13.write(System.getProperty("line.separator"));
								writer13.close();
							}
							
							if(dataEntry14 != "") {
								writer14.write(dataEntry14);
								writer14.write(System.getProperty("line.separator"));
								writer14.close();
							}
							
							success.setText("Time Clock Successfully Edited");
						}
					}
					catch (IOException ex) {
						ex.printStackTrace();
					}
			}
		});

	}
	
	public void deleteButtonPress() {
		deleteB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent aei) {
					File userFile = new File ("timeclock.txt");
					File userFile2 = new File ("timeclock2.txt");
					File userFile3 = new File ("timeclock3.txt");
					File userFile4 = new File ("timeclock4.txt");
					File userFile5 = new File ("timeclock5.txt");
					File userFile6 = new File ("timeclock6.txt");
					File userFile7 = new File ("timeclock7.txt");
					File userFile8 = new File ("timeclock8.txt");
					File userFile9 = new File ("timeclock9.txt");
					File userFile10 = new File ("timeclock10.txt");
					File userFile11 = new File ("timeclock11.txt");
					File userFile12 = new File ("timeclock12.txt");
					File userFile13 = new File ("timeclock13.txt");
					File userFile14 = new File ("timeclock14.txt");
					try {
						userFile.createNewFile();
						userFile2.createNewFile();
						userFile3.createNewFile();
						userFile4.createNewFile();
						userFile5.createNewFile();
						userFile6.createNewFile();
						userFile7.createNewFile();
						userFile8.createNewFile();
						userFile9.createNewFile();
						userFile10.createNewFile();
						userFile11.createNewFile();
						userFile12.createNewFile();
						userFile13.createNewFile();
						userFile14.createNewFile();
						if (userFile.createNewFile() && userFile2.createNewFile() && userFile3.createNewFile() && userFile4.createNewFile() && userFile5.createNewFile() && userFile6.createNewFile() && userFile7.createNewFile() && userFile8.createNewFile() && userFile9.createNewFile() && userFile10.createNewFile() && userFile11.createNewFile() && userFile12.createNewFile() && userFile13.createNewFile() && userFile14.createNewFile()) {
							System.out.println("work");
						}
						if (aei.getSource() == deleteB) {
							PrintWriter writer2 = new PrintWriter(userFile);
							writer2.close();
							
							PrintWriter writer22 = new PrintWriter(userFile2);
							writer22.close();
							
							PrintWriter writer23 = new PrintWriter(userFile3);
							writer23.close();
							
							PrintWriter writer24 = new PrintWriter(userFile4);
							writer24.close();
							
							PrintWriter writer25 = new PrintWriter(userFile5);
							writer25.close();
							
							PrintWriter writer26 = new PrintWriter(userFile6);
							writer26.close();
							
							PrintWriter writer27 = new PrintWriter(userFile7);
							writer27.close();
							
							PrintWriter writer28 = new PrintWriter(userFile8);
							writer28.close();
							
							PrintWriter writer29 = new PrintWriter(userFile9);
							writer29.close();
							
							PrintWriter writer210 = new PrintWriter(userFile10);
							writer210.close();
							
							PrintWriter writer211 = new PrintWriter(userFile11);
							writer211.close();
							
							PrintWriter writer212 = new PrintWriter(userFile12);
							writer212.close();
							
							PrintWriter writer213 = new PrintWriter(userFile13);
							writer213.close();
							
							PrintWriter writer214 = new PrintWriter(userFile14);
							writer214.close();
							success2.setText("Time Clock Cleared");
						}
					}
					catch (IOException ex) {
						ex.printStackTrace();
					}
			}
		});

	}
	
}

package time;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CustomButton extends Button {
	String htmlColorChoice;
	Font buttonFont;
	CustomButton newButton;
	
	CustomButton(String buttonName, ButtonStyle thisButton){	
		//buttonFont = Font.font(thisButton.fontChoice, FontWeight.BOLD, thisButton.fontSize);
		buttonFont = Font.font("Consolas", thisButton.fontSize);
		//buttonFont = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", thisButton.fontSize);
		this.setStyle("-fx-background-radius: 5;-fx-background-color:" + thisButton.htmlColor);
		this.setText(buttonName);
		this.setTextFill(thisButton.fontColor);
		this.setFont(buttonFont);
		this.setOnAction(new HoverHandler());
	}
	
	public static CustomButton customStaticButton(String buttonName,  ButtonStyle thisButton) {
		CustomButton newButton = new CustomButton(buttonName, thisButton);
		return newButton;
	}
}

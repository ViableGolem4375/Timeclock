package time;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class EventHandlerClass extends main {

	public static void editButtonPress(Stage primaryStage, Scene EditScene, EditPage edit) {
		HomePage.editB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aeo) {
					primaryStage.setScene(EditScene);
	        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void exitButtonPress(Stage primaryStage, Scene homeScene, HomePage home) {
		EditPage.exitB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aei) {
				EditPage.success.setText("");
				EditPage.success2.setText("");
				primaryStage.setScene(homeScene);
        		primaryStage.centerOnScreen();
			}
		});
	}
}
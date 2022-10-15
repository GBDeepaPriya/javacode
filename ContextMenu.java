package application;
//Demonstrate Menus
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class A2Q3  extends Application {
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Demonstrate ContextMenus");
		
		// Use a BorderPane for the root node.
		BorderPane rootNode = new BorderPane();
		
		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 300);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
		// Create a label that will report the selection.
		response = new Label("ContextMenu Demo");
		
		

		// Create the context menu items
		
		MenuItem file = new MenuItem("File");
		MenuItem folder = new MenuItem("Folder");
		MenuItem image = new MenuItem("Image");
       
		// Create the context View menu.
		
		MenuItem large = new MenuItem("Large");
		MenuItem medium = new MenuItem("Medium");
		MenuItem small= new MenuItem("Small");
		
		
		// Create a context (i.e., popup) menu that shows new options.
		final ContextMenu newMenu = new ContextMenu(file,folder,image);
		
		// Create a context (i.e., popup) menu that shows view options.
		final ContextMenu viewMenu = new ContextMenu(large,medium,small);
		
		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				response.setText(name + " selected");
			}
		};
		
		// Set action event handlers for the menu items.
		file.setOnAction(MEHandler);
		folder.setOnAction(MEHandler);
		image.setOnAction(MEHandler);
		large.setOnAction(MEHandler);
		medium.setOnAction(MEHandler);
		small.setOnAction(MEHandler);		
		
		// Create a text field and set its column width to 20.
		TextField tf1 = new TextField("New Menu");
		tf1.setPrefColumnCount(20);
		TextField tf2 = new TextField("View Menu");
		tf2.setPrefColumnCount(20);
		
		// Add the context menu to the textfield.
		tf1.setContextMenu(newMenu);
		tf2.setContextMenu(viewMenu);
		
		// Create a flow pane that will hold both the response
		// label and the text field.
		FlowPane fpRoot = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		fpRoot.setAlignment(Pos.CENTER);
	
		// Add both the label and the text field to the flow pane.
		fpRoot.getChildren().addAll(response, tf1,tf2);
		
		// Add the flow pane to the center of the border layout.
		rootNode.setCenter(fpRoot);
		
		// Show the stage and its scene.
		myStage.show();
	}
}

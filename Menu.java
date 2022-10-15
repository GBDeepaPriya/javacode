package application;

//Demonstrate Menus
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class A2Q2 extends Application{
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Demonstrate Menus");
		
		// Use a BorderPane for the root node.
		BorderPane rootNode = new BorderPane();
		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 300);
				
		// Set the scene on the stage.
		myStage.setScene(myScene);
				
		// Create a label that will report the selection.
		response = new Label("Menu Demo");
			
		// Create the menu bar.
		MenuBar mb = new MenuBar();
				
		// Create the File menu.
		Menu fileMenu = new Menu("_File");
		// Create menu itesm for File menu
		MenuItem New= new MenuItem("New");
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		fileMenu.getItems().addAll(New,open, save);
		
		// Turn on mnemonic
		fileMenu.setMnemonicParsing(true);

		// Add keyboard accelerators for the File menu.
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		New.setAccelerator(KeyCombination.keyCombination("shortcut+N"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		
		// Add File menu to the menu bar.
	    mb.getMenus().add(fileMenu);
	    
	    // Create the Edit menu.
		Menu editMenu = new Menu("_Edit");
 		MenuItem cut = new MenuItem("Cut");
 		MenuItem copy = new MenuItem("Copy");
 		MenuItem paste = new MenuItem("Paste");
        editMenu.getItems().addAll(cut,copy,paste);
        
        // Turn on mnemonic
 		editMenu.setMnemonicParsing(true);

 		// Add keyboard accelerators for the edit menu.
 		cut.setAccelerator(KeyCombination.keyCombination("shortcut+X"));
 		copy.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
 		paste.setAccelerator(KeyCombination.keyCombination("shortcut+V"));
 		
		// Add Edit menu to the menu bar.
		mb.getMenus().add(editMenu);
		
		// Create the Help menu.
	    Menu helpMenu = new Menu("Help");
						
		// Create menu items for Help menu
	    MenuItem helpcentre= new MenuItem("Help Centre");
		MenuItem about= new MenuItem("About Us");
        helpMenu.getItems().addAll(helpcentre,about);
		
		// Add Help menu to the menu bar.
		mb.getMenus().add(helpMenu);
		
		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				
				response.setText(name + " selected");
			}
		};
		
		// Set action event handlers for the menu items.
		open.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		New.setOnAction(MEHandler);
		cut.setOnAction(MEHandler);
		copy.setOnAction(MEHandler);
		paste.setOnAction(MEHandler);
		about.setOnAction(MEHandler);
		
		// Add the menu bar to the top of the border pane and
		// the response label to the center position.
		rootNode.setTop(mb);
		rootNode.setCenter(response);
		
		// Show the stage and its scene.
		myStage.show();
	}
}

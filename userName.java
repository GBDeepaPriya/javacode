package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*; 


public class A2Q1 extends Application {
	     Label l1,l2;
	     TextField tf1,tf2;
	     public static void main(String[] args) {
	 	 // Start the JavaFX application by calling launch().
		     launch(args);
		 }
		 // Override the start() method.
		 public void start(Stage myStage) throws Exception{
			 
		 // Give the stage a title.
		 myStage.setTitle("GUI Application");
		 
		 //Creating a Grid Pane 
		 GridPane gridPane = new GridPane();    
	      
	     //Setting size for the pane 
	     gridPane.setMinSize(400, 200); 
	     
	     //Creating a scene object 
	     Scene myScene = new Scene(gridPane); 
	     
		
		 // Set the scene on the stage.
		 myStage.setScene(myScene);
		 
		 //creating label user name 
	     Text text1 = new Text("User Name");       
	      
	     //creating label password 
	     Text text2 = new Text("Password"); 
	       
	     //Creating Text Filed for user name        
	     TextField textField1 = new TextField();       
	      
	     //Creating Text Filed for password        
	     PasswordField textField2 = new PasswordField();  
	       
	     //Creating Buttons 
	     Button button1 = new Button("Submit"); 
	     Button button2 = new Button("Clear");  
		 
	     //create label
	     Label message = new Label("");
	     
	     //Setting the padding  
	     gridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      
	     //Setting the vertical and horizontal gaps between the columns 
	     gridPane.setVgap(5); 
	     gridPane.setHgap(5);       
	      
	     //Setting the Grid alignment 
	     gridPane.setAlignment(Pos.CENTER); 
	       
	     //Arranging all the nodes in the grid 
	     gridPane.add(text1, 0, 0); 
	     gridPane.add(textField1, 1, 0); 
	     gridPane.add(text2, 0, 1);       
	     gridPane.add(textField2, 1, 1); 
	     gridPane.add(button1, 0, 2); 
	     gridPane.add(button2, 1, 2); 
	     gridPane.add(message,0,3);
	     
	     button1.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e) {
	    		  try {
	    			  
	    	          
	    	          if((!textField1.getText().equals("Deepika")))
	    	        	  throw new NotValidException("Your username is incorrect!");	
	    	          else if((!textField2.getText().equals("G0xx5")))
		    	        	throw new NotValidException("Your password is incorrect!");
	    	          else 
	    	           message.setText("Welcome"+" "+textField1.getText());
	    	        	
	    		  }catch(NotValidException ne) {
	    			  System.out.println(ne);
	    			  message.setText(ne.toString());
	    		  }
	    	        
	    	    }
	     });
	    
	     button2.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e) {
	    		  textField2.clear();
	    		  textField1.clear();
	    	  }
	     });	  
	     // Show the stage and its scene.
		 myStage.show();
		 
		 			
		 
		 }	 
}

class NotValidException extends Exception{
	
	private static final long serialVersionUID = 8537512544458970152L;
	String str;
	
	NotValidException(String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
	
}

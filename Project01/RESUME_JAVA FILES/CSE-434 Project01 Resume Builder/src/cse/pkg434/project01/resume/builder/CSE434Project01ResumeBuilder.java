/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.pkg434.project01.resume.builder;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 

import javafx.scene.control.DatePicker; 
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane; 


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import javafx.scene.control.ListView; 
import javafx.scene.control.TextField;

import javafx.scene.text.Text; 
import javafx.scene.text.Font; 
import javafx.scene.control.TextField; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;  

import javafx.scene.paint.Color; 




/**
 *
 * @author User
 */
 public class CSE434Project01ResumeBuilder extends Application 
{
    
    @Override
     public void start(Stage stage) throws Exception
    {
      Text text = new Text();              //Text object Created here
      Group form_gui = new Group(text);   // Group object created here  
      Scene scene = new Scene(form_gui, 850, 700);  // Scene object Created Here
      
      stage.setTitle("CSE-434 Project01 Resume Builder by Hafizur Rahman");  // Set the title for Stage
      
      text.setText("RESUME BUILDER");  // Title Text
      text.setX(350);       //Position of the text Title
      text.setY(30);
      text.setFont(Font.font("Times New Roman",FontPosture.REGULAR,20));//Font Settings for Text Title 
              
      text.setFill(Color.BLACK);    //Color Fill inside the text title 
      text.setStrokeWidth(2);       //  Stroke size 
      text.setStroke(Color.GREEN);     // Color of stroke     
      
    
       
      stage.setScene(scene);    // Scene added in stage       
      stage.show();             //  Stage elements show 
        
      
      
      
      
      
    }

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
         launch(args);
    }
    
     
     
}

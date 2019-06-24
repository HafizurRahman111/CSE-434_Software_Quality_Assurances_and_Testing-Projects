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

import javafx.scene.control.ListView; 

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
        
      Text title = new Text();                   //Text object Created for Title here
      
      Text contactinfo = new Text();             // Text Object for Contact Information created
      
      Text name = new Text();                    // Text Object for Name created
      TextField nameField = new TextField();     // Input Field Object created for Name  
      
      
      Text caddress = new Text();                    // Text Object for Current Address created
      TextField caddressField = new TextField();     // Input Field Object created for Current Address  
      
      Text contact = new Text();                    // Text Object for Contact Number created
      TextField contactField = new TextField();     // Input Field Object created for Contact Number 
      
      
      Group form_gui = new Group(title, contactinfo, name,nameField ,caddress,caddressField,contact,contactField );   // Group object created here 
      
      Scene scene = new Scene(form_gui, 850, 700);                       // Scene object Created Here
      
      stage.setTitle("CSE-434 Project01 Resume Builder by Hafizur Rahman");  // Set the title for Stage
      
      
      
      // Title    - RESUME BUILDER 
      
      title.setText("RESUME BUILDER");  // Title Text
      title.setX(350);                  //Position of the text Title
      title.setY(25);
      title.setFont(Font.font("Times New Roman",FontPosture.REGULAR,20));//Font Settings for Text Title 
              
      title.setFill(Color.BLACK);       //Color Fill inside the text title 
      title.setStrokeWidth(2);          //  Stroke size 
      title.setStroke(Color.GREEN);     // Color of stroke     
            
      
     // Contact Informations 
      
      contactinfo.setText("Contact Information :");  // Contact information Text Title Here
     
      contactinfo.setX(20);                //Position of the contact information text 
      contactinfo.setY(75);
      contactinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,18));//Font Settings for Text Title 
      contactinfo.setStrokeWidth(1);       //  Stroke size 
      contactinfo.setUnderline(true);  
      
      
      
      
      // Name 
      name.setText("Name :");  // Name Text
      name.setX(80);           //Position of the name text 
      name.setY(116);
      name.setFont(Font.font("Arial",FontPosture.REGULAR,16)); //Font Settings for Name Text  
               
      // Input Field For Name
      
      nameField.setLayoutX(270);  // Position setup for Name Input Field
      nameField.setLayoutY(100);
     
       
      // Current Address 
      
      caddress.setText("Current Address :");  //Current Address Text
      caddress.setX(80);           //Position of the Current Address text 
      caddress.setY(146);
      caddress.setFont(Font.font("Arial",FontPosture.REGULAR,16)); //Font Settings for Current Address Text  
      
      caddressField.setLayoutX(270);  // Position setup for Current Address Input Field
      caddressField.setLayoutY(130);
      
      // Contact Number 
      
      contact.setText("Contact Number :");  //Contact Number Text
      contact.setX(80);           //Position of the Contact Number 
      contact.setY(180);
      contact.setFont(Font.font("Arial",FontPosture.REGULAR,16)); //Font Settings for Contact Number Text  
      
      contactField.setLayoutX(270);  // Position setup for Contact Number Input Field
      contactField.setLayoutY(160);
      
      
     
       
       
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
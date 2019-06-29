/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.pkg434.project01.resume.builder;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 

import javafx.scene.control.DatePicker; 
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane; 


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Group;

import javafx.scene.control.ListView; 

import javafx.scene.text.Text; 
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font; 
import javafx.scene.control.TextField; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;  

import javafx.scene.paint.Color; 

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.embed.swing.SwingFXUtils;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;


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
      
      Text email = new Text();                     // Text Object for Contact email created
      TextField emailField = new TextField();      // Input Field Object created for email
         
      Text careerinfo = new Text();               // Text Object for Career Objective created
      
      TextArea careerObjective = new TextArea();  // Multiline Text Input Box for Career Objective
      VBox careerInput = new VBox(careerObjective);  

      Text buttonPhoto = new Text();     //   Text Object for Photo Upload
        
      
      Button btnImageLoad = new Button("Click Here");  // Photo Upload Button With Text
      
      
           btnImageLoad.setOnAction(new EventHandler<ActionEvent>()
          {
             @Override
             
                  public void handle(ActionEvent arg0) 
                {
                  FileChooser photoChooser = new FileChooser();
                
                  FileChooser.ExtensionFilter extnFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
                  FileChooser.ExtensionFilter extnFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
                  FileChooser.ExtensionFilter extnFilterGIF = new FileChooser.ExtensionFilter("GIF files (*.gif)", "*.GIF");
           
                  photoChooser.getExtensionFilters().addAll(extnFilterJPG,extnFilterPNG,extnFilterGIF);
                  File Photofile = photoChooser.showOpenDialog(stage);
                  
                }
               
                  
          });
          
          
          
         
                
      
      
      Group form_gui = new Group(title, contactinfo, name,nameField ,caddress,caddressField,contact,contactField,email,emailField,careerinfo,careerInput,buttonPhoto,btnImageLoad);   // Group object created here 
      
      
      
      Scene scene = new Scene(form_gui, 850, 700);             // Scene object Created Here
      
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
      
      // Email
      
      email.setText("Email :");  //Contact Number Text
      email.setX(80);           //Position of the Contact Number 
      email.setY(210);
      email.setFont(Font.font("Arial",FontPosture.REGULAR,16)); //Font Settings for Contact Number Text  
      
      emailField.setLayoutX(270);  // Position setup for Contact Number Input Field
      emailField.setLayoutY(190);
      
      // Career Objective 
      
       careerinfo.setText("Career Objective :");  // Career Objective Text Title Here 
         
       careerinfo.setX(20);                //Position of the Career Objective Text 
       careerinfo.setY(280); 
       careerinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,18));//Font Settings for Text Title 
       careerinfo.setStrokeWidth(1);       //  Stroke size 
       careerinfo.setUnderline(true);  
       
       
       careerInput.setLayoutX(270);  //  Position setup for Career Objective Input Field
       careerInput.setLayoutY(282);  
       careerInput.setPrefWidth(230);   // Setup position Career Objective Input Box
       careerInput.setPrefHeight(60);
       
    
       // Photo Upload 
       
       buttonPhoto.setText("Upload Your Photo :");   // Photo Upload Text
       buttonPhoto.setX(450);                        //Position of the Photo Upload Text
       buttonPhoto.setY(116);
       buttonPhoto.setFont(Font.font("Arial",FontPosture.REGULAR,16)); //Font Settings  
      
     
      
       btnImageLoad.setLayoutX(603);  // Photo Upload Frame Position
      
       btnImageLoad.setLayoutY(97);
       
       
       
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
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
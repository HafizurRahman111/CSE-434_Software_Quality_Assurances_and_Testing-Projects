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
import javafx.scene.layout.HBox;
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
import javafx.collections.FXCollections;

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
    
    ImageView PhotoView;
 
    
    @Override
     public void start(Stage stage) throws Exception
    {
        
      Text title = new Text();                      //Text object Created for Title here
      
      Text contactinfo = new Text();                // Text Object for Contact Information created
   
      Text name = new Text();                      // Text Object for Name created
      TextField nameField = new TextField();       // Input Field Object created for Name  
           
      Text caddress = new Text();                    // Text Object for Current Address created
      TextField caddressField = new TextField();     // Input Field Object created for Current Address  
      
      Text contact = new Text();                    // Text Object for Contact Number created
      TextField contactField = new TextField();     // Input Field Object created for Contact Number 
      
      Text email = new Text();                     // Text Object for Contact email created
      TextField emailField = new TextField();      // Input Field Object created for email
         
      Text careerinfo = new Text();               // Text Object for Career Objective created
        
      TextArea careerObjective = new TextArea();  // Multiline Text Input Box for Career Objective
      VBox careerInput = new VBox(careerObjective);  

      Text personalinfo = new Text();                // Text Object for Personal Information created
      
      
      Text faname = new Text();                      // Text Object for Father's Name created
      TextField fanameField = new TextField();       // Input Field Object created for Father's Name  
      
      Text motname = new Text();                      // Text Object for Mother’s Name created
      TextField motnameField = new TextField();       // Input Field Object created for Mother’s Name
      
      Text perAddress = new Text();                   // Text Object for Permanent Address created
      TextField perAddressField = new TextField();     // Input Field Object created for Permanent Address
      
      Text dobText = new Text();                   // Text Object for DOB created 
      DatePicker dobPicker = new DatePicker();    // Date Picker Object Created for DOB 
      HBox dobhBox = new HBox(dobPicker);         // Box created for DOB

      Text nationality = new Text();                      // Text Object for Nationality created
      TextField nationalityField = new TextField();       // Input Field Object created for Nationality  
      
      Text gender = new Text();                      // Text Object for Gender created
      ChoiceBox genderbox = new ChoiceBox(FXCollections.observableArrayList("Male", "Female", "Others") );  // Gennder Choice Box Object Created
  
      
      
      Button btnImageLoad = new Button("Upload Your Photo Here");  // Photo Upload Button With Text
      
      PhotoView = new ImageView();                                 // Photo View Object Created
      
      VBox PhotoBox = new VBox();                                  // Photo Upload And Control  
        
      PhotoBox.getChildren().addAll(btnImageLoad, PhotoView);
      
           btnImageLoad.setOnAction(new EventHandler<ActionEvent>()
          {
             @Override
             
                  public void handle(ActionEvent photo_upload) 
                {
                  FileChooser photoChooser = new FileChooser();
                
                  FileChooser.ExtensionFilter extnFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
                  FileChooser.ExtensionFilter extnFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
                  FileChooser.ExtensionFilter extnFilterGIF = new FileChooser.ExtensionFilter("GIF files (*.gif)", "*.GIF");
           
                  photoChooser.getExtensionFilters().addAll(extnFilterJPG,extnFilterPNG,extnFilterGIF);
                  
                  File Photofile = photoChooser.showOpenDialog(stage);
                  
                  
                  
                     try 
                    {
                       BufferedImage buffImage = ImageIO.read(Photofile);
                       Image photo_file = SwingFXUtils.toFXImage(buffImage, null);
                       PhotoView.setImage(photo_file);  
                
                     } 
                     
                     catch (IOException excp) 
                     {
                        Logger.getLogger(CSE434Project01ResumeBuilder.class.getName()).log(Level.SEVERE, null, excp);
                     }
                 
                }
               
                  
          });
          
          
          
    
      
      
      Group form_gui = new Group(title, contactinfo, name,nameField ,caddress,
              caddressField,contact,contactField,email,emailField,careerinfo,
              careerInput,btnImageLoad,PhotoView,PhotoBox,personalinfo,faname,
              fanameField,motname,motnameField,perAddress,perAddressField,dobText,
              dobhBox,nationality,nationalityField,gender,genderbox
              
              
              
              
);   // Group object created here 
      
      
      
      Scene scene = new Scene(form_gui, 910, 700);             // Scene object Created Here
      
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
     
      contactinfo.setX(15);                //Position of the contact information text 
      contactinfo.setY(75);
      contactinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));//Font Settings for Text Title 
      contactinfo.setStrokeWidth(1);       //  Stroke size 
      contactinfo.setUnderline(true);  
           
      // Name 
      name.setText("Name :");  // Name Text
      name.setX(30);           //Position of the name text 
      name.setY(116);
      name.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Name Text  
               
      // Input Field For Name
      
      nameField.setLayoutX(180);  // Position setup for Name Input Field
      nameField.setLayoutY(100);
            
      // Current Address 
      
      caddress.setText("Current Address :");  //Current Address Text
      caddress.setX(30);           //Position of the Current Address text 
      caddress.setY(146);
      caddress.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Current Address Text  
      
      caddressField.setLayoutX(180);  // Position setup for Current Address Input Field
      caddressField.setLayoutY(130);
      
      // Contact Number 
      
      contact.setText("Contact Number :");  //Contact Number Text
      contact.setX(30);           //Position of the Contact Number 
      contact.setY(180);
      contact.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Contact Number Text  
      
      contactField.setLayoutX(180);  // Position setup for Contact Number Input Field
      contactField.setLayoutY(160);
      
      // Email
      
      email.setText("Email :");  //Contact Number Text
      email.setX(30);           //Position of the Contact Number 
      email.setY(210);
      email.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Contact Number Text  
      
      emailField.setLayoutX(180);  // Position setup for Contact Number Input Field
      emailField.setLayoutY(190);
      
      // Career Objective 
      
       careerinfo.setText("Career Objective :");  // Career Objective Text Title Here 
         
       careerinfo.setX(15);                //Position of the Career Objective Text 
       careerinfo.setY(280); 
       careerinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));//Font Settings for Text Title 
       careerinfo.setStrokeWidth(1);       //  Stroke size 
       careerinfo.setUnderline(true);  
       
       
       careerInput.setLayoutX(180);  //  Position setup for Career Objective Input Field
       careerInput.setLayoutY(280);  
       careerInput.setPrefWidth(180);   // Setup position Career Objective Input Box
       careerInput.setPrefHeight(60);
       
      // Photo Upload Field With Posiiton
      
       btnImageLoad.setLayoutX(710);  // Photo Upload Field Position
       btnImageLoad.setLayoutY(65);
       
       // Photo View
       
       PhotoView.setFitWidth(135);      
       PhotoView.setFitHeight(160);
       
       PhotoView.setLayoutX(715);  // Photo View Frame Position with size
       PhotoView.setLayoutY(92);

      
       // Personal Informations  
      
      personalinfo.setText("Personal Information :");  // Personal Information Text Title Here
     
      personalinfo.setX(355);                          //Position of the Personal Information text 
      personalinfo.setY(75);
      personalinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));   //Font Settings  
      personalinfo.setStrokeWidth(1);               //  Stroke size 
      personalinfo.setUnderline(true); 
       
      
      // Father’s Name 
      
      faname.setText("Father’s Name :");  // Father’s Name Text
      faname.setX(370);           //Position of the Father’s Name Text 
      faname.setY(116);
      faname.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Name Text  
               
      // Input Field Father’s Name 
      
      fanameField.setLayoutX(520);  // Position Setup for input field
      fanameField.setLayoutY(98);
      
     
       // Mother's Name  
      
      motname.setText("Mother’s Name :");  // Mother’s Name Text
      motname.setX(370);           //Position of the Mother’s Name Text 
      motname.setY(146);
      motname.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Mother’s Name 
               
      // Input Field for Mother’s Name 
      
      motnameField.setLayoutX(520);  // Position Setup for input field
      motnameField.setLayoutY(130);
      
      
     // Permanent Address 
     
      perAddress.setText("Permanent Address :");  // Permanent Address Text
      perAddress.setX(370);                   //Position of Permanent Address Text 
      perAddress.setY(176);
      perAddress.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Permanent Address
               
      // Input Field for Permanent Address
      
      perAddressField.setLayoutX(520);      // Position Setup for Permanent Address Input Field
      perAddressField.setLayoutY(160);
     
      // Date Of Birth ( DOB )
      
      dobText.setText("Date Of Birth :");  // Date Of Birth Text
      dobText.setX(370);           //Position of Date Of Birth Text 
      dobText.setY(206);
      dobText.setFont(Font.font("Arial",FontPosture.REGULAR,14)); //Font Settings for Date Of Birth
      
      // DOB Picker Input Box
      dobhBox.setLayoutX(520);      // Position Setup for DOB Picker Input Box
      dobhBox.setLayoutY(190);
          
      //  Nationality
      
      nationality.setText("Nationality :");    // Nationality Text
      nationality.setX(370);                   //Position of Nationality Text 
      nationality.setY(236);
      nationality.setFont(Font.font("Arial",FontPosture.REGULAR,14));  //Font Settings for Nationality
               
      // Input Field for Nationality
      
      nationalityField.setLayoutX(520);        // Position Setup for Nationality Input Field
      nationalityField.setLayoutY(220);
       
      // Gender Choice Box Text
      
      gender.setText("Gender : ");          // Gender Text
      gender.setX(370);                     //Position of Gender Text 
      gender.setY(266);
      gender.setFont(Font.font("Arial",FontPosture.REGULAR,14));  //Font Settings for Gender
        
      // Gender Choice Box Position Setup 
      
      genderbox.setLayoutX(520);            // Position Setup for Gender Choice Box
      genderbox.setLayoutY(250);
      
   
       stage.setScene(scene);            // Scene added in stage       
       stage.show();                     //  Stage elements show 
        
          
    }

     
     
     
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
         launch(args);
    }
    
     
     
   
    
  
}
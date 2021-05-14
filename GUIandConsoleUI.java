package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIandConsoleUI extends Application {

    public void start(Stage primaryStage) {
        home(primaryStage);
    }

    public static void home(Stage primaryStage){

        primaryStage.setTitle("Gym Management System");
        //setting the title of the GUI

        AnchorPane anchorPane = new AnchorPane();
        //initialising the buttons
        Button btn1 = new Button("Search for a member");
        btn1.setMinWidth(200);
        btn1.setId("btnstyle");
        Button btn2 = new Button("View all members");
        btn2.setMinWidth(200);
        btn2.setId("btnstyle");
        Button btn3 = new Button("Help");
        btn3.setMinWidth(200);
        btn3.setId("btnstyle");
        Button btn4 = new Button("Exit");
        btn4.setMinWidth(200);
        btn4.setId("btnstyle");

        btn1.setLayoutX(250);
        btn1.setLayoutY(300);

        btn2.setLayoutX(250);
        btn2.setLayoutY(350);

        btn3.setLayoutX(250);
        btn3.setLayoutY(400);

        btn4.setLayoutX(250);
        btn4.setLayoutY(450);

        btn4.setOnAction(event -> { //adding the action to  the button (back)
            Stage stage = (Stage) btn4.getScene().getWindow();
            stage.close();
        });

        btn2.setOnAction(event -> { //opening the view members window
            primaryStage.close();
            Stage stage2 = new Stage();
            stage2.setTitle("View members");

            AnchorPane anchorPane1 = new AnchorPane();
            anchorPane1.setId("view");

            TableView ViewMembers = new TableView(); //creating the columns of the table view
            TableColumn clmn1 = new TableColumn<>("Membership ID");
            clmn1.setMinWidth(160);
            clmn1.setCellValueFactory(new PropertyValueFactory<>("Membership ID"));
            TableColumn clmn2 = new TableColumn<>("Name");
            clmn2.setMinWidth(160);
            clmn2.setCellValueFactory(new PropertyValueFactory<>("Name"));
            TableColumn clmn3 = new TableColumn<>("Age");
            clmn3.setMinWidth(160);
            clmn3.setCellValueFactory(new PropertyValueFactory<>("age"));
            TableColumn clmn4 = new TableColumn<>("Name of the school");
            clmn4.setCellValueFactory(new PropertyValueFactory<>("schoolName"));
            clmn4.setMinWidth(160);
            TableColumn clmn5 = new TableColumn<>("Contact No.");
            clmn5.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
            clmn5.setMinWidth(160);

            ViewMembers.setMaxSize(800,600);
            ViewMembers.setMinSize(800,600);
            ViewMembers.setLayoutX(100);
            ViewMembers.setLayoutY(100);


            Button backbtn = new Button("Home");
            backbtn.setLayoutX(100);
            backbtn.setLayoutY(730);

            backbtn.setOnAction(event1 -> {
                    stage2.close();
                    primaryStage.show();
            });

            ViewMembers.getColumns().addAll(clmn1,clmn2,clmn3,clmn4,clmn5); //adding the columns to the table view

            anchorPane1.getChildren().addAll(ViewMembers,backbtn);//add items to the anchorPane1
            Scene scene2 = new Scene(anchorPane1, 1000, 800);//adding anchorPane1 to the scene
            scene2.getStylesheets().add(GUIandConsoleUI.class.getResource("style3.css").toExternalForm()); //adding the external style sheet to the workspace
            stage2.setScene(scene2);
            stage2.show();
            stage2.setResizable(false);



        });

        btn1.setOnAction(event -> { //opening the  search for a member window
            primaryStage.close();
            Stage stage3 = new Stage();
            stage3.setTitle("Search for a member");

            AnchorPane anchorPane2 = new AnchorPane();
            anchorPane2.setId("search");

            TableView Searchformember = new TableView();//creating the columns of the Search for a member table view
            TableColumn clmn1 = new TableColumn<>("Membership ID");
            clmn1.setMinWidth(160);
            clmn1.setCellValueFactory(new PropertyValueFactory<>("Membership ID"));
            TableColumn clmn2 = new TableColumn<>("Name");
            clmn2.setMinWidth(160);
            clmn2.setCellValueFactory(new PropertyValueFactory<>("Name"));
            TableColumn clmn3 = new TableColumn<>("Age");
            clmn3.setMinWidth(160);
            clmn3.setCellValueFactory(new PropertyValueFactory<>("age"));
            TableColumn clmn4 = new TableColumn<>("Name of the school");
            clmn4.setCellValueFactory(new PropertyValueFactory<>("schoolName"));
            clmn4.setMinWidth(160);
            TableColumn clmn5 = new TableColumn<>("Contact No.");
            clmn5.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
            clmn5.setMinWidth(160);

            Searchformember.getColumns().addAll(clmn1,clmn2,clmn3,clmn4,clmn5);//adding the columns to the search for a member tableview

            Searchformember.setMaxSize(800,600);
            Searchformember.setMinSize(800,600);
            Searchformember.setLayoutX(100);
            Searchformember.setLayoutY(100);

            TextField tf1 = new TextField();//initialising the search bar
            tf1.setLayoutX(600);
            tf1.setLayoutY(730);
            Button srchbtn = new Button("Search");
            srchbtn.setLayoutX(800);
            srchbtn.setLayoutY(730);

            Button backbtn = new Button("Home");//initialising the search button
            backbtn.setLayoutX(100);
            backbtn.setLayoutY(730);

            backbtn.setOnAction(event12 -> {
                stage3.close();
                primaryStage.show();
            });

            anchorPane2.getChildren().addAll(Searchformember,backbtn,tf1,srchbtn);//add items to the anchorPane2
            Scene scene3 = new Scene(anchorPane2, 1000, 800);//adding the anchorPane2 to the scene
            scene3.getStylesheets().add(GUIandConsoleUI.class.getResource("style3.css").toExternalForm());
            stage3.setScene(scene3);
            stage3.show();
            stage3.setResizable(false);

            });

        btn3.setOnAction(event -> {
            Stage stage4 = new Stage();
            AnchorPane anchorPane3 = new AnchorPane();
            Button btnhelp = new Button("Home");

            btnhelp.setLayoutX(100);
            btnhelp.setLayoutY(500);

            btnhelp.setOnAction(event13 -> {
                stage4.close();
                primaryStage.show();

            });

            anchorPane3.getChildren().addAll(btnhelp);//add items to the anchorPane3
            Scene scene2 = new Scene(anchorPane3, 1000, 600);//adding the anchorPane3 to the scene
            stage4.setScene(scene2);
            stage4.show();
            stage4.setResizable(false);
            });

        anchorPane.setId("Home");
        anchorPane.getChildren().addAll(btn1,btn2,btn3,btn4);
        Scene scene1 = new Scene(anchorPane, 700, 600);
        scene1.getStylesheets().add(GUIandConsoleUI.class.getResource("style3.css").toExternalForm());//adding the external stylesheet to the workspace
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);

    }
    private final static MyGymManager managethesystem = new MyGymManager();//an object called managethesystem is been created from the class MyGymManager
    private static int count = 0 ; //count for maximum 100 members
    public static void main(String[] args) {

while (true) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n"); //adding the options to the console UI
    System.out.println("--------- Gym Management System ---------\n");
    System.out.println("1. Add a new Member");
    System.out.println("2. Delete a Member");
    System.out.println("3. Print the list of Members ");
    System.out.println("4. Sort the items");
    System.out.println("5. Write/Save in a File");
    System.out.println("6. Open the Graphical User Interface");
    System.out.println("Click Q to exit the programme\n");

    System.out.print("Enter your Request : ");//getting the user's request to the system
    String UserRequest = sc.nextLine();

    if (UserRequest.equals("1")) { //initialising the functions according to the user input
        addmember();//creating a method to add a member to the system

    } else if (UserRequest.equals("2")) {
        deletemember();//the method to delete a member from the system

    } else if (UserRequest.equals("3")) {
        managethesystem.listofmembers();//calling the method listofmembers from the class MyGymManager

    } else if (UserRequest.equals("4")) {
        managethesystem.sortlist();//the method sortlist is been called from the class MyGymManager

    } else if (UserRequest.equals("5")) {
        WriteToFile writer = new WriteToFile();//creating an object from the WriteToFile class
        ArrayList<DefaultMembers> memberList = managethesystem.getMemberList();//
        writer.writeToFile(memberList,"pp2cw2.txt"); //write the member list to the file pp2cw2.txt
    } else if (UserRequest.equals("6")) {
        launch(args);
    } else if (UserRequest.equalsIgnoreCase("Q")) { //exiting the programme
        System.out.println("Program successfully terminated \nGood bye !");
        break;
    }else {
        System.out.println("Please Enter a Valid Input !!!"); //validation if the user inputs anything apart from the options given
    }
}

    }


    private static void deletemember() { //deleting a member from the system using the method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the membership ID of the member you want deleted : ");
        String delmember = sc.next();//getting the membership id that the user entered
        boolean booleanresult = managethesystem.deletemember(delmember);//assigning that membership ID that the user entered as the parameter of the method //deleting the member from the method deletmember from the class MyGymManager using the object created managethesystem
        if(booleanresult){
            count--; //number of slots available should be increased if a member gets deleted
        }
    }

    private static void addmember() { //adding a member to the system
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        if (count < 100) { //the number of members in the system should always be less than 100
            System.out.print("\nEnter the membership ID : "); //get member details
            String memberid = sc.next();
            System.out.print("Enter the member name : ");
            String membername = sc.next();
            System.out.print("Enter the membership start date (please use the format dd/mm/yyyy) : ");
            String date = sc.next();
            System.out.print("Enter member contact number : ");
            String contact = sc.next();
            System.out.println("Enter the type of the membership,\ns - Student member \no - Over60 member \nd - Default member");//get member type
            String membertype = sc.next();
            DefaultMembers member = null;
            if (membertype.equalsIgnoreCase("d")) {//ignore the case of the data that the user entered
                member = new DefaultMembers(membername, memberid, date, contact);
                //passing the parameters in order from the DefaultMembers class
                managethesystem.addmember(member);
                count++;
                //the members in the system should increase when a member in added to the system

            } else if (membertype.equalsIgnoreCase("s")) {
                //get school name only if it's a student member
                System.out.print("Enter school name : ");
                String sclname = sc.next();
                member = new StudentMembers(membername, memberid, date, contact, sclname);
                //passing the parameters in order to the StudentMembers class
                managethesystem.addmember(member);
                count++;
                //the members in the system should increase when a member in added to the system

            } else if (membertype.equalsIgnoreCase("o")) {
                System.out.print("Enter your age : "); //get age only if it's a Over sixty member
                int memage = sc.nextInt();
                if(memage > 60) {
                    member = new Over60Members(membername, memberid, date, contact, memage);
                    //passing the parameters in order to the Over60Members class
                    managethesystem.addmember(member);
                    count++;
                    //the members in the system should increase when a member in added to the system
                }else {
                    System.out.println("Invalid age entered, age is lower then 60");
                }
            } else {
                System.out.println("Invalid input entered");
            }

        }
        else {
            System.out.println("No vacant slots available");
            //if all 100 slots are filled display this message
        }
    }
}

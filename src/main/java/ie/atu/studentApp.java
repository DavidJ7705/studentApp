package ie.atu;

import java.util.Scanner;
public class studentApp {
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;
}

//default constructor
public studentApp(){
    this.firstName=" ";
    this.lastName=" ";
    this.email=" ";
    this.courseName=" ";
}

//constructor
    public studentApp(String firstName,String lastName,String email,String courseName) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
    this.courseName=courseName;
    }

//method to receive user inputs
    public void userInput(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first name: ");
    this.firstName = scanner.nextLine();

    System.out.print("Enter Last name: ");
    this.lastName = scanner.nextLine();

    System.out.print("Enter email: ");
    this.email = scanner.nextLine();

    System.out.print("Enter course name: ");
    this.courseName = scanner.nextLine();
    }
//method to display user info
    public void displayInfo(){
    System.out.println("Name: "+firstName+" "+lastName+"\n");
    System.out.println("Email: "+email+"\n");
        System.out.println("Course Name: "+courseName+"\n");
    }
}

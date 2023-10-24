package ie.atu;

import java.util.Scanner;
public class StudentApp{
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;

//default constructor
public StudentApp(){
    this.firstName=" ";
    this.lastName=" ";
    this.email=" ";
    this.courseName=" ";
}

//constructor
    public StudentApp(String firstName,String lastName,String email,String courseName) {
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
    System.out.println("\n");
    }

    /* Getters and Setters */

    // Getter for First Name
    public String getFirstName(){return firstName;}
    // Setter for first name
    public void setFirstName(String newFirstName){this.firstName=newFirstName;}

    // Getter for Last Name
    public String getLastName(){return lastName;}
    // Setter for Last name
    public void setlastName(String newLastName){this.firstName=newLastName;}

    // Getter for Email
    public String getEmail(){return email;}
    // Setter for Email
    public void setEmail(String newEmail){this.email=newEmail;}

    // Getter for Course
    public String getCourse(){return courseName;}
    // Setter for Course
    public void setCourse(String newCourse){this.courseName=newCourse;}

//method to display user info
    public void displayInfo(){
    System.out.println("Name: " + getFirstName() + " " + getLastName());
    System.out.println("Email: "+getEmail() + "\n");
    System.out.println("Course Name: "+getCourse() +"\n");
    }
}

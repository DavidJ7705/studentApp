package ie.atu;

import java.util.Scanner;
public class Student{
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;

//default constructor
public Student(){
    this.firstName="firstDef";
    this.lastName="lastDef";
    this.email="emailDef";
    this.courseName="courseDef";
}

//constructor
    public Student(String firstName,String lastName,String email,String courseName) {
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

    /* Getters */

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getCourseName(){
        return courseName;
    }

    /* Setters */

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }


//method to display user info for 3 students


    public void displayInfoStudent1(){
        System.out.println("\nName: " + getFirstName() + " "+getLastName()+  "\nStudent Email: " + getEmail() + "\nCourse Name: " + getCourseName());
    }
}

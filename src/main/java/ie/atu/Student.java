package ie.atu;

import java.util.Scanner;
public class Student{
    //student 1 strings
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;
    //student 2 strings
    private String first2;
    private String last2;
    private String email_2;
    private String courseName_2;
    //student 3 strings
    private String first3;
    private String last3;
    private String email3;
    private String courseName3;

    //default constructor
    public Student(){
        this.firstName="firstDef";
        this.lastName="lastDef";
        this.email="emailDef";
        this.courseName="courseDef";
    }
    //constructor for name of student 2
    public Student(String firstName_2,String lastName_2){
        this.first2 = firstName_2;
        this.last2=lastName_2;
    }

    //constructor for student 3
    public Student(String first3,String last3,String email3,String courseName3) {
    this.first3=first3;
    this.last3=last3;
    this.email3=email3;
    this.courseName3=courseName3;
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

    public String getEmail_2(){
        return email_2;
    }
    public String getCourseName_2(){
        return courseName_2;
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

    public void setEmail_2(String email_2)
    {
        this.email_2=email_2;
    }
    public void setCourseName_2(String courseName_2)
    {
        this.courseName_2=courseName_2;
    }

    //method to display user info for 3 students
    public void displayInfoStudent1(){
        System.out.println("\nName: " + getFirstName() + " "+getLastName()+  "\nStudent Email: " + getEmail() + "\nCourse Name: " + getCourseName());
    }
    public void displayInfoStudent2() {
        System.out.println("\nName: " + first2 +" "+ last2 + "\nStudent Email: " + getEmail_2() + "\nCourse Name: " + getCourseName_2());
    }
    public void displayInfoStudent3() {
        System.out.println("\nName: " + first3 + " "+last3+ "\nStudent Email: " + email3 + "\nCourse Name: " + courseName3);
    }
}

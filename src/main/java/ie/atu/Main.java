package ie.atu;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //These 2 strings are for the constructors for student 2 & 3
    String first2,last2;
    String first3,last3, email3,course3;

    /* Student 1 only using setters and getters */
    Student student1 = new Student();
    System.out.print("Enter First Name: ");
    student1.setFirstName(scanner.nextLine());
    System.out.print("Enter Last Name: ");
    student1.setLastName(scanner.nextLine());
    System.out.print("Enter Email: ");
    student1.setEmail(scanner.nextLine());
    System.out.print("Enter Course Name: ");
    student1.setCourseName(scanner.nextLine());

    /* Student 2 using gets/sets for email & course. Constructor for name */
    System.out.print("\nEnter First Name: ");
    first2= scanner.nextLine();
    System.out.print("Enter Last Name: ");
    last2= scanner.nextLine();
    Student student2 = new Student(first2, last2);

    System.out.print("Enter Email: ");
    student2.setEmail_2(scanner.nextLine());
    System.out.print("Enter Course Name: ");
    student2.setCourseName_2(scanner.nextLine());

    /* student 3 only using Constructors for all 3 parameters */
    System.out.print("\nEnter First Name: ");
    first3= scanner.nextLine();
    System.out.print("Enter Last Name: ");
    last3= scanner.nextLine();
    System.out.print("Enter Email: ");
    email3= scanner.nextLine();
    System.out.print("Enter Course Name: ");
    course3= scanner.nextLine();
    Student student3 = new Student(first3,last3,email3,course3);

    /* Displaying all student stats */
    student1.displayInfoStudent1();
    student2.displayInfoStudent2();
    student3.displayInfoStudent3();
    }
}
package ie.atu;

import java.util.Scanner;
public class studentApp {
    private String firstName;
    private String lastName;
    private String email;
    private String courseName;
}

// **** getters and setters ****

    //getter for first name
    public String  getFirstName(){
        return firstName;
    }

    //setter for first name
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    //getter for last name
    public String  getLastName(){
        return lastName;
    }
    //setter for last name
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

}

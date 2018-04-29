// Class:       IT5413
// Term:        Spring 2018
// Name:        Sindhuja Gullapalli
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

/* 
Creating Student class 
based on the UML diagram 
Declaring Instance/Class Variables
name: String
email: String
internshipType: String
internshipSemester: String

Methods used
getName()
setName(String n)
getEmail()
setEmail(String e)
getInternshipType()
setInternshipType(String it)
getInternshipSemester()
setInternshipSemester(String is)
 */

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

/**
 *
 * @author sindh
 */
public class Student {

    //Instance variables
    private String name;
    private String email;
    private String internshipType;
    private String internshipSemester;

    //Default constructor
    public Student() {
        // Set default values to instance variables
        name = "";
        email = "";
        internshipType = "";
        internshipSemester = "";

    }
    

    //Constructor initializing instance variables with arguments
    public Student(String n, String e, String it, String is) {
        //initialize instance variables with values
        name = n;
        email = e;
        internshipType = it;
        internshipSemester = is;

    }

    // Set the name of the student
    public void setName(String n) {
        name = n;
    }

    // Set the email of the student
    public void setEmail(String e) {
        email = e;
    }

    // Set the internship type the student is seeking
    public void setInternshipType(String it) {
        internshipType = it;
    }

    // Set the internship semester
    public void setInternshipSemester(String is) {
        internshipSemester = is;
    }

    // Get the name of the student
    public String getName() {
        return name;
    }

    // Get the email of the student
    public String getEmail() {
        return email;
    }

    // Get the internship type the student is seeking
    public String getInternshipType() {
        return internshipType;
    }

    // Get internship semester
    public String getInternshipSemester() {
        return internshipSemester;
    }

}//end Class

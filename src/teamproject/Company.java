// Class:       CS 5000/01
// Term:        Spring 2018
// Name:        Stacey M. Tanner
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

/*

Create the Company Information portion of a Class Project 
by creating the the following information:
a. Company:
b. Contact:
c. Contact Email: 
d. Internship Title:
e. Whether internship is paid or unpaid: 
f. Type of Internship(s) offered (Programming, Web Developer, Security,  Information Technology,Web Development, Database,
g. Semester for Internship: Summer 2018,  Fall 2018, Spring 2019

 */

package teamproject;

import java.util.*;

public class Company {
    
    // contributed by Stacey M. Tanner 
    //main method begins program execution
    // Instance variable of CollegeInternships
  
    private String companyName;
    private String contactName;
    private String contactEmail;
    private ArrayList<CompanyInternship> 
        offeredInternships = new ArrayList<>();
    
    // Default Constructor
    public Company() {
        
    }
    
    // Constructor
    public Company(String companyName, String contactName, String contactEmail, CompanyInternship ... internships) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        
        for (CompanyInternship internship : internships) {
            this.offeredInternships.add(internship);
        }
    }
    //This format was created in the UML
    public String getCompanyName() {
        // // get method for Company Name
        return companyName;
    }
    
    public String getContactEmail() {
        // get method for Contact Email
        return contactEmail;
    }
    
    public String getContactName() {
        // get method for Contact Name
        return contactName;
    }
    
    public void setCompanyName(String name) {
        // set Method of Contact
        companyName = name;
    }
    
    public void setContactEmail(String email) {
        // set method of Contact Email
        contactEmail = email;
    }
    
    public void setContactName(String name) {
        // set method of Contact Name
        contactName = name;
    }
    
    public ArrayList<CompanyInternship> getOfferedInternships() {
        return offeredInternships;
    }
    
    public void addInternship(String title, String type, boolean paid, String semester) {
        CompanyInternship internship = new CompanyInternship(title, type, paid, semester);
        offeredInternships.add(internship);
    }
    
    public void addInternship(CompanyInternship internship) {
        offeredInternships.add(internship);
    }
    
    // This method will remove the first element of the list that matches the name.
    // If the element is not found, it doesnot do anything.
    
    public void removeInternship(String title) {
        for (int i = 0; i < offeredInternships.size(); i++) {
            if (offeredInternships.get(i).getInternshipTitle().equals(title)) {
                offeredInternships.remove(i);
                return;
            }
        }
        return;
    }
    
    // This returns the true if company supports the internshipType passed.
    public boolean checkInternshipOffered(
            String internshipType) {
        
        for (int i = 0; i < offeredInternships.size(); i++) {
            if (offeredInternships.get(i).getInternshipType().equals(internshipType)) {
                return true;
            }
        }
        return false;
    }
}

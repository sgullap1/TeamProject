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

import java.util.Scanner;
import java.util.*;

public class Company {
    
    // main method begins program execution
    // Instance variable of CollegeInternships
  
    private String companyName;
    private String contactName;
    private String contactEmail;
    private ArrayList<CompanyInternship> 
        offeredInternships = new ArrayList<>();
    
    // main added to test the class
    public static void main(String [] args ) {
        ArrayList<Company> companies = new ArrayList<>();
        companies.add(getNewCompany(
            "Google",
            "Jack Sullivan",
            "JSullivan@google.com",
            new CompanyInternship(
                "Information Technology Intern",
                "Programming",
                /* paid = */ true,
                "Fall 2018")));
            
         companies.add(getNewCompany(
            "Apple",
            "Allie Smith",
            "ASmith3@apple.com",
            new CompanyInternship(
                "Software Engineering  Intern: Core iOS",
                "Software Engineering",
                /* paid = */ false,
                "Summer 2018")));
                
         companies.add(getNewCompany(
            "Microsoft",
            "James Matthews",
            "JXMatthews@microsoft.com",
            new CompanyInternship(
                "Web & Content Development",
                "Web Development",
                /* paid = */ true,
                "Spring 2019")));
                
         companies.add(getNewCompany(
            "Microsoft",
            "John Lawrence",
            "JXLawrence@microsoft.com",
            new CompanyInternship(
                "Database Internship",
                "Database",
                /* paid = */ false,
                "Fall 2018" )));
                
         companies.add(getNewCompany(
            "Scratch",
            "Susan Taft",
            "STaft@scratch.mit.edu",
            new CompanyInternship(
                "Video & Graphic Developer",
                "Video Developer",
                /* paid = */ true,
                "Spring 2019")));
                
         companies.add(getNewCompany(
            "Scratch",
            "Carrie Martin",
            "CXMartin@scratch.mit.edu",
            new CompanyInternship(
                "Web Developer",
                "Web Development",
                /* paid = */ false,
                "Fall 2018")));

         companies.add(getNewCompany(
            "Google",
            "Phillip Young",
            "PHYoung@google.com",
            new CompanyInternship(
                "Product Design",
                "Programming",
                /* paid = */ false,
                "Summer 2018")));

         companies.add(getNewCompany(
            "Apple",
            "Lisa Pope",
            "LPopeX@hp@apple.com",
            new CompanyInternship(
                "Product Design",
                "Programming",
                /* paid = */ false,
                "Summer 2018")));

         companies.add(getNewCompany(
            "Samsung",
            "Avery Ryan",
            "ARyan@samsung.com",
            new CompanyInternship(
                "Software Engineering/ Co-Op",
                "Programming",
                /* paid = */ true,
                "Spring 2019")));
      
         companies.add(getNewCompany(
            "Samsung",
            "Michelle Boseman",
            "Mboseman@samsung.com",
            new CompanyInternship(
                "IT/ Computer Systems Intern",
                "Computer Systems",
                /* paid = */ false,
                "Summer 2018")));

    }
    
    public static Company getNewCompany(
        String companyName, 
        String contactName, 
        String contactEmail,
        CompanyInternship ... internships) {
        
        Company newCompany = new Company();
        newCompany.setCompanyName(companyName);
        newCompany.setContactName(contactName);
        newCompany.setContactEmail(contactEmail);
        for (CompanyInternship internship : internships) {
            newCompany.addInternship(internship);
        }
        return newCompany;
    }

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
    
    // This returns the list of the internships that match the type in argument.
    public ArrayList<CompanyInternship> checkInternshipOffered(
            String internshipType) {
        ArrayList<CompanyInternship> result = new ArrayList<>();
        for (int i = 0; i < offeredInternships.size(); i++) {
            if (offeredInternships.get(i).getInternshipType().equals(internshipType)) {
                result.add(offeredInternships.get(i));
            }
        }
        return result;
    }
}
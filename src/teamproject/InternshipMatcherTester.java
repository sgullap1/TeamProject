// Class:       IT5413
// Term:        Spring 2018
// Name:        Tamar McDowell
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

package teamproject;

import java.util.ArrayList;



public class InternshipMatcherTester {
    public static void main(String[] args) {

        //Create few companies
        //true is paid internship
        //false is unpaid internship
        Company companyOne = new Company("Google", "JSullivan@google.com", "Jack Sullivan");
        companyOne.addInternship("BusinessAnalyst", "IT", true);

        Company companyTwo = new Company("Apple", "ASmith3@apple.com", "Allie Smith");
        companyTwo.addInternship("Programer", "IT", false);

        Company companyThree = new Company("Microsoft", "JXMatthews@microsoft.com", "James Matthews");
        companyThree.addInternship("Web & Content Development", "IT", true);
        
        Company companyFour = new Company("Samsung", "Mboseman@samsung.com", "Michelle Bosemane");
        companyFour.addInternship("Database Administrator", "IT", false);
        
        Company companyFive = new Company("Scratch", "STaft@scratch.mit.edu", "Susan Taft");
        companyFive.addInternship("Video & Graphic Developer", "HR", false);
        
        Company companySix = new Company("Scratch", "CXMartin@scratch.mit.edu", "Carrie Martin");
        companySix.addInternship("Payroll", "HR", false);
        
        Company companySeven = new Company("Google", "PHYoung@google.com", "Phillip Young");
        companySeven.addInternship("Product Design", "HR", true);


        //System.out.println(companyOne.getOfferedInternships());

        InternshipMatcher matcher = new InternshipMatcher();
        matcher.addCompany(companyOne);
        matcher.addCompany(companyTwo);
        matcher.addCompany(companyThree);


        Student stuOne = new Student("Tom", "tom@gmail.com", "IT", "FALL");
        Student stuTwo = new Student("Roy", "roy@gmail.com", "HR", "SUMMER");
        Student stuThree = new Student("Mat", "mat@gmail.com", "NETWORKING", "SPRING");
        Student stuFour = new Student("Sam", "sam@gmail.com", "IT", "SUMMER");
        Student stuFive = new Student("Berry", "Berry@gmail.com", "FINANCE", "SUMMER");
        Student stuSix = new Student("Kim", "kim@gmail.com", "FINANCE", "SUMMER");
        Student stuSeven = new Student("Fresh", "Fresh@gmail.com", "FINANCE", "SUMMER");
        
        matcher.addStudent(stuOne);
        matcher.addStudent(stuTwo);
        matcher.addStudent(stuThree);
        matcher.addStudent(stuFour);
        matcher.addStudent(stuFive);
        matcher.addStudent(stuSix);
        matcher.addStudent(stuSeven);


       System.out.println ("Get all Internships ::" + matcher.getAllInterships()) ;

        //System.out.println("Students Per Intership Type::" + matcher.getStudentsPerIntershipType("IT"));

        //System.out.println("Company Match By students:: " + matcher.getCompanyMatchesByStudents(stuOne));

        /* System.out.println("Removing company Facebook");
        matcher.removeCompany(companyTwo);

        System.out.println("Removed::");

        for (Company com : matcher.getAllCompanies()) {
            System.out.println(com);
        }*/


    }
}

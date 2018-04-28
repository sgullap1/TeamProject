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
        Company companyOne = new Company("Google", "goolge.gmail.com", "Larry Jon");
        companyOne.addInternship("BusinessAnalyst", "IT", true);

        Company companyTwo = new Company("Facebook", "facebook.gmail.com", "Mark Zuk");
        companyTwo.addInternship("Programer", "IT", false);

        Company companyThree = new Company("Twitter", "twitter.gmail.com", "Twit Jon");
        companyThree.addInternship("Payroll", "HR", false);


        //System.out.println(companyOne.getOfferedInternships());


        InternshipMatcher matcher = new InternshipMatcher();
        matcher.addCompany(companyOne);
        matcher.addCompany(companyTwo);
        matcher.addCompany(companyThree);


        Student stuOne = new Student("Tom", "tom@gmail.com", "IT", "FALL");
        Student stuTwo = new Student("Roy", "roy@gmail.com", "HR", "SUMMER");
        Student stuThree = new Student("Mat", "mat@gmail.com", "NETWORKING", "SPRING");
        Student stuFour = new Student("Sam", "sam@gmail.com", "IT", "SUMMER");
        Student stuFive = new Student("Kim", "kim@gmail.com", "FINANCE", "SUMMER");

        matcher.addStudent(stuOne);
        matcher.addStudent(stuTwo);
        matcher.addStudent(stuThree);
        matcher.addStudent(stuFour);
        matcher.addStudent(stuFive);


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

// Class:       IT5413
// Term:        Spring 2018
// Name:        Tamar McDowell
// Instructor:  Dr. Lynda Brown
// Assignment:  Group Project

/* 
Creating Internship portion 
based on the UML diagram design
Declaring Instance/Class Variables
companies: ArrayList<Company>
students: ArrayList<Student>
internshipsTypes: ArrayList<string>

Methods used
addCompany (Company c)
removeCompany (Company c)
addStudent (Student s)
removeStudent (Student s)
GetAllCompanies ()
GetAllStudents ()
GetAllInternships ()
GetStudentsPerInternshipType (string type)
GetCompanyMatchesByStudent (Student s)
*/


package teamproject;

import java.util.ArrayList;
import java.util.HashSet;

public class InternshipMatcher {
//Class InternshipMatcher
    
    
//Declaring Instanc Variables
    public ArrayList<String> intershipTypes;
    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
/* 
list of internships and companies maintained here
based on the following information:
Company:
Contact:
Contact Email: 
Internship Title:
Whether internship is paid or unpaid: 
Type of Internship(s) offered (Programming, Web Developer, Security,  Information Technology,Web Development, Database,
Semester for Internship: Summer 2018,  Fall 2018, Spring 2019
 */
  
//Default Constructor to take arguments
    public InternshipMatcher() {
        this.addExistingCompanies();
    }
    
    private void addExistingCompanies() {
//method to add companies
        companies.add(new Company( "Google", "Jack Sullivan", "JSullivan@google.com", 
        new CompanyInternship("Information Technology Intern","Programming", /* paid = */ true, "Fall 2018")));
            
         companies.add(new Company("Apple", "Allie Smith", "ASmith3@apple.com", 
         new CompanyInternship("Software Engineering  Intern: Core iOS", "Software Engineering", /* paid = */ false, "Summer 2018")));
                
         companies.add(new Company("Microsoft", "James Matthews", "JXMatthews@microsoft.com",
         new CompanyInternship("Web & Content Development", "Web Development", /* paid = */ true, "Spring 2019")));
                
         companies.add(new Company("Microsoft", "John Lawrence", "JXLawrence@microsoft.com", 
         new CompanyInternship("Database Internship", "Database", /* paid = */ false, "Fall 2018" )));
                
         companies.add(new Company("Scratch", "Susan Taft", "STaft@scratch.mit.edu", 
         new CompanyInternship("Video & Graphic Developer", "Video Developer", /* paid = */ true, "Spring 2019")));
                
         companies.add(new Company("Scratch", "Carrie Martin", "CXMartin@scratch.mit.edu",
         new CompanyInternship("Web Developer", "Web Development", /* paid = */ false, "Fall 2018")));

         companies.add(new Company("Google", "Phillip Young", "PHYoung@google.com",
         new CompanyInternship("Product Design", "Programming", /* paid = */ false, "Summer 2018")));

         companies.add(new Company("Apple", "Lisa Pope", "LPopeX@hp@apple.com",
         new CompanyInternship("Product Design", "Programming", /* paid = */ false, "Summer 2018")));

         companies.add(new Company("Samsung", "Avery Ryan", "ARyan@samsung.com",
         new CompanyInternship("Software Engineering/ Co-Op", "Programming", /* paid = */ true, "Spring 2019")));
      
         companies.add(new Company("Samsung", "Michelle Boseman", "Mboseman@samsung.com", 
         new CompanyInternship("IT/ Computer Systems Intern", "Computer Systems", /* paid = */ false, "Summer 2018")));
    }
    
    //method to add company
    public void addCompany(Company c) {
        getAllCompanies().add(c);
    }
    //method to remove company
    public void removeCompany(Company c) {
        getAllCompanies().remove(c);
    }
    
   //method to add student
    public void addStudent(Student s) {
        getAllStudents().add(s);
    }

    //method to remove student
    public void removeStudent(Student s) {
        getAllStudents().remove(s);
    }

    public ArrayList<Company> getAllCompanies() {
        // get method for Company
        return companies;
    }

    public ArrayList<Student> getAllStudents() {
        // get method for Student
        return students;
    }

    public ArrayList<String> getAllInterships() {
        // get method for Internship Name  
        
        intershipTypes = new ArrayList<String>();
        //store each internship types 
        for (Company com : getAllCompanies()) {
            //System.out.println(com);
            for (CompanyInternship intern : com.getOfferedInternships()) {
                intershipTypes.add(intern.getInternshipType());
            }
        }
        return removeDuplicates(intershipTypes);
    }

    private ArrayList<String> removeDuplicates(ArrayList<String> list) {
        // Store unique items in result.
        ArrayList<String> result = new ArrayList<>();

        // Record encountered Strings in HashSet.
        HashSet<String> set = new HashSet<>();

        // Loop over argument list.
        for (String item : list) {

            // If String is not in set, add it to the list and the set.
            if (!set.contains(item)) {
                result.add(item);
                set.add(item);
            }
        }
        return result;
    }
    //check list and get student that matches intern
//    public ArrayList<String> getStudentsPerIntershipType(String s) {
//        ArrayList<String> intStu = new ArrayList<String>();
//        for (Student stu : getAllStudents()) {
//            if (stu.getInternShipType().equalsIgnoreCase(s)) {
//                intStu.add(stu.getName());
//            }
//        }
//        return intStu;
//    }
    //check list of company and get company that matches student
    public ArrayList<Company> getCompanyMatchesByStudents(Student s) {
        ArrayList<Company> stuCom = new ArrayList<Company>();
/* to find matches, loop over all internships the companies  offer, 
then loop through all students, and student semester matches,
then check if their type of internship also matches */         
        for (Company com : getAllCompanies()) {
            for (CompanyInternship intern : com.getOfferedInternships()) {
                if (intern.getInternshipType().equalsIgnoreCase(s.getInternshipType())) {
                    stuCom.add(com);
                }
            }

        }
        return stuCom;
    }
    
//    public ArrayList<Company> getCompanyMatchesByStudent(Student s) {
//        ArrayList<Company> matchingCompanies = new ArrayList<Company>();
//        
//        for (int i = 0; i < this.companies.size(); i++) {
//            if (this.companies.get(i).checkInternshipOffered(s.getInternshipSemester())) {
//                matchingCompanies.add(this.companies.get(i));
//            }
//        }
//        
//        return matchingCompanies;
//    }
}  //end Class IntershipMatcher

